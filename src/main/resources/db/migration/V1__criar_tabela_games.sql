CREATE SEQUENCE SEQ_GAMES
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;

CREATE TABLE TBL_GAMES (
    ID INTEGER DEFAULT SEQ_GAMES.NEXTVAL NOT NULL,
    TITULO VARCHAR2(100) NOT NULL,
    DATA_LANCAMENTO DATE NOT NULL
);
