# Write your MySQL query statement below
Select 
    LEFT(trans_date,7) as month, 
    country,
    count(state) as trans_count, 
    SUM(state= 'approved') as approved_count, 
    SUM(amount) as trans_total_amount, 
    SUM((state = 'approved') * amount) as approved_total_amount 
    from transactions group by month, country;
