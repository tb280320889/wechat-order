-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
    `category_id`   INT(11)                 NOT NULL AUTO_INCREMENT,
    `category_name` VARCHAR(64)
                    CHARACTER SET utf8
                    COLLATE utf8_general_ci NOT NULL,
    `category_type` INT(11)                 NOT NULL,
    `create_time`   TIMESTAMP(0)            NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time`   TIMESTAMP(0)            NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(
            0),
    PRIMARY KEY (`category_id`) USING BTREE,
    UNIQUE INDEX `uqe_category_type`(`category_type`) USING BTREE,
    UNIQUE INDEX `ueq_category_name`(`category_name`) USING BTREE
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 13
    CHARACTER SET = utf8
    COLLATE = utf8_general_ci
    COMMENT = 'categories'
    ROW_FORMAT = FIXED;

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
    `product_id`          VARCHAR(32)
                          CHARACTER SET utf8
                          COLLATE utf8_general_ci NOT NULL,
    `product_name`        VARCHAR(64)
                          CHARACTER SET utf8
                          COLLATE utf8_general_ci NOT NULL,
    `product_price`       DECIMAL(8, 2)           NOT NULL,
    `product_stock`       INT(11)                 NOT NULL,
    `product_description` VARCHAR(64)
                          CHARACTER SET utf8
                          COLLATE utf8_general_ci          DEFAULT NULL,
    `product_icon`        VARCHAR(512)
                          CHARACTER SET utf8
                          COLLATE utf8_general_ci          DEFAULT NULL,
    `product_status`      INT(3)                  NOT NULL,
    `category_type`       INT(255)                NOT NULL,
    `create_time`         TIMESTAMP(0)            NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time`         TIMESTAMP(0)            NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(
            0),
    PRIMARY KEY (`product_id`) USING BTREE
)
    ENGINE = InnoDB
    CHARACTER SET = utf8
    COLLATE = utf8_general_ci
    COMMENT = 'products'
    ROW_FORMAT = FIXED;

DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
    `admin_id`    VARCHAR(32)  NOT NULL,
    `user_name`   VARCHAR(32)  NOT NULL,
    `password`    VARCHAR(32)  NOT NULL,
    `openid`      VARCHAR(32)  NOT NULL,
    `create_time` TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` TIMESTAMP(0) NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp(0),
    PRIMARY KEY (`admin_id`) USING BTREE
)
    ENGINE = InnoDB
    COMMENT = 'admin users'
    ROW_FORMAT = DYNAMIC;

