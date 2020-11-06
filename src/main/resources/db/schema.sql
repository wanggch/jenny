
-- 股票交易记录
DROP TABLE IF EXISTS `stock_record`;
CREATE TABLE `stock_record` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `stock_code` varchar(16) NOT NULL COMMENT '股票编码',
  `stock_name` varchar(128) NOT NULL COMMENT '股票名称',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `amount` int NOT NULL COMMENT '数量',
  `turnover` decimal(10,2) NOT NULL COMMENT '成交金额',
  `transaction_time` timestamp NOT NULL COMMENT '交易时间',
  `transaction_type` varchar(2) NOT NULL COMMENT '交易类型',
  `commission` decimal(10,2) COMMENT '佣金',
  `stamp_duty` decimal(10, 2) COMMENT '印花税',
  `transfer_fee` decimal(10, 2) COMMENT '过户费',
  `create_time` timestamp NOT NULL COMMENT '记录创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='股票交易记录';

--