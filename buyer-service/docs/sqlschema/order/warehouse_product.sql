CREATE TABLE warehouse_product (
  wp_id          INT UNSIGNED      NOT NULL AUTO_INCREMENT
  COMMENT 'wp id',
  product_id     INT UNSIGNED      NOT NULL
  COMMENT 'product id',
  w_id           SMALLINT UNSIGNED NOT NULL
  COMMENT 'w id',
  current_cnt    INT UNSIGNED      NOT NULL DEFAULT 0
  COMMENT 'current stock',
  lock_cnt       INT UNSIGNED      NOT NULL
  COMMENT 'lock cnt',
  in_transit_cnt INT UNSIGNED      NOT NULL
  COMMENT 'in transit cnt'                  DEFAULT 0,
  average_cost   DECIMAL(8, 2)     NOT NULL
  COMMENT 'average cost'                    DEFAULT 0.00,
  modified_time  TIMESTAMP         NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_wpid(wp_id)

)
  ENGINE = innodb
  COMMENT 'warehouse product';
