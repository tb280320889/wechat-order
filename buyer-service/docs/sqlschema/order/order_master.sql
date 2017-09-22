CREATE TABLE order_master (
  order_id           INT UNSIGNED                        NOT NULL AUTO_INCREMENT
  COMMENT 'order id',
  order_sn           BIGINT UNSIGNED                     NULL
  COMMENT 'order sn',
  customer_id        INT UNSIGNED                        NOT NULL
  COMMENT 'customer id',
  shipping_user      VARCHAR(10)                         NOT NULL
  COMMENT 'shipping user',
  province           SMALLINT                            NOT NULL
  COMMENT 'province',
  city               SMALLINT                            NOT NULL
  COMMENT 'city',
  district           SMALLINT                            NOT NULL
  COMMENT 'district',
  address            VARCHAR(100)                        NOT NULL
  COMMENT 'address',
  payment_method     TINYINT                             NOT NULL
  COMMENT '1 cash, 2 balance, 3 bank, 4 alipay, 5 wechat',
  discount_money     DECIMAL(8, 2)                       NOT NULL
  COMMENT 'discount money'                                        DEFAULT 0.00,
  shipping_money     DECIMAL(8, 2)                       NOT NULL
  COMMENT 'shipping money'                                        DEFAULT 0.00,
  payment_money      DECIMAL(8, 2)                       NOT NULL
  COMMENT 'payment money'                                         DEFAULT 0.00,
  shipping_comp_name VARCHAR(10) COMMENT 'shipping comp name',
  shipping_sn        VARCHAR(50) COMMENT 'shipping sn',
  create_time        TIMESTAMP DEFAULT current_timestamp NULL
  COMMENT 'create time',
  shipping_time      DATETIME COMMENT 'shipping time',
  pay_time           DATETIME COMMENT 'pay time',
  receive_time       DATETIME COMMENT 'receive time',
  order_status       TINYINT DEFAULT 0                   NOT NULL
  COMMENT 'order status',
  invoice_title      VARCHAR(100) COMMENT 'invoice title',
  modified_time      TIMESTAMP                           NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_orderid(order_id)
)
  ENGINE = innodb
  COMMENT 'order master';
