-- 코드를 입력하세요
SELECT MCDP_CD as '진료과 코드',
       count(*) as '5월예약건수'
FROM APPOINTMENT
WHERE MONTH(APNT_YMD) = '05'
GROUP BY 1
ORDER BY 2, 1