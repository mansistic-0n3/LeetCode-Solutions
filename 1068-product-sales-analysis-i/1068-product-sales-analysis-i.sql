# Write your MySQL query statement below
Select product_name, year, price from sales join product where sales.product_id=product.product_id;