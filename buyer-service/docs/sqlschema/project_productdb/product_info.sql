CREATE TABLE product_info (
  product_id        INT UNSIGNED                        NOT NULL AUTO_INCREMENT
  COMMENT 'product id',
  product_code      CHAR(16)                            NOT NULL
  COMMENT 'product code',
  product_name      VARCHAR(30)                         NOT NULL
  COMMENT 'product name',
  bar_code          VARCHAR(50)                         NOT NULL
  COMMENT 'bar code',
  brand_id          INT UNSIGNED                        NOT NULL
  COMMENT 'brand id',
  one_category_id   SMALLINT UNSIGNED                   NOT NULL
  COMMENT 'level one category id',
  two_category_id   SMALLINT UNSIGNED                   NOT NULL
  COMMENT 'level two category id',
  three_category_id SMALLINT UNSIGNED                   NOT NULL
  COMMENT 'level three category id',
  supplier_id       INT UNSIGNED                        NOT NULL
  COMMENT 'supplier_id',
  price             DECIMAL(8, 2)                       NOT NULL
  COMMENT 'price',
  average_cost      DECIMAL(8, 2)                       NOT NULL
  COMMENT 'average cost',
  publish_status    TINYINT DEFAULT 0                   NOT NULL
  COMMENT 'publish status',
  audit_status      TINYINT DEFAULT 0                   NOT NULL
  COMMENT 'audit status',
  weight            FLOAT COMMENT 'weight',
  length            FLOAT COMMENT 'length',
  height            FLOAT COMMENT 'height',
  width             FLOAT COMMENT 'width',
  color_type        VARCHAR(20) COMMENT 'color type',
  production_date   DATETIME                            NOT NULL
  COMMENT 'production date',
  shelf_life        INT                                 NOT NULL
  COMMENT 'shelf life',
  description       TEXT                                NOT NULL
  COMMENT 'description',
  in_date           TIMESTAMP DEFAULT current_timestamp NOT NULL
  COMMENT 'in date',
  modified_time     TIMESTAMP                           NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_productid(product_id)
)
  ENGINE = innodb
  COMMENT 'product_info';
