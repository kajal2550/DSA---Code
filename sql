# write q query to display emp names . who are working in the same departmemnt as alen.

SELECT ename
FROM emp
WHERE deptno = (
    SELECT deptno
    FROM emp
    WHERE ename = 'ALLEN'
);
