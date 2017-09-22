CREATE TABLE product_pic_info (
  product_pic_id INT UNSIGNED      NOT NULL AUTO_INCREMENT
  COMMENT 'product pic id',
  product_id     INT UNSIGNED      NOT NULL
  COMMENT 'product id',
  pic_desc       VARCHAR(50) COMMENT 'pic desc',
  pic_url        VARCHAR(200)      NOT NULL
  COMMENT 'pic url',
  is_master      TINYINT DEFAULT 0 NOT NULL
  COMMENT '0 not main pic,1 main pic',
  pic_order      TINYINT DEFAULT 0 NOT NULL
  COMMENT 'pic order',
  pic_status     TINYINT DEFAULT 1 NOT NULL
  COMMENT 'pic status',
  modified_time  TIMESTAMP         NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_picid(product_pic_id)
)
  ENGINE = innodb
  COMMENT 'product pic info';
