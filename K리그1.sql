select *
from stadium;

select *
from schedule;

select stadium_id ,stadium_name,address
from stadium
where stadium_id in(select stadium_id
                        from schedule
                        where sche_date Like '201207%')
                        and address Like '%������%';
                        
select team_id,team_name,region_name
from team
where stadium_id not in (select stadium_id
                     from schedule
                     where sche_date Like '201211%');
select *
from schedule
where TO_date(sche_date,'yyyy-mm-dd')
    between '2012-02-01' and '2012-04-25';                   


select sche_date �������,hometeam_id Ȩ���ѹ� , awayteam_id ��������ѹ�
      ,home_score Ȩ���� ,away_score ����̵���,
    case when home_score > away_score then 'W'
                                      else 'L' end as ��������
from schedule
where home_score is not null;


         

select *
from player
where position = 'FW';

select*
from team;

select player_name,position ,(select team_name
                              from team
                              where team_id = player.team_id) as ���̸�
from player
where position ='FW' ;



    

                    