insert into POSTS (ID, USER_ID, BODY)
    value (4, 4, 'Hi');

SELECT * FROM POSTS;

UPDATE POSTS
SET BODY = 'To delete'
WHERE ID = 4;

COMMIT;

SELECT * FROM POSTS;

DELETE FROM POSTS
WHERE ID = 4;

COMMIT;

SELECT * FROM POSTS;