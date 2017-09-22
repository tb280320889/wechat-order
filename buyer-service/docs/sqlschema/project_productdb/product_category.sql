CREATE TABLE product_category (
  category_id     SMALLINT UNSIGNED AUTO_INCREMENT NOT NULL
  COMMENT 'category id',
  category_name   VARCHAR(10)                      NOT NULL
  COMMENT 'category name',
  category_code   VARCHAR(10)                      NOT NULL
  COMMENT 'category code',
  parent_id       SMALLINT UNSIGNED                NOT NULL  DEFAULT 0
  COMMENT 'parent category id',
  category_level  TINYINT                          NOT NULL  DEFAULT 1
  COMMENT 'level',
  category_status TINYINT                          NOT NULL  DEFAULT 1
  COMMENT 'status',
  modified_time   TIMESTAMP                        NOT NULL  DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_categoryid(category_id)
)
  ENGINE = innodb
  COMMENT 'product_category';
