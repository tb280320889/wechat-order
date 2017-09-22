CREATE TABLE customer_addr (
  customer_addr_id INT UNSIGNED AUTO_INCREMENT NOT NULL
  COMMENT 'auto id',
  customer_id      INT UNSIGNED                NOT NULL
  COMMENT 'customer_login auto id',
  zip              SMALLINT                    NOT NULL
  COMMENT 'zip code',
  province         SMALLINT                    NOT NULL
  COMMENT 'province id',
  city             SMALLINT                    NOT NULL
  COMMENT 'city id',
  district         SMALLINT                    NOT NULL
  COMMENT 'district id',
  address          VARCHAR(200)                NOT NULL
  COMMENT 'concrete address',
  is_default       TINYINT UNSIGNED            NOT NULL
  COMMENT 'is default',
  modified_time    TIMESTAMP                   NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_customeraddid(customer_addr_id)
)
  ENGINE = innodb
  COMMENT 'customer address';
