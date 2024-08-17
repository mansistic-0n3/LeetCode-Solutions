# Write your MySQL query statement below
Select product_name, SUM(unit) as unit 
from products JOIN orders ON products.product_id=orders.product_id 
where order_date like "2020-02-%"
group by product_name
HAVING unit >= 100; 