/*
 * Problem: Weather Observation Station 4
 * Problem Description: Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
 */

SELECT COUNT(*)-COUNT(DISTINCT CITY) AS Difference
FROM STATION;
