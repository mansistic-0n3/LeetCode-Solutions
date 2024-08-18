# Write your MySQL query statement below
# select contest_id,
# Round((Count(register.contest_id)*100/u.total_users),2) as percentage 
# from register join
# (SELECT COUNT(DISTINCT user_id) AS total_users FROM users) u
# # on users.user_id=register.user_id 
# group by contest_id order by percentage desc, contest_id asc;

select contest_id,
Round(Count(register.contest_id)*100/(SELECT COUNT(DISTINCT user_id) from users),2) as percentage 
from register
group by contest_id order by percentage desc, contest_id asc;