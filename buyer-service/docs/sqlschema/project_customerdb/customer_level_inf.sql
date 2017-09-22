CREATE TABLE customer_level_inf (
  customer_level TINYINT      NOT NULL AUTO_INCREMENT
  COMMENT 'member level id',
  level_name     VARCHAR(10)  NOT NULL
  COMMENT 'name of level',
  min_point      INT UNSIGNED NOT NULL DEFAULT 0
  COMMENT 'min point',
  max_point      INT UNSIGNED NOT NULL DEFAULT 0
  COMMENT 'max point',
  modified_time  TIMESTAMP    NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_levelid(customer_level)
)
  ENGINE = innodb
  COMMENT 'user level info table';
