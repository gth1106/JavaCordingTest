select team_id,avg(height) as Æò±ÕÅ° ,avg(weight) as Æò±Õ¸ö¹«°Ô ,position
from player
where team_id = 'K01'
group by team_id,position;