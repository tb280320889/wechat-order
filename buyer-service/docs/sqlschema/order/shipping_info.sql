CREATE TABLE IF NOT EXISTS sihpping_info (
  ship_id       TINYINT UNSIGNED           NOT NULL AUTO_INCREMENT
  COMMENT 'ship id',
  ship_name     VARCHAR(20)                NOT NULL
  COMMENT 'ship name',
  ship_contact  VARCHAR(20)                NOT NULL
  COMMENT 'ship contact',
  telephone     VARCHAR(20)                NOT NULL
  COMMENT 'telephone',
  price         DECIMAL(8, 2) DEFAULT 0.00 NOT NULL
  COMMENT 'price',
  modified_time TIMESTAMP                  NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_shipid(ship_id)
)
  ENGINE = innodb
  COMMENT 'sihpping info';
