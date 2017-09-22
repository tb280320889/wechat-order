CREATE TABLE product_supplier_info (
  supplier_id     INT UNSIGNED NOT NULL  AUTO_INCREMENT
  COMMENT 'supplier id',
  supplier_code   CHAR(8)      NOT NULL
  COMMENT 'code',
  supplier_name   VARCHAR(50)  NOT NULL
  COMMENT 'name',
  supplier_type   TINYINT      NOT NULL
  COMMENT 'type: 1 self, 2 platform',
  link_man        VARCHAR(10)  NOT NULL
  COMMENT 'contact man',
  phone_number    VARCHAR(50)  NOT NULL
  COMMENT 'phone no',
  bank_name       VARCHAR(50)  NOT NULL
  COMMENT 'bank name',
  bank_account    VARCHAR(50)  NOT NULL
  COMMENT 'bank account',
  address         VARCHAR(200) NOT NULL
  COMMENT 'address',
  supplier_status TINYINT      NOT NULL  DEFAULT 0
  COMMENT '0 banned, 1 active',
  modified_time   TIMESTAMP    NOT NULL  DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT 'last modified time',
  PRIMARY KEY pk_supplierid(supplier_id)
)
  ENGINE = innodb
  COMMENT 'supplier info';
