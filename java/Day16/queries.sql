-- accounts table and dummy data
CREATE TABLE accounts(id INT, type CHAR(30), balance DOUBLE);
INSERT INTO accounts VALUES (1, 'Saving', 30000.00);
INSERT INTO accounts VALUES (2, 'Saving', 2000.00);
INSERT INTO accounts VALUES (3, 'Saving', 10000.00);
SELECT * FROM accounts;

--transaction queries that is rollbacked
START TRANSACTION;

UPDATE accounts SET balance = balance-5000 WHERE id=1;

SELECT * FROM accounts;

UPDATE accounts SET balance = balance +5000 WHERE id=4;

ROLLBACK;

--transaction queries that is commited
START TRANSACTION;

UPDATE accounts SET balance = balance-5000 WHERE id=1;

SELECT * FROM accounts;

UPDATE accounts SET balance = balance +5000 WHERE id=2;

COMMIT;

