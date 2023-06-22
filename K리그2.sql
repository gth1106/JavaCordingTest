select round(avg(home_score + away_score),1) as ��յ���
from schedule
where TO_date(sche_date ,'yyyy/mm/dd')
        BETWEEN TO_Date('20100101' , 'yyyy/mm/dd') 
        and to_date('20140101','yyyy/mm/dd');


select sche_date
from schedule;

SELECT PLAYER_NAME, TEAM_ID
FROM PLAYER
WHERE PLAYER_NAME LIKE '%��%';

SELECT PLAYER_NAME, JOIN_YYYY
FROM PLAYER
WHERE JOIN_YYYY >= 2010
order by join_yyyy;

SELECT PLAYER_NAME, TEAM_ID, POSITION, BACK_NO
FROM PLAYER
WHERE WEIGHT >= 75 and BACK_NO is not null
order by back_no DESC;

SELECT nvl(NATION,'korea'), COUNT(*)
FROM PLAYER
GROUP BY NATION;

SELECT trunc(AVG(HEIGHT)) as ���Ű , (MAX(HEIGHT)) as Ű���ִ�
FROM PLAYER;

SELECT player_name,TRUNC(MONTHS_BETWEEN(SYSDATE, BIRTH_DATE) / 12) AS AGE,
        HEIGHT ,weight
FROM PLAYER
where TRUNC(MONTHS_BETWEEN(SYSDATE, BIRTH_DATE) / 12) is not null
        and height is not null and weight is not null
order by age DESC;

SELECT HOMETEAM_ID, MAX(HOME_SCORE + AWAY_SCORE) AS MAX_SCORE
FROM schedule
WHERE SCHE_DATE BETWEEN '20070101' AND '20151231'
GROUP BY HOMETEAM_ID
ORDER BY MAX_SCORE DESC;

SELECT COUNT(*) AS ����_�� 
FROM team;

SELECT team_name AS ���ܸ�, 
       CASE 
           WHEN homepage IS NULL THEN '����' 
           ELSE '����' 
       END AS Ȩ������_���� 
FROM team;

SELECT team_name AS ���ܸ�, 
       TRUNC(AVG(height), 1) AS ���_���� 
FROM player 
JOIN team 
ON player.team_id = team.team_id 
GROUP BY team_name;

SELECT team_name AS ���ܸ�, 
       ddd || '-' || tel || ' / ' || fax AS "��ȭ / �ѽ���ȣ" 
FROM team;

SELECT STADIUM_NAME 
FROM stadium 
WHERE STADIUM_ID Like '%A%';

select stadium_id
from stadium;

SELECT SUM(SEAT_COUNT) AS "�� �¼���"
FROM stadium;

SELECT STADIUM_NAME, AVG(SEAT_COUNT) AS AVG_SEATS
FROM stadium
GROUP BY STADIUM_NAME;

select STADIUM_NAME,seat_count
from stadium;

SELECT stadium_name as �����̸� ,TEL as ��ȭ��ȣ
FROM stadium;

SELECT team_name AS ����â���� 
FROM team 
WHERE orig_yyyy = (SELECT MIN (orig_yyyy)
                   FROM team );

SELECT POSITION as ������, trunc(NVL(AVG(HEIGHT),0)) as ���Ű, 
                          trunc(NVL(AVG(WEIGHT),0)) as ��ո�����
FROM PLAYER
where position is not null
GROUP BY POSITION;

SELECT BIRTH_DATE , player_name
FROM PLAYER
WHERE BACK_NO = 7;

SELECT PLAYER_NAME,HEIGHT, WEIGHT
FROM PLAYER
WHERE BACK_NO = 10;

SELECT TRUNC(AVG(HEIGHT), 2) AS "��� Ű"
FROM PLAYER
WHERE substr(TO_NUMBER(to_date(BIRTH_DATE,'yyyy-mm-dd')),1, 4) < 1990;

SELECT TRUNC(AVG(HEIGHT), 2) AS ���_����, TRUNC(AVG(WEIGHT), 2) AS ���_ü��
FROM PLAYER
WHERE TO_NUMBER(TO_CHAR(TO_DATE(BIRTH_DATE, 'YYYY-MM-DD'), 'YYYY')) < 1990;


select birth_Date
from player;

SELECT POSITION, BACK_NO, PLAYER_NAME
FROM PLAYER
WHERE (POSITION, BACK_NO) IN (SELECT POSITION, MAX(BACK_NO)
                              FROM PLAYER
                              GROUP BY POSITION );
                              
SELECT POSITION, COUNT(*) AS "���� ��"
FROM PLAYER
where position is not null
GROUP BY POSITION;

SELECT TEAM_ID, TRUNC(AVG(HEIGHT), 2) AS "��� Ű"
FROM PLAYER
GROUP BY TEAM_ID;

SELECT TEAM_ID, POSITION, COUNT(*) AS "���� ��"
FROM PLAYER
WHERE TEAM_ID = 'K02'
GROUP BY TEAM_ID, POSITION;

SELECT TEAM_ID, TRUNC(AVG(HEIGHT),1) AS ���Ű, TRUNC(AVG(WEIGHT),1) AS ��ո�����
FROM PLAYER
GROUP BY TEAM_ID;

SELECT PLAYER.TEAM_ID, TRUNC(AVG(PLAYER.HEIGHT),2) AS PLAYER_AVG_HEIGHT, TRUNC(AVG(TEAM.HEIGHT),2) AS TEAM_AVG_HEIGHT
FROM PLAYER
JOIN TEAM
ON PLAYER.TEAM_ID = TEAM.TEAM_ID
GROUP BY PLAYER.TEAM_ID;



SELECT TO_CHAR(BIRTH_DATE, 'YYYY') AS "����", COUNT(*) AS "���� ��"
FROM PLAYER
WHERE TEAM_ID = 'K01'
GROUP BY TO_CHAR(BIRTH_DATE, 'YYYY')
ORDER BY 1 ASC;






SELECT POSITION, MAX(HEIGHT) - MIN(HEIGHT) AS "Ű������"
FROM PLAYER
WHERE POSITION IS NOT NULL
GROUP BY POSITION;




SELECT POSITION ������, TRUNC(AVG(HEIGHT), 1) AS ���Ű
FROM PLAYER
WHERE WEIGHT <= (SELECT AVG(WEIGHT) 
                 FROM PLAYER)
GROUP BY POSITION;








