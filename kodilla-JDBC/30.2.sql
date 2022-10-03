ALTER TABLE BOOKS ADD BESTSELLER BOOLEAN;

DROP PROCEDURE IF EXISTS UpdateBestsellers;

DELIMITER $$

CREATE PROCEDURE UpdateBestsellers()
BEGIN
    DECLARE BOOKSFORT BOOLEAN;
    DECLARE COUNTS INT;
    DECLARE BOOK INT;
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS CURSOR FOR SELECT BOOK_ID FROM BOOKS;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
OPEN ALL_BOOKS;
WHILE (FINISHED = 0) DO
        FETCH ALL_BOOKS INTO COUNTS;
        IF (FINISHED = 0) THEN

SELECT COUNT(*) FROM RENTS
WHERE BOOK_ID = COUNTS
    INTO BOOK;

IF (BOOK > 2) THEN
                SET BOOKSFORT = TRUE;
ELSE
               SET BOOKSFORT = FALSE;
END IF;

UPDATE BOOKS SET BESTSELLER = BOOKSFORT
WHERE BOOK_ID = COUNTS;
COMMIT;
END IF;
END WHILE;

CLOSE ALL_BOOKS;

END $$
DELIMITER ;

CALL UpdateBestsellers();

select * from books;