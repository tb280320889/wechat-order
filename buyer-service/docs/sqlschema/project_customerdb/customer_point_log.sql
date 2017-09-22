CREATE TABLE customer_point_log (
  point_id     INT UNSIGNED     NOT NULL  AUTO_INCREMENT
  COMMENT 'point log id',
  customer_id  INT UNSIGNED     NOT NULL
  COMMENT 'user id',
  source       TINYINT UNSIGNED NOT NULL
  COMMENT 'point source : 0 order, 1 login, 2 activity',
  refer_number INT UNSIGNED     NOT NULL  DEFAULT 0
  COMMENT 'source number',
  change_point SMALLINT         NOT NULL  DEFAULT 0
  COMMENT 'change point number',
  create_time  TIMESTAMP        NOT NULL
  COMMENT 'log create time',
  PRIMARY KEY pk_pointid(point_id)
)
  ENGINE = innodb
  COMMENT 'user credit point log';
