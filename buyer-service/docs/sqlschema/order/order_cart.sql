CREATE TABLE order_cart (
  cart_id        INT UNSIGNED                        NOT NULL AUTO_INCREMENT
  COMMENT 'cart id',
  customer_id    INT UNSIGNED                        NOT NULL
  COMMENT 'customer id',
  product_id     INT UNSIGNED                        NOT NULL
  COMMENT 'product id',
  product_amount INT                                 NOT NULL
  COMMENT ' product amount',
  price          DECIMAL(8, 2)                       NOT NULL
  COMMENT 'price',
  add_time       TIMESTAMP DEFAULT current_timestamp NOT NULL
  COMMENT 'add time',
  modified_time  TIMESTAMP                           NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_cartid(cart_id)
)
  ENGINE = innodb
  COMMENT 'order cart';
