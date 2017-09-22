CREATE TABLE customer_inf (
  customer_inf_id    INT UNSIGNED AUTO_INCREMENT NOT NULL
  COMMENT 'primary_key',
  customer_id        INT UNSIGNED                NOT NULL
  COMMENT 'customer_login table auto id',
  customer_name      VARCHAR(20)                 NOT NULL
  COMMENT 'user true name',
  identity_card_type TINYINT                     NOT NULL  DEFAULT 1
  COMMENT 'type of certificated card 1 for ID 2 for army license, 3 for passport',
  mobile_phone       INT UNSIGNED COMMENT 'telephone number',
  customer_email     VARCHAR(50) COMMENT 'email address',
  gender             CHAR(1) COMMENT 'gender',
  user_point         INT                         NOT NULL  DEFAULT 0
  COMMENT 'user point',
  register_time      TIMESTAMP                   NOT NULL
  COMMENT 'register time',
  birthday           DATETIME COMMENT 'birthday',
  customer_level     TINYINT                     NOT NULL  DEFAULT 1
  COMMENT 'member levels : 1 elementary, 2 blue, 3 silver, 4 gold, 5 diamond',
  user_balance       DECIMAL(8, 2)               NOT NULL  DEFAULT 0.00
  COMMENT 'user balance',
  modified_time      TIMESTAMP                   NOT NULL  DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_customerinfid (customer_inf_id)
)
  ENGINE = innodb
  COMMENT 'user info table'; 
