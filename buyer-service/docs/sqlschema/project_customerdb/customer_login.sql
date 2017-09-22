CREATE TABLE customer_login (
  customer_id   INT UNSIGNED AUTO_INCREMENT NOT NULL
  COMMENT ' customer id',
  login_name    VARCHAR(20)                 NOT NULL
  COMMENT ' USER login NAME ',
  pwd           CHAR(32)                    NOT NULL
  COMMENT 'md5  encrypted PASSWORD ',
  user_status   TINYINT                     NOT NULL DEFAULT 1
  COMMENT ' USER STATUS ',
  modified_time TIMESTAMP                   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT ' LAST MODIFY TIME ',
  PRIMARY KEY pk_customerid (customer_id)
)
  ENGINE = INNODB
  COMMENT = ' USER login info TABLE ';
