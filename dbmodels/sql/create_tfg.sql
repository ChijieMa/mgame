
USE TFG;

DROP TABLE IF EXISTS TFG_USER_ID_LIST;
CREATE TABLE TFG_USER_ID_LIST (
  USER_ID bigint(20) NOT NULL ,
  STATUS int(2) DEFAULT NULL,
  PRIMARY KEY (USER_ID)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户ID列表';


create index TFG_USER_ID_LIST_IDX0 on TFG_USER_ID_LIST
(
   STATUS
);

DROP TABLE IF EXISTS TFG_LOGIN_USER;
CREATE TABLE TFG_LOGIN_USER (
  USER_ID bigint(20) NOT NULL ,
  LOGIN_ID varchar(32) DEFAULT NULL,
  NICKNAME varchar(32) DEFAULT NULL,
  EMAIL varchar(64) DEFAULT NULL,
  MOBILE varchar(20) DEFAULT NULL,

  THIRD_LOGINID1 varchar(64) DEFAULT NULL,
  THIRD_LOGINID2 varchar(32) DEFAULT NULL,

  REG_TYPE varchar(32) COMMENT '注册类型',
  STATUS int(2) DEFAULT NULL,
  PASSWORD varchar(32) DEFAULT NULL COMMENT 'md5加密处理',
  TRADE_PASSWORD varchar(32) DEFAULT NULL COMMENT '交易密码',
  UPDATE_TIME datetime DEFAULT NULL,
  CREATE_TIME datetime DEFAULT NULL,
  PRIMARY KEY (USER_ID)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户登录表';

create index TFG_LOGIN_USER_IDX1 on TFG_LOGIN_USER
(
   LOGIN_ID
);

create index TFG_LOGIN_USER_IDX2 on TFG_LOGIN_USER
(
   THIRD_LOGINID1
);


create index TFG_LOGIN_USER_IDX3 on TFG_LOGIN_USER
(
   THIRD_LOGINID2
);

create index TFG_LOGIN_USER_IDX4 on TFG_LOGIN_USER
(
   EMAIL
);
create index TFG_LOGIN_USER_IDX5 on TFG_LOGIN_USER
(
   MOBILE
);




DROP TABLE IF EXISTS TFG_USER_INFO;
CREATE TABLE TFG_USER_INFO (
  USER_ID bigint(20) NOT NULL ,
  NICKNAME varchar(32) DEFAULT NULL,
  SECURITY_EMAIL varchar(64) DEFAULT NULL COMMENT '密码找回邮箱',
  USER_NAME varchar(50) DEFAULT NULL COMMENT '姓名',
  ADDRESS varchar(100) DEFAULT NULL COMMENT '工作地址',
  STATUS int(2) DEFAULT NULL,
  ID_NO varchar(20) DEFAULT NULL COMMENT '身份证号',
  UPDATE_TIME datetime DEFAULT NULL,
  CREATE_TIME datetime DEFAULT NULL,

  QQ_ID varchar(32) DEFAULT NULL,
  WECHAT_ID varchar(32) DEFAULT NULL,
  MOBILE varchar(20) DEFAULT NULL,
  EMAIL varchar(64) DEFAULT NULL,
  RENREN varchar(20) DEFAULT NULL,
  WEIBO varchar(20) DEFAULT NULL,

  FACE int(4) DEFAULT NULL COMMENT '0 用户上传, >= 10 预定义头像',

  FACE_URL varchar(255) DEFAULT NULL COMMENT '子定义头像存放url地址',
  GENDER int(2) DEFAULT NULL COMMENT '0:未选择，1:男，2:女',
  BIRTHDAY date DEFAULT NULL COMMENT '生日',
  COUNTRY varchar(100) DEFAULT NULL COMMENT '国籍',
  CITY varchar(100) DEFAULT NULL COMMENT '城市',
  REG_TIME datetime DEFAULT NULL COMMENT '主策时间',
  REG_IP varchar(20) DEFAULT NULL COMMENT '注册时用户IP',
  LAST_LOGIN_TIME datetime DEFAULT NULL COMMENT '最后一次登录时间',
  LAST_LOGIN_IP varchar(20) DEFAULT NULL COMMENT '最后一次登录时的用户ip',


  PRIMARY KEY (USER_ID)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';



DROP TABLE IF EXISTS TFG_USER_ROLE;
CREATE TABLE TFG_USER_ROLE (
  USER_ROLE_ID bigint(20) NOT NULL ,
  USER_ID bigint(20) DEFAULT NULL,
  ROLE_ID bigint(20) DEFAULT NULL,
  STATUS tinyint(4) DEFAULT NULL,
  PRIMARY KEY (USER_ROLE_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与角色';


create table `tgc_user_type_cfg` (
  `id` bigint(20) not null default 0 comment '用户类型id：0会员，1总代,2一级代理，3代理',
  `parent_id` bigint(20) default null comment '类型从属关系,即上级id',
  `cn_name` varchar(32) default '' comment '组中文名称',
  `en_name` varchar(32) default '' comment '组英文名称',
  `enable` tinyint(1) not null default '0' comment '是否有效 1有效 0无效',
  `user_id` bigint(20) not null comment '更新人的数字id',
  `update_time` datetime default null comment '更新时间',
  `remark` varchar(255) default null comment '备注',
  primary key (`id`)
)  engine=innodb default charset=utf8 comment='用户类型配置表';


