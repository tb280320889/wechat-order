CREATE TABLE product_brand_info (
  brand_id      SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT
  COMMENT 'brand_id',
  brand_name    VARCHAR(50)       NOT NULL
  COMMENT 'brand name',
  telephone     VARCHAR(50)       NOT NULL
  COMMENT 'telephone',
  brand_web     VARCHAR(100) COMMENT 'brand web',
  brand_logo    VARCHAR(100) COMMENT 'logo url',
  brand_desc    VARCHAR(150) COMMENT 'brand desc',
  brand_status  TINYINT           NOT NULL DEFAULT 0
  COMMENT 'brand status: 0 unavailable, 1 available',
  brand_order   TINYINT           NOT NULL DEFAULT 0
  COMMENT 'order',
  modified_time TIMESTAMP         NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_brandid(brand_id)
)
  ENGINE = innodb
  COMMENT 'brand info';
