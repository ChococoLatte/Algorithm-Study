SELECT WAREHOUSE_ID, WAREHOUSE_NAME, COALESCE(ADDRESS, '') AS ADDRESS, COALESCE(FREEZER_YN, 'N') AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '%경기도%'
ORDER BY WAREHOUSE_ID ASC;