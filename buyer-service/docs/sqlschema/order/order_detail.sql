CREATE TABLE order_detail (
  order_detail_id INT UNSIGNED               NOT NULL AUTO_INCREMENT
  COMMENT 'order detail id',
  order_id        INT UNSIGNED               NOT NULL
  COMMENT 'order id',
  product_id      INT UNSIGNED               NOT NULL
  COMMENT 'product id',
  product_name    VARCHAR(50)                NOT NULL
  COMMENT 'product name',
  product_cnt     INT DEFAULT 1              NOT NULL
  COMMENT 'product cnt',
  product_price   DECIMAL(8, 2)              NOT NULL
  COMMENT 'product price',
  average_cost    DECIMAL(8, 2)              NOT NULL
  COMMENT 'average cost'                              DEFAULT 0.00,
  weight          FLOAT COMMENT 'weight',
  fee_money       DECIMAL(8, 2)              NOT NULL
  COMMENT 'fee money'                                 DEFAULT 0.00,
  w_id            INT UNSIGNED               NOT NULL
  COMMENT 'w id',
  modified_time   TIMESTAMP                  NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_orderdetailid(order_detail_id)
)
  ENGINE = innodb
  COMMENT 'order detail';
