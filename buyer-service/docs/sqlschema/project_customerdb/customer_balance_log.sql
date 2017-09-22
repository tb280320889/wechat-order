CREATE TABLE customer_balance_log (
  balance_id  INT UNSIGNED     NOT NULL  AUTO_INCREMENT
  COMMENT 'balance log id',
  customer_id INT UNSIGNED     NOT NULL
  COMMENT 'user id',
  source      TINYINT UNSIGNED NOT NULL  DEFAULT 1
  COMMENT 'source: 1 order, 2 refund',
  source_sn   INT UNSIGNED     NOT NULL
  COMMENT 'sn id',
  create_time TIMESTAMP        NOT NULL  DEFAULT current_timestamp
  COMMENT 'create time',
  amount      DECIMAL(8, 2)    NOT NULL  DEFAULT 0.00
  COMMENT 'fluctuation ',
  PRIMARY KEY pk_balancedid (balance_id)

)
  ENGINE = innodb
  COMMENT 'balanced log';
