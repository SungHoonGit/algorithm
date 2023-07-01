import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        return new Table(data, 1, col)
                .hash(row_begin, row_end);
    }

    private static class Table {
        private final List<Row> rows;

        public Table(int[][] data, int primaryKeyColumn, int targetColumn) {
            List<Column> columns = IntStream.range(0, data[0].length)
                    .mapToObj(i -> new Column(primaryKeyColumn - 1 == i, targetColumn - 1 == i))
                    .collect(Collectors.toList());

            this.rows = Arrays.stream(data)
                    .map(row -> IntStream.range(0, row.length)
                            .mapToObj(j -> new RowValue(row[j], columns.get(j)))
                            .collect(Collectors.collectingAndThen(Collectors.toList(), Row::new)))
                    .sorted()
                    .collect(Collectors.toList());
        }

        public Integer hash(Integer fromIndex, Integer toIndex) {
            return IntStream.rangeClosed(fromIndex - 1, toIndex - 1)
                    .map(i -> rows.get(i).calculateHashSource(i + 1))
                    .reduce(0, (previous, current) -> previous ^ current);
        }
    }

    private static class Row implements Comparable<Row> {
        private static final Integer DEFAULT_SORTING_COLUMN = 0;
        private final List<RowValue> rowValues;
        private final Integer sortingTargetColumn;
        private final Integer primaryKeyColumn;

        public Row(List<RowValue> rowValues) {
            this.rowValues = rowValues;
            this.sortingTargetColumn = IntStream.range(0, rowValues.size())
                    .filter(i -> rowValues.get(i).isSortingTargetColumnValue())
                    .findAny()
                    .orElse(DEFAULT_SORTING_COLUMN);
            this.primaryKeyColumn = IntStream.range(0, rowValues.size())
                    .filter(i -> rowValues.get(i).isPrimaryKeyValue())
                    .findAny()
                    .orElse(DEFAULT_SORTING_COLUMN);
        }

        public Integer calculateHashSource(Integer factor) {
            return rowValues.stream()
                    .mapToInt(RowValue::getValue)
                    .map(value -> value % factor)
                    .sum();
        }

        @Override
        public int compareTo(Row o) {
            int comparingResult = rowValues.get(sortingTargetColumn).getValue()
                    .compareTo(o.rowValues.get(sortingTargetColumn).getValue());

            if (comparingResult == 0) {
                return o.rowValues.get(primaryKeyColumn).getValue()
                        .compareTo(rowValues.get(primaryKeyColumn).getValue());
            }

            return comparingResult;
        }
    }

    private static class Column {
        private final boolean isPrimaryKey;
        private final boolean isSortingTargetColumn;

        public Column(boolean isPrimaryKey, boolean isSortingTargetColumn) {
            this.isPrimaryKey = isPrimaryKey;
            this.isSortingTargetColumn = isSortingTargetColumn;
        }

        public boolean isPrimaryKey() {
            return isPrimaryKey;
        }

        public boolean isSortingTargetColumn() {
            return isSortingTargetColumn;
        }
    }

    private static class RowValue {
        private final Integer value;
        private final Column column;

        public RowValue(Integer value, Column column) {
            this.value = value;
            this.column = column;
        }

        public boolean isSortingTargetColumnValue() {
            return column.isSortingTargetColumn();
        }

        public boolean isPrimaryKeyValue() {
            return column.isPrimaryKey();
        }

        public Integer getValue() {
            return value;
        }
    }
}