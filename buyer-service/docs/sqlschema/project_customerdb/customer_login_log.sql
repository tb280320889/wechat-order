CREATE TABLE customer_login_log (
  login_id    INT UNSIGNED NOT NULL  AUTO_INCREMENT
  COMMENT 'login_id',
  customer_id INT UNSIGNED NOT NULL
  COMMENT 'user id',
  login_time  TIMESTAMP    NOT NULL
  COMMENT 'login time',
  login_ip    INT UNSIGNED NOT NULL
  COMMENT 'login_ip',
  login_type  TINYINT      NOT NULL
  COMMENT 'type: 0 failed, 1 success'
#   PRIMARY KEY pk_loginid(login_id)  分区键必须是包含主键或者唯一索引
)
  ENGINE = innodb
  COMMENT 'login log'
#   PARTITION BY HASH (customer_id)
#   PARTITIONS 4


# 适用分区键为日期或者时间类型
# 所有查询中都包括分区键
# 定期按分区清理历史数据的场景
PARTITION BY RANGE (YEAR(login_time))(
  PARTITION p2017 VALUES LESS THAN (2017),
  PARTITION p2018 VALUES LESS THAN (2018),
  PARTITION p2019 VALUES LESS THAN (2019)
)

#   PARTITION BY LIST (login_type)
#   (
#   PARTITION p0 VALUES IN (1, 3, 5, 7, 9),
#   PARTITION p1 VALUES IN (2, 4, 6, 8)
#   )
;

# 年底计划任务添加分区
ALTER TABLE xxx add PARTITION (PARTITION PX VALUES  LESS THAN (NNN)) ;
