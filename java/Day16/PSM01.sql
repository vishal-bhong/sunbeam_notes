DROP PROCEDURE IF EXISTS sp_insertEmployee;

DELIMITER $$
CREATE PROCEDURE sp_insertEmployee(IN pname VARCHAR(40), IN psalary DECIMAL(9,2))
BEGIN
    INSERT INTO employee(name,salary) VALUES(pname,psalary);
END
$$
DELIMITER ;