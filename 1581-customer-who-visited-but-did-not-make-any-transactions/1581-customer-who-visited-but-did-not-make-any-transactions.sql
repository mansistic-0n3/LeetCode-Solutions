# Write your MySQL query statement below
select customer_id , count(visit_id) as count_no_trans from visits where visit_id NOT IN (Select visit_id from Transactions) group by customer_id;