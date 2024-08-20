# Write your MySQL query statement below
SELECT *,
    CASE WHEN x+y>z and x+z>y and y+z>x then "Yes" else "No" END
AS triangle From Triangle;