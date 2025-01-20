select a.id, b.fish_name, a.length
from fish_info a
inner join fish_name_info b 
on a.fish_type = b.fish_type
where (a.fish_type, a.length) in (
    select distinct fish_type,
    max(length) over(partition by fish_type) as max_length
    from fish_info
)
order by a.id asc;