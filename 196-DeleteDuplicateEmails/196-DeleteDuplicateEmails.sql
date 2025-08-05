-- Last updated: 8/5/2025, 12:36:27 PM
# Write your MySQL query statement below
DELETE P FROM Person P
INNER JOIN Person Q
ON P.Email=Q.Email AND P.Id>Q.Id ;