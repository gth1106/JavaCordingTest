select team_id,avg(height) as ���Ű ,avg(weight) as ��ո����� ,position
from player
where team_id = 'K01'
group by team_id,position;