SELECT FLOOR(PRICE / 10000) * 10000 AS PRICE_RANGE, COUNT(*) AS COUNT
FROM PRODUCT
GROUP BY FLOOR(PRICE / 10000)
ORDER BY PRICE_RANGE;
