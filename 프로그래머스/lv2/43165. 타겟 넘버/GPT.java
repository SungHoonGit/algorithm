**  Pair 클래스는 깊이 우선 탐색 (DFS)과 너비 우선 탐색 (BFS) 함수에서 사용되는 데이터를 묶어주는 역할을 합니다.  **

    Pair 클래스 구성:
        Pair 클래스는 두 개의 멤버 변수 position과 sum으로 구성됩니다.
        position은 배열에서 현재 탐색 중인 인덱스를 나타내고, sum은 해당 인덱스까지의 숫자들의 합을 나타냅니다.
        이렇게 두 개의 정보를 함께 묶어주는 것으로, 현재 탐색 위치와 그에 따른 합을 유지하면서 탐색을 진행할 수 있도록 도와줍니다.
    
    사용 이유:
        깊이 우선 탐색과 너비 우선 탐색은 각각 재귀적인 방식과 큐를 활용하는 방식으로 모든 경우를 탐색합니다.
        이때, 각 단계마다 현재의 인덱스 위치와 합을 유지해야 합니다.
        Pair 클래스를 사용함으로써 두 가지 정보를 한 번에 저장하고, 탐색 과정에서 정보를 쉽게 유지하고 전달할 수 있습니다.
    
    예시:
        Pair 클래스는 다음과 같이 사용됩니다.
    
        java
        // 깊이 우선 탐색 (DFS) 함수 내에서 사용 예시
            private static int dfs(int[] numbers, int target, int sum, int current) {
                // ...
                Pair p = new Pair(current, sum);
                // ...
            }
            
            // 너비 우선 탐색 (BFS) 함수 내에서 사용 예시
            private static int bfs(int[] numbers, int target) {
                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair(0, numbers[0]));
                // ...
            }
    
        위 코드에서 dfs 함수 내에서는 현재 위치 current와 합 sum을 하나의 Pair 객체로 생성하여 사용합니다. 
        bfs 함수 내에서는 큐에 Pair 객체를 추가하여 해당 정보를 유지하면서 BFS 탐색을 수행합니다. 
        이렇게 Pair 클래스를 사용하면 탐색 과정에서 필요한 정보를 효율적으로 관리할 수 있습니다.
    


    
**  입력값 [4, 1, 2, 1]과 target = 4에 대해서 두 가지 탐색 방법인 DFS(깊이 우선 탐색)과 BFS(너비 우선 탐색)로 문제를 해결 **

* 깊이 우선 탐색 (DFS) *
    DFS는 재귀적으로 모든 경우의 수를 탐색하며, 가능한 모든 조합을 고려합니다.

    DFS 메소드 설명:
        dfs(int[] numbers, int target, int sum, int current): 주어진 숫자 배열 numbers와 target 값, 현재까지의 합 sum, 현재 인덱스 current를 받습니다. 
            이 함수는 재귀적으로 가능한 모든 조합을 탐색하면서 target과 같은 경우의 수를 카운트합니다.
    
    코드 설명:
        함수 dfs는 현재 인덱스 current가 numbers 배열의 길이와 같을 때, 모든 숫자를 다 사용한 상태에 도달했을 때를 처리합니다.
        그리고 현재까지의 합 sum이 target과 같다면, 1을 반환하여 경우의 수를 카운트합니다.
        그렇지 않은 경우, 현재 인덱스의 숫자를 양수로 더한 경우와 음수로 더한 경우를 따로 처리하여 재귀적으로 호출합니다.
        이렇게 모든 경우의 수를 다 탐색하여 최종적으로 가능한 조합의 개수를 반환합니다.
    
    입력 [4, 1, 2, 1], target = 4에 대한 DFS 실행 과정:
        호출 1: dfs([4, 1, 2, 1], 4, 0, 0)
        호출 2: dfs([4, 1, 2, 1], 4, 4, 1) (4를 양수로 더한 경우)
        호출 3: dfs([4, 1, 2, 1], 4, 3, 2) (1을 양수로 더한 경우)
        호출 4: dfs([4, 1, 2, 1], 4, 5, 2) (1을 음수로 더한 경우)
        호출 5: dfs([4, 1, 2, 1], 4, 2, 3) (2를 양수로 더한 경우)
        호출 6: dfs([4, 1, 2, 1], 4, 4, 3) (2를 음수로 더한 경우)
        호출 7: dfs([4, 1, 2, 1], 4, 4, 4) (1을 양수로 더한 경우)
        호출 8: dfs([4, 1, 2, 1], 4, 2, 4) (1을 음수로 더한 경우)
        위의 호출 과정에서 target = 4와 같아지는 경우는 두 가지입니다. 따라서 결과값은 2가 됩니다.


* 너비 우선 탐색 (BFS) *
    BFS는 큐를 사용하여 각 단계마다 모든 경우의 수를 처리합니다.

    BFS 메소드 설명:
        bfs(int[] numbers, int target): 주어진 숫자 배열 numbers와 target 값을 받습니다. 
        이 함수는 큐를 사용하여 모든 경우의 수를 BFS 방식으로 탐색하고, target과 같은 경우의 수를 카운트합니다.
    
    코드 설명:
        BFS 함수는 큐를 초기화하고 시작 인덱스 0에서 시작하는 두 개의 노드를 큐에 추가합니다. 
        큐에서 노드를 하나씩 꺼내며 다음 인덱스로 이동하여 숫자를 더한 경우와 뺀 경우를 각각 큐에 추가합니다. 
        이렇게 큐를 사용하여 모든 경우의 수를 탐색하며, target과 같은 경우의 수를 카운트합니다.
    
    입력 [4, 1, 2, 1], target = 4에 대한 BFS 실행 과정:
        큐 초기화: [0, 4], [0, -4]
        큐에서 노드 꺼냄: [0, 4]
        큐에 추가: [1, 5], [1, 3]
        큐에 추가: [1, 5], [1, 3], [1, 3], [1, 1]
        큐에서 노드 꺼냄: [1, 5]
        큐에 추가: [2, 7], [2, 3]
        큐에 추가: [2, 7], [2, 3], [2, 3], [2, 1]
        큐에서 노드 꺼냄: [2, 7]
        큐에 추가: [3, 8], [3, 6]
        큐에 추가: [3, 8], [3, 6], [3, 4], [3, 2]
        큐에서 노드 꺼냄: [3, 8]
        큐에 추가: [3, 4], [3, 2], [3, 4], [3, 2]
        큐에서 노드 꺼냄: [3, 4]
        큐에 추가: [3, 2], [3, 2], [3, 2], [3, 0]
        큐에서 노드 꺼냄: [3, 2]
        큐에 추가: [3, 0], [3, 4]
        큐에서 노드 꺼냄: [3, 0]
        큐에 추가: [3, 4], [3, 4]
        큐에서 노드 꺼냄: [3, 4]
        큐에 추가: [3, 0]
        큐에서 노드 꺼냄: [3, 0]
        큐에 추가: [3, 4], [3, 2]
        큐에서 노드 꺼냄: [3, 4]
        큐에 추가: [3, 2], [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에 추가: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 0]
        큐에서 노드 꺼냄: [3, 4]
        큐에서 노드 꺼냄: [3, 4]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 0]
        큐에서 노드 꺼냄: [3, 4]
        큐에서 노드 꺼냄: [3, 4]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 2]
        큐에서 노드 꺼냄: [3, 0]
        위의 BFS 실행 과정에서 target = 4와 같아지는 경우는 두 가지입니다. 따라서 결과값은 2가 됩니다.

두 가지 방법으로 모두 target = 4와 같은 경우의 수가 두 개임을 확인할 수 있습니다.
