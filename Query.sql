-- 1. 创建名为ssm的数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS ssm DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 2. 使用该数据库
USE ssm;

-- 3. 创建t_user表（userid改为INT类型，添加自增更符合实际使用）
CREATE TABLE IF NOT EXISTS t_user (
    userid INT NOT NULL AUTO_INCREMENT COMMENT '用户ID（整型）',
    username CHAR(20) NOT NULL COMMENT '用户名',
    PRIMARY KEY (userid)  -- 主键约束，保证userid唯一
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 4. 插入3条样例数据（userid为INT，可省略或指定数值）
INSERT INTO t_user (userid, username) VALUES
(1001, 'ZhangSan'),
(1002, 'LiSi'),
(1003, 'WangWu');

-- 若开启了AUTO_INCREMENT，也可以省略userid，由数据库自动生成：
-- INSERT INTO t_user (username) VALUES ('ZhangSan'), ('LiSi'), ('WangWu');


-- 删除t_user表（如果存在）
DROP TABLE IF EXISTS t_user;