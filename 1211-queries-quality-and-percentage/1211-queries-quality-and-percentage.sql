# Write your MySQL query statement below
select q.query_name, round(avg(q.rating/q.position), 2) 'quality', 
round(avg(if(rating<3,1,0))*100,2) 'poor_query_percentage'
from Queries q
where q.query_name is not null
group by q.query_name;