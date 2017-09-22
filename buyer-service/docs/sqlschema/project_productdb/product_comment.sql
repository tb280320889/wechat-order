CREATE TABLE product_comment (
  comment_id    INT UNSIGNED    NOT NULL AUTO_INCREMENT
  COMMENT 'comment id',
  product_id    INT UNSIGNED    NOT NULL
  COMMENT 'product id',
  order_id      BIGINT UNSIGNED NOT NULL
  COMMENT 'order id',
  customer_id   INT UNSIGNED    NOT NULL
  COMMENT 'customer id',
  title         VARCHAR(50)     NOT NULL
  COMMENT 'title',
  content       VARCHAR(300)    NOT NULL
  COMMENT 'content',
  audit_status  TINYINT         NOT NULL
  COMMENT 'audit status',
  audit_time    TIMESTAMP       NOT NULL
  COMMENT 'audit time',
  modified_time TIMESTAMP       NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_commentid(comment_id)
)
  ENGINE = innodb
  COMMENT 'product comment';
