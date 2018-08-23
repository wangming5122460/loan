/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.5.54-log : Database - loan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`loan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `loan`;

/*Table structure for table `nplm_borrower_info` */

DROP TABLE IF EXISTS `nplm_borrower_info`;

CREATE TABLE `nplm_borrower_info` (
  `id` int(11) NOT NULL COMMENT '客户编号',
  `APPLY_CLIENT_ID` int(11) DEFAULT NULL COMMENT '进件客户编号',
  `ECIF_ID` int(11) DEFAULT NULL COMMENT 'ECIF客户号',
  `CLIENT_NAME` varchar(32) DEFAULT NULL COMMENT '客户姓名',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '发短信移动电话',
  `OLD_NAME` varchar(32) DEFAULT NULL COMMENT '曾用名',
  `SEX` varchar(2) DEFAULT NULL COMMENT '性别',
  `NATION` varchar(20) DEFAULT NULL COMMENT '民族',
  `BIRTHDAY` varchar(10) DEFAULT NULL COMMENT '出生日期',
  `MARITAL` varchar(50) DEFAULT NULL COMMENT '婚姻状况',
  `HAVE_CHILDREN` int(11) DEFAULT NULL COMMENT '有无子女 1为没有，2为有',
  `CHILDREN_COUNT` int(11) DEFAULT NULL COMMENT '子女数量',
  `NATIONALITY` varchar(32) DEFAULT NULL COMMENT '国籍',
  `H_PROVINCE` varchar(64) DEFAULT NULL COMMENT '户籍所在省',
  `H_CITY` varchar(64) DEFAULT NULL COMMENT '户籍所在市',
  `H_DRESS` varchar(128) DEFAULT NULL COMMENT '户籍所在地',
  `IDENTITY_TYPE` varchar(20) DEFAULT NULL COMMENT '证件类型',
  `IDENTITY_NUM` varchar(30) DEFAULT NULL COMMENT '证件号码',
  `IDENTITY_VALID_DATE` varchar(10) DEFAULT NULL COMMENT '证件有效期限',
  `HAVE_CAR` varchar(20) DEFAULT NULL COMMENT '有无车产 Y:有  N:无',
  `HOUSE_EXPLAIN` varchar(256) DEFAULT NULL COMMENT '房产情况',
  `RESIDE_EXPLAIN` varchar(256) DEFAULT NULL COMMENT '居住情况',
  `RESIDE_YEAR` varchar(32) DEFAULT NULL COMMENT '居住年限',
  `DEGREE` varchar(32) DEFAULT NULL COMMENT '学历',
  `DIPLOMA` varchar(32) DEFAULT NULL COMMENT '学位',
  `YEAR_INCOME` int(11) DEFAULT NULL COMMENT '年收入',
  `INDUSTRY` varchar(64) DEFAULT NULL COMMENT '行业',
  `JOB` varchar(64) DEFAULT NULL COMMENT '职业',
  `COMPANY` varchar(128) DEFAULT NULL COMMENT '公司名称',
  `COMPANY_TYPE` varchar(64) DEFAULT NULL COMMENT '单位性质',
  `DEPARTMENT` varchar(64) DEFAULT NULL COMMENT '所在部门',
  `POSITION` varchar(64) DEFAULT NULL COMMENT '职位',
  `WORK_TIME` int(11) DEFAULT NULL COMMENT '该单位工作时间',
  `WORK_TIME_UNIT` varchar(4) DEFAULT NULL COMMENT '该单位工作时间单位',
  `CLIENT_AREA` varchar(64) DEFAULT NULL COMMENT '客户所在地域',
  `CLIENT_TYPE` varchar(32) DEFAULT NULL COMMENT '客户类型',
  `F_NATION` varchar(64) DEFAULT NULL COMMENT '家庭地址_国家',
  `F_PROVINCE` varchar(64) DEFAULT NULL COMMENT '家庭地址_省州',
  `F_CITY` varchar(64) DEFAULT NULL COMMENT '家庭地址_城市',
  `F_AREA` varchar(64) DEFAULT NULL COMMENT '家庭地址_区县',
  `F_STREET` varchar(128) DEFAULT NULL COMMENT '家庭地址_街道单元',
  `F_ZIPCODE` varchar(32) DEFAULT NULL COMMENT '家庭地址_邮政编码',
  `C_NATION` varchar(64) DEFAULT NULL COMMENT '公司地址_国家',
  `C_PROVINCE` varchar(64) DEFAULT NULL COMMENT '公司地址_省州',
  `C_CITY` varchar(64) DEFAULT NULL COMMENT '公司地址_城市',
  `C_AREA` varchar(64) DEFAULT NULL COMMENT '公司地址_区县',
  `C_STREET` varchar(128) DEFAULT NULL COMMENT '公司地址_街道单元',
  `C_ZIPCODE` varchar(32) DEFAULT NULL COMMENT '公司地址_邮政编码',
  `MOBILE1` varchar(20) DEFAULT NULL COMMENT '移动电话1',
  `MOBILE2` varchar(20) DEFAULT NULL COMMENT '移动电话2',
  `MOBILE3` varchar(20) DEFAULT NULL COMMENT '移动电话3',
  `F_TEL1` varchar(20) DEFAULT NULL COMMENT '家庭电话1 ',
  `F_TEL2` varchar(20) DEFAULT NULL COMMENT '家庭电话2',
  `F_TEL3` varchar(20) DEFAULT NULL COMMENT '家庭电话3',
  `C_TEL1` varchar(20) DEFAULT NULL COMMENT '公司电话1',
  `C_TEL2` varchar(20) DEFAULT NULL COMMENT '公司电话2',
  `C_TEL3` varchar(20) DEFAULT NULL COMMENT '公司电话3',
  `EMAIL1` varchar(64) DEFAULT NULL COMMENT '电子邮箱1',
  `EMAIL2` varchar(64) DEFAULT NULL COMMENT '电子邮箱2',
  `EMAIL3` varchar(64) DEFAULT NULL COMMENT '电子邮箱3',
  `CREDIT_AMOUNT` int(11) DEFAULT NULL COMMENT '信用卡额度',
  `SOCIALl_SECURITY` varchar(20) DEFAULT NULL COMMENT '是否拥有社保基金 Y：有  N：无',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户_借款人信息';

/*Data for the table `nplm_borrower_info` */

insert  into `nplm_borrower_info`(`id`,`APPLY_CLIENT_ID`,`ECIF_ID`,`CLIENT_NAME`,`MOBILE`,`OLD_NAME`,`SEX`,`NATION`,`BIRTHDAY`,`MARITAL`,`HAVE_CHILDREN`,`CHILDREN_COUNT`,`NATIONALITY`,`H_PROVINCE`,`H_CITY`,`H_DRESS`,`IDENTITY_TYPE`,`IDENTITY_NUM`,`IDENTITY_VALID_DATE`,`HAVE_CAR`,`HOUSE_EXPLAIN`,`RESIDE_EXPLAIN`,`RESIDE_YEAR`,`DEGREE`,`DIPLOMA`,`YEAR_INCOME`,`INDUSTRY`,`JOB`,`COMPANY`,`COMPANY_TYPE`,`DEPARTMENT`,`POSITION`,`WORK_TIME`,`WORK_TIME_UNIT`,`CLIENT_AREA`,`CLIENT_TYPE`,`F_NATION`,`F_PROVINCE`,`F_CITY`,`F_AREA`,`F_STREET`,`F_ZIPCODE`,`C_NATION`,`C_PROVINCE`,`C_CITY`,`C_AREA`,`C_STREET`,`C_ZIPCODE`,`MOBILE1`,`MOBILE2`,`MOBILE3`,`F_TEL1`,`F_TEL2`,`F_TEL3`,`C_TEL1`,`C_TEL2`,`C_TEL3`,`EMAIL1`,`EMAIL2`,`EMAIL3`,`CREDIT_AMOUNT`,`SOCIALl_SECURITY`,`CREATOR`,`CREATE_TIME`,`UPDATER`,`UPDATE_TIME`,`UPDATE_TYPE`) values (1,272822,1,'张三','18910691111','张四','男','汉','9.21','已婚',1,0,'中国','北京','北京',NULL,'二代身份证','328789273','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-20 19:12:43',NULL,'0000-00-00 00:00:00',NULL),(2,2,2,'李四','12345','礼物','男','汉','9.21','已婚',2,1,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 15:23:47',NULL,'0000-00-00 00:00:00',NULL),(3,3,3,'王五','12345','王五','男','汉','9.21','已婚',3,2,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 14:35:06',NULL,'0000-00-00 00:00:00',NULL),(4,4,4,'王4','12345','王4','男','汉','9.21','已婚',4,4,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 14:35:06',NULL,'0000-00-00 00:00:00',NULL),(5,5,5,'王5','12345','王5','男','汉','9.21','已婚',4,4,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 14:35:06',NULL,'0000-00-00 00:00:00',NULL),(6,6,6,'王6','12345','王6','男','汉','9.21','已婚',6,6,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 14:35:06',NULL,'0000-00-00 00:00:00',NULL),(7,7,7,'王7','12345','王7','男','汉','9.21','已婚',7,7,'中国','河北','河北',NULL,'二代身份证','54323223','10年',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2018-08-21 14:35:06',NULL,'0000-00-00 00:00:00',NULL);

/*Table structure for table `nplm_contract_attribute` */

DROP TABLE IF EXISTS `nplm_contract_attribute`;

CREATE TABLE `nplm_contract_attribute` (
  `id` int(11) NOT NULL COMMENT '主键',
  `loan_contract_id` int(11) DEFAULT NULL COMMENT '合同id',
  `LOAN_CONTRACT_NUM` int(11) DEFAULT NULL COMMENT '合同编号',
  `business_type` varchar(20) DEFAULT NULL COMMENT '业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一',
  `is_expedited` varchar(2) DEFAULT NULL COMMENT '是否加急 Y : 是   N ： 否',
  `sign_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '签署时间',
  `sign_type` int(11) DEFAULT NULL COMMENT '签约方式 1：纸质  2：电子签约',
  `approve_date` varchar(10) DEFAULT NULL COMMENT '审核日期',
  `first_repay_date` varchar(10) NOT NULL COMMENT '首期还款时间',
  `fee_flag` int(11) DEFAULT NULL COMMENT '收费方式 1:趸缴 2:双棒 3:期缴',
  `interest_flag` varchar(3) DEFAULT NULL COMMENT '计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天',
  `interest_type` int(11) DEFAULT NULL COMMENT '计息类型 1: 按期计息 2 :按实际天数计息\n            ',
  `grace_days` int(11) DEFAULT NULL COMMENT '宽限期',
  `irr` int(11) DEFAULT NULL COMMENT 'IRR',
  `lns_rate` int(11) DEFAULT NULL COMMENT '利率',
  `channel_code` varchar(32) DEFAULT NULL COMMENT '进件渠道代码：GD，CX，XW，RZ',
  `channel_name` varchar(64) DEFAULT NULL COMMENT '进件渠道：个贷、创新、小微、融资',
  `loan_officer_id` varchar(32) DEFAULT NULL COMMENT '所属信贷员ID',
  `cityID` varchar(32) DEFAULT NULL COMMENT '管辖城市ID',
  `city` varchar(32) DEFAULT NULL COMMENT '管辖城市',
  `is_modify` varchar(20) DEFAULT NULL COMMENT '是否合同变更 Y:是  N:否',
  `is_scheme_modify` varchar(20) DEFAULT NULL COMMENT '是否还款方案变更 Y:是  N:否',
  `recycle_way` int(11) DEFAULT NULL COMMENT '循环贷方式 1:差额  2:先结清旧合同 后放新合同款',
  `is_recycle_load` varchar(20) DEFAULT NULL COMMENT '是否循环贷 Y:是  N:否',
  `recycle_loan_cnt` int(11) DEFAULT NULL COMMENT '循环贷次数',
  `old_contract_num` varchar(64) DEFAULT NULL COMMENT '旧合同号',
  `settle_amount` int(11) DEFAULT NULL COMMENT '循环贷结清上一笔金额',
  `new_contract_num` varchar(64) DEFAULT NULL COMMENT '合同变更后新合同编号',
  `is_shorten` varchar(20) DEFAULT NULL COMMENT '是否缩期 Y:是  N:否',
  `is_extend` varchar(20) DEFAULT NULL COMMENT '是否展期 Y:是  N:否',
  `is_change_produce` varchar(20) DEFAULT NULL COMMENT '是否转产品',
  `is_overdue` varchar(20) DEFAULT NULL COMMENT '是否违约 Y:是  N:否',
  `is_pay_ahead` varchar(20) DEFAULT 'N' COMMENT '是否一次性提前还款',
  `is_pay_part` varchar(20) DEFAULT 'N' COMMENT '是否部分提前还款',
  `purpose` varchar(64) DEFAULT NULL COMMENT '借款用途',
  `purpose_son` varchar(64) DEFAULT NULL COMMENT '借款子用途',
  `purpose_detail` varchar(128) DEFAULT NULL COMMENT '详细借款用途',
  `is_div_account` varchar(20) DEFAULT NULL COMMENT '是否分账户回款 Y：是  N：否',
  `system_type` varchar(20) DEFAULT '0' COMMENT '合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统',
  `high_risk` varchar(10) DEFAULT NULL COMMENT '高危标识 1:高位 0或空 非高危',
  `is_buyout` varchar(20) DEFAULT NULL COMMENT '是否买断 Y：是  N：否',
  `fee_process_type` varchar(20) DEFAULT '1' COMMENT '前期费用处理模式 1:线上   2:线下? 默认线上',
  `student_corp_name` varchar(64) DEFAULT NULL COMMENT '助学贷合作机构名称',
  `settle_date` varchar(10) DEFAULT NULL COMMENT '合同结清日期',
  `habit_time` varchar(5) DEFAULT NULL COMMENT '习惯打款时间',
  `RepayDay` varchar(2) DEFAULT NULL COMMENT '还款日',
  `apply_Id` varchar(32) DEFAULT NULL COMMENT '系统申请进件编号',
  `old_Apply_Id` varchar(32) DEFAULT NULL COMMENT '系统申请进件父编号',
  `dept_id` varchar(32) DEFAULT NULL COMMENT '营业部编号',
  `dept_name` varchar(64) DEFAULT NULL COMMENT '营业部名称',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  `FRONT_CHARGE_DISCOUNT` int(11) DEFAULT '1' COMMENT '前期服务费折扣',
  `MONTH_M_RATE` int(11) DEFAULT NULL COMMENT '月管理费率',
  `HANDLE_CHARGE_RATE` int(11) DEFAULT NULL COMMENT '手续费率',
  `LOAN_TIMES` int(11) DEFAULT '1' COMMENT '贷款次数',
  `PAWN` varchar(64) DEFAULT NULL COMMENT '抵押物',
  `HANDLE_CHARGE` int(11) DEFAULT NULL COMMENT '手续费',
  `MONTH_CHARGE_DISCOUNT` int(11) DEFAULT '1' COMMENT '分期服务费折扣',
  `GUARANTEE_FEE` int(11) DEFAULT NULL COMMENT '担保费',
  `GUARANTEE_COMPANY` varchar(128) DEFAULT NULL COMMENT '担保公司',
  `LOAN_TYPE` varchar(128) DEFAULT NULL COMMENT '贷款品种',
  `TRUST_COMPANY` varchar(128) DEFAULT NULL COMMENT '信托机构',
  `TRUST_PRODUCT` varchar(128) DEFAULT NULL COMMENT '信托产品系列',
  `TRUST_PLAN` varchar(128) DEFAULT NULL COMMENT '信托计划',
  `CHANGE_TYPE` varchar(128) DEFAULT NULL COMMENT '合同变更类型',
  `CHANGE_AMOUNT` varchar(128) DEFAULT NULL COMMENT '合同变更金额',
  `def7` varchar(128) DEFAULT NULL COMMENT '自定义字段1',
  `def8` varchar(128) DEFAULT NULL COMMENT '自定义字段1',
  `def9` varchar(128) DEFAULT NULL COMMENT '自定义字段1',
  `def10` varchar(128) DEFAULT NULL COMMENT '自定义字段1',
  PRIMARY KEY (`id`,`first_repay_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同_合同属性表';

/*Data for the table `nplm_contract_attribute` */

insert  into `nplm_contract_attribute`(`id`,`loan_contract_id`,`LOAN_CONTRACT_NUM`,`business_type`,`is_expedited`,`sign_date`,`sign_type`,`approve_date`,`first_repay_date`,`fee_flag`,`interest_flag`,`interest_type`,`grace_days`,`irr`,`lns_rate`,`channel_code`,`channel_name`,`loan_officer_id`,`cityID`,`city`,`is_modify`,`is_scheme_modify`,`recycle_way`,`is_recycle_load`,`recycle_loan_cnt`,`old_contract_num`,`settle_amount`,`new_contract_num`,`is_shorten`,`is_extend`,`is_change_produce`,`is_overdue`,`is_pay_ahead`,`is_pay_part`,`purpose`,`purpose_son`,`purpose_detail`,`is_div_account`,`system_type`,`high_risk`,`is_buyout`,`fee_process_type`,`student_corp_name`,`settle_date`,`habit_time`,`RepayDay`,`apply_Id`,`old_Apply_Id`,`dept_id`,`dept_name`,`CREATOR`,`CREATE_TIME`,`UPDATER`,`UPDATE_TIME`,`UPDATE_TYPE`,`FRONT_CHARGE_DISCOUNT`,`MONTH_M_RATE`,`HANDLE_CHARGE_RATE`,`LOAN_TIMES`,`PAWN`,`HANDLE_CHARGE`,`MONTH_CHARGE_DISCOUNT`,`GUARANTEE_FEE`,`GUARANTEE_COMPANY`,`LOAN_TYPE`,`TRUST_COMPANY`,`TRUST_PRODUCT`,`TRUST_PLAN`,`CHANGE_TYPE`,`CHANGE_AMOUNT`,`def7`,`def8`,`def9`,`def10`) values (0,NULL,NULL,NULL,NULL,'2018-08-21 19:24:28',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'N','N','买车',NULL,NULL,NULL,'0',NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0000-00-00 00:00:00',NULL,'0000-00-00 00:00:00',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(1,13242378,123,'4','N','2018-08-21 15:24:45',1,'8.20','8.20',1,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',1,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','2018-08-20 16:19:18',NULL,'2018-08-20 16:19:45',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(2,456,456,'2','N','2018-08-21 19:21:47',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','2018-08-20 16:19:18',NULL,'2018-08-20 16:19:45',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(3,135,135,'3','N','2018-08-21 19:24:21',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','2018-08-20 16:19:18',NULL,'2018-08-20 16:19:45',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(4,444,444,'4','N','2018-08-21 19:25:20',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','0000-00-00 00:00:00',NULL,'0000-00-00 00:00:00',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(5,555,555,'5','N','2018-08-21 19:25:20',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','0000-00-00 00:00:00',NULL,'0000-00-00 00:00:00',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(6,666,666,'6','N','2018-08-21 19:25:21',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','0000-00-00 00:00:00',NULL,'0000-00-00 00:00:00',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL),(7,777,777,'7','N','2018-08-21 19:25:24',2,'8.20','8.20',2,'M',2,30,NULL,5,NULL,NULL,NULL,NULL,NULL,'Y','Y',2,'Y',5,'13456Y5Y45',60000,'13245354','Y','Y','Y','Y','N','N','买车',NULL,NULL,NULL,'2',NULL,'N','1','带带乐',NULL,NULL,NULL,NULL,NULL,'1632','昌平营业部','赵柳','0000-00-00 00:00:00',NULL,'0000-00-00 00:00:00',NULL,1,NULL,NULL,1,NULL,NULL,1,NULL,NULL,'信贷','易代乐','23','lele','123123','40000',NULL,NULL,NULL,NULL);

/*Table structure for table `nplm_loan_contract` */

DROP TABLE IF EXISTS `nplm_loan_contract`;

CREATE TABLE `nplm_loan_contract` (
  `ID` varchar(32) NOT NULL COMMENT 'id',
  `LOAN_CONTRACT_NUM` varchar(64) DEFAULT NULL COMMENT '合同编号',
  `borrower_id` varchar(32) DEFAULT NULL COMMENT '借款人id',
  `ECIF_ID` varchar(20) DEFAULT NULL COMMENT 'ECIF客户号',
  `pro_CATEGORY_CODE` varchar(64) DEFAULT NULL COMMENT '产品分类代码',
  `pro_CATEGORY_NAME` varchar(128) DEFAULT NULL COMMENT '产品分类名称',
  `PRODUCT_INFO_ID` int(11) DEFAULT NULL COMMENT '产品信息id',
  `LOAN_INSTALMENTS` int(11) DEFAULT NULL COMMENT '贷款分期数',
  `LOAN_INSTALMENT_UNIT` varchar(64) DEFAULT NULL COMMENT '贷款分期单位',
  `LOAN_AMOUNT` int(11) DEFAULT NULL COMMENT '贷款金额',
  `PRE_FEE` int(11) DEFAULT NULL COMMENT '前期费用',
  `PUT_AMOUNT` int(11) DEFAULT NULL COMMENT '放款金额',
  `CREDIT_TYPE` varchar(2) DEFAULT NULL COMMENT '贷款形式 1为信用，2为担保，3为抵押，4为其他',
  `PAY_MOD` varchar(6) DEFAULT NULL COMMENT '支付方式 THIRD:第三方渠道  BANK:银行渠道',
  `REPAY_WAY` varchar(2) DEFAULT NULL COMMENT '还款方式\n            01-等额本息 \n            02-等额本金 \n            03-等本等息 \n            04-付息通\n            05-一次性还本付息\n            06-等比累进\n            07-等额累进\n            08-0+N\n            09-分阶段还款',
  `LOAN_TYPE` varchar(2) DEFAULT NULL COMMENT '放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）',
  `SALE_DEPARTMENT_ID` int(11) DEFAULT NULL COMMENT '销售部门id',
  `REPAY_ACCOUNT_NAME` varchar(32) DEFAULT NULL COMMENT '还款账户姓名',
  `REPAY_ACCT_IDEN_TYPE` varchar(2) DEFAULT NULL COMMENT '还款账户证件类型',
  `REPAY_ACCT_IDEN_NUM` varchar(30) DEFAULT NULL COMMENT '还款账户证件号',
  `REPAY_ACCOUNT` varchar(30) DEFAULT NULL COMMENT '还款账户',
  `REPAY_ACCOUNT_TYPE` varchar(2) DEFAULT NULL COMMENT '还款账户卡折标识',
  `REPAY_ACCOUNT_BANKID` varchar(12) DEFAULT NULL COMMENT '还款账户银行行别代码',
  `REPAY_ACT_BRANCH_NO` varchar(32) DEFAULT NULL COMMENT '还款账户开户行行号(支付行号)',
  `REPAY_ACCOUNT_BANK_NAME` varchar(128) DEFAULT NULL COMMENT '还款账户开户行名称',
  `PUBLIC_PRIVATE` varchar(2) DEFAULT NULL COMMENT '还款账户对公对私标识',
  `REPAY_ACT_PROVINCE` varchar(64) DEFAULT NULL COMMENT '还款账户开户省',
  `REPAY_ACCOUNT_CITY` varchar(64) DEFAULT NULL COMMENT '还款账户开户市',
  `POS_STATUS` varchar(10) DEFAULT NULL COMMENT 'POS验证状态 未验证 0014 已验证为空',
  `START_DATE` date DEFAULT NULL COMMENT '首期还款日',
  `END_DATE` date DEFAULT NULL COMMENT '末期还款日',
  `CONTRACT_SOURCE` varchar(30) DEFAULT NULL COMMENT '合同来源：\n            NPLM_ICMP	综合信贷\n            NPLM_RZZL	融资租赁\n            NPLM_CDXT	车贷系统\n            NPLM_FDXT	房贷系统\n            ',
  `REPAY_BALANCE` int(11) DEFAULT '0' COMMENT '未分配还款额',
  `CONTRACT_TYPE` varchar(2) DEFAULT NULL COMMENT '合同状态:\n            -1：合同废止\n            0：未放款，1：还款中，2：逾期，\n            9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `REMARK` varchar(256) DEFAULT NULL COMMENT '备注',
  `CYCLE_CREDIT_ID` varchar(32) DEFAULT NULL COMMENT '循环授信编号',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同_贷款合同表';

/*Data for the table `nplm_loan_contract` */

insert  into `nplm_loan_contract`(`ID`,`LOAN_CONTRACT_NUM`,`borrower_id`,`ECIF_ID`,`pro_CATEGORY_CODE`,`pro_CATEGORY_NAME`,`PRODUCT_INFO_ID`,`LOAN_INSTALMENTS`,`LOAN_INSTALMENT_UNIT`,`LOAN_AMOUNT`,`PRE_FEE`,`PUT_AMOUNT`,`CREDIT_TYPE`,`PAY_MOD`,`REPAY_WAY`,`LOAN_TYPE`,`SALE_DEPARTMENT_ID`,`REPAY_ACCOUNT_NAME`,`REPAY_ACCT_IDEN_TYPE`,`REPAY_ACCT_IDEN_NUM`,`REPAY_ACCOUNT`,`REPAY_ACCOUNT_TYPE`,`REPAY_ACCOUNT_BANKID`,`REPAY_ACT_BRANCH_NO`,`REPAY_ACCOUNT_BANK_NAME`,`PUBLIC_PRIVATE`,`REPAY_ACT_PROVINCE`,`REPAY_ACCOUNT_CITY`,`POS_STATUS`,`START_DATE`,`END_DATE`,`CONTRACT_SOURCE`,`REPAY_BALANCE`,`CONTRACT_TYPE`,`CREATOR`,`UPDATER`,`CREATE_TIME`,`UPDATE_TIME`,`REMARK`,`CYCLE_CREDIT_ID`,`UPDATE_TYPE`) values ('1','123','123456','1','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'张三','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 14:40:11','2018-08-20 16:04:36',NULL,NULL,NULL),('2','456','2','2','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'张三','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 15:22:21','2018-08-20 16:04:36',NULL,NULL,NULL),('3','135','3','3','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'王五','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 15:22:26','2018-08-20 16:04:36',NULL,NULL,NULL),('4','444','4','4','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'王五','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 19:16:39','2018-08-20 16:04:36',NULL,NULL,NULL),('5','555','5','5','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'王五','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 19:16:40','2018-08-20 16:04:36',NULL,NULL,NULL),('6','666','6','6','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'王五','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 19:16:40','2018-08-20 16:04:36',NULL,NULL,NULL),('7','777','7','7','车贷','乐贷',512246,12,'2组',70000,50000,12,'顶级','银行渠道','02','1',2,'王五','二代','12345467','90127662734762','2','03','67732756287568236','北京银行','1','v','北京','已验证','2018-08-07','2018-09-07','综合信贷',20000,'1','李四','123','2018-08-21 19:16:45','2018-08-20 16:04:36',NULL,NULL,NULL);

/*Table structure for table `nplm_overdue_contract` */

DROP TABLE IF EXISTS `nplm_overdue_contract`;

CREATE TABLE `nplm_overdue_contract` (
  `id` varchar(32) NOT NULL,
  `LOAN_CONTRACT_NUM` varchar(64) DEFAULT NULL COMMENT '合同编号',
  `OVERDUE_STATUS` varchar(20) DEFAULT NULL COMMENT '逾期状态\n            2：逾期，\n            9：正常还清',
  `OVERDUE_DAYS` int(11) DEFAULT NULL COMMENT '现存逾期天数',
  `INSTALMENT_CNT` int(11) DEFAULT NULL COMMENT '现存逾期期数',
  `ALL_DAYS` int(11) DEFAULT NULL COMMENT '累积逾期天数',
  `ALL_INSTALMENT_CNT` int(11) DEFAULT NULL COMMENT '累积逾期期数',
  `ALL_NUMBER` int(11) DEFAULT NULL COMMENT '累积逾期次数',
  `PRINCIPAL_INTEREST` int(11) DEFAULT NULL COMMENT '尚欠本息',
  `ALL_FORFEIT` int(11) DEFAULT NULL COMMENT '滞纳金总额',
  `ALL_AMERCE` int(11) DEFAULT NULL COMMENT '罚息总额',
  `ALL_SHOULD` int(11) DEFAULT NULL COMMENT '累计应收款',
  `ALL_INDEED` int(11) DEFAULT NULL COMMENT '累计实收款',
  `CURRENT_REPAY` int(11) DEFAULT NULL COMMENT '当期应还总金额',
  `ALL_REPAYMENT_AMOUNT` int(11) DEFAULT NULL COMMENT '一次性结清金额',
  `FIRST_DATE` varchar(10) DEFAULT NULL COMMENT '首次逾期日期',
  `START_DATE` varchar(10) DEFAULT NULL COMMENT '现存逾期开始日期',
  `SERIAL_START_DATE` varchar(10) DEFAULT NULL COMMENT '首次出现连续逾期的开始日期',
  `OVERDUE_HISTORY` varchar(256) DEFAULT NULL COMMENT '过去18个月逾期历史',
  `COMPUTE_DATE` varchar(10) DEFAULT NULL COMMENT '计算违约日期',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='还款_逾期合同表';

/*Data for the table `nplm_overdue_contract` */

/*Table structure for table `nplm_repayment_detail` */

DROP TABLE IF EXISTS `nplm_repayment_detail`;

CREATE TABLE `nplm_repayment_detail` (
  `ID` int(11) NOT NULL COMMENT 'id',
  `REPAYMENT_PLAN_ID` int(11) DEFAULT NULL COMMENT '还款计划id',
  `REPAYMENT_RECORD_ID` int(11) DEFAULT NULL COMMENT '还款记录id',
  `BUSINESS_REQUEST_ID` int(11) DEFAULT NULL COMMENT '业务请求ID',
  `LOAN_CONTRACT_NUM` int(11) DEFAULT NULL COMMENT '合同编号',
  `REPAYMENT_DATE` date DEFAULT NULL COMMENT '还款请求日期',
  `INSTALMENT` int(11) DEFAULT NULL COMMENT '所属分期',
  `SHOULD_CAPITAL` int(11) DEFAULT '0' COMMENT '应收本金',
  `SHOULD_INTEREST` int(11) DEFAULT '0' COMMENT '应收利息',
  `SHOULD_INST_FEE` int(11) DEFAULT '0' COMMENT '应收分期费用',
  `SHOULD_AMERCE` int(11) DEFAULT '0' COMMENT '应收罚息',
  `SHOULD_FORFEIT` int(11) DEFAULT '0' COMMENT '应收滞纳金',
  `should_penalty` int(11) DEFAULT '0' COMMENT '应收违约金',
  `should_change_fee` int(11) DEFAULT '0' COMMENT '应收变更手续费',
  `SHOULD_OTHER_FEE` int(11) DEFAULT '0' COMMENT '应收其他费用',
  `SHOULD_AMOUNT` int(11) DEFAULT '0' COMMENT '应收总额',
  `INDEED_CAPITAL` int(11) DEFAULT '0' COMMENT '实收本金',
  `INDEED_INTEREST` int(11) DEFAULT '0' COMMENT '实收利息',
  `INDEED_INST_FEE` int(11) DEFAULT '0' COMMENT '实收分期费用',
  `INDEED_AMERCE` int(11) DEFAULT '0' COMMENT '实收罚息',
  `INDEED_FORFEIT` int(11) DEFAULT '0' COMMENT '实收滞纳金',
  `indeed_penalty` int(11) DEFAULT '0' COMMENT '实收违约金',
  `indeed_change_fee` int(11) DEFAULT '0' COMMENT '实收变更手续费',
  `indeed_OTHER_FEE` int(11) DEFAULT '0' COMMENT '实收其他费用',
  `INDEED_AMOUNT` int(11) DEFAULT '0' COMMENT '实收总额',
  `STATUS` varchar(2) DEFAULT NULL COMMENT '还款状态\n            0	处理中\n            1	成功\n            2	失败\n            3	部分成功\n            4	已撤销\n            5              不执行',
  `reduce_CAPITAL` int(11) DEFAULT '0' COMMENT '减免本金',
  `reduce_INTEREST` int(11) DEFAULT '0' COMMENT '减免利息',
  `reduce_AMERCE` int(11) DEFAULT '0' COMMENT '减免罚息',
  `reduce_FORFEIT` int(11) DEFAULT '0' COMMENT '减免滞纳金',
  `reduce_penalty` int(11) DEFAULT '0' COMMENT '减免违约金',
  `reduce_INST_FEE` int(11) DEFAULT '0' COMMENT '减免分期费用',
  `reduce_PRE_FEE` int(11) DEFAULT '0' COMMENT '减免前期费用',
  `reduce_OTHER_FEE` int(11) DEFAULT '0' COMMENT '减免其他费用',
  `data_create_type` varchar(2) DEFAULT NULL COMMENT '数据创建类型：\n            0	前期费用(先放后收模式)\n            1	正常\n            2	逾期\n            3	预约-逾期\n            4	预约-正常\n            5	预约-一次性提前还款\n            6	预约-部分提前还款\n            7	预约-前期费用\n            8	展期\n            9	转产品\n            10	部分提前还款\n            11	循环贷结清\n            12	退款-保证金\n            13	退款-还款\n            14	退款-前期费用\n            15	减免\n            16	减免结清\n            17	线下-正常\n            18	保证金抵偿\n            19	前期费用(先收后放模式)\n            20	线下-提前还款\n            21	晚确认提前还款结清\n            22	前期费用（差额放款模式）\n            23	线下-前期费用\n            24	线下-展期费用\n            25	逾期-晚回盘补算逾期\n            26	逾期-前期费用\n            \n            \n            ',
  `REMARK` varchar(256) DEFAULT NULL COMMENT '备注',
  `SPECIAL_CODE` varchar(8) DEFAULT NULL COMMENT '划扣特殊标识',
  `SORT` int(11) DEFAULT NULL COMMENT '扣款顺序',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='还款_还款记录详情表';

/*Data for the table `nplm_repayment_detail` */

/*Table structure for table `nplm_repayment_plan` */

DROP TABLE IF EXISTS `nplm_repayment_plan`;

CREATE TABLE `nplm_repayment_plan` (
  `ID` int(11) NOT NULL COMMENT 'id',
  `LOAN_CONTRACT_NUM` int(11) DEFAULT NULL COMMENT '合同编号',
  `INSTALMENT` int(11) DEFAULT NULL COMMENT '所属分期',
  `PRE_REPAYMENT_DATE` date DEFAULT NULL COMMENT '上一还款日期',
  `REPAYMENT_DATE` date DEFAULT NULL COMMENT '还款日期',
  `CAPITAL` int(11) DEFAULT '0' COMMENT '应收本金',
  `INTEREST` int(11) DEFAULT '0' COMMENT '应收利息',
  `INSTALLMENT_FEE` int(11) DEFAULT '0' COMMENT '应收分期费用',
  `AMERCE` int(11) DEFAULT '0' COMMENT '应收罚息',
  `FORFEIT` int(11) DEFAULT '0' COMMENT '应收滞纳金',
  `PENALTY` int(11) DEFAULT '0' COMMENT '应收滞纳金',
  `change_fee` int(11) DEFAULT '0' COMMENT '应收变更手续费',
  `OTHER_FEE` int(11) DEFAULT '0' COMMENT '应收其他费用',
  `REPAYMENT_AMOUNT` int(11) DEFAULT '0' COMMENT '应收还款总额',
  `INDEED_CAPITAL` int(11) DEFAULT '0' COMMENT '实收本金',
  `INDEED_INTEREST` int(11) DEFAULT '0' COMMENT '实收利息',
  `INDEED_INST_FEE` int(11) DEFAULT '0' COMMENT '实收分期费用',
  `INDEED_AMERCE` int(11) DEFAULT '0' COMMENT '实收罚息',
  `INDEED_FORFEIT` int(11) DEFAULT '0' COMMENT '实收滞纳金',
  `indeed_penalty` int(11) DEFAULT '0' COMMENT '实收违约金',
  `indeed_change_fee` int(11) DEFAULT '0' COMMENT '实收变更手续费',
  `indeed_OTHER_FEE` int(11) DEFAULT '0' COMMENT '实收其他费用',
  `INDEED_AMOUNT` int(11) DEFAULT '0' COMMENT '实收总额',
  `reduce_CAPITAL` int(11) DEFAULT '0' COMMENT '减免本金',
  `reduce_INTEREST` int(11) DEFAULT '0' COMMENT '减免利息',
  `reduce_AMERCE` int(11) DEFAULT '0' COMMENT '减免罚息',
  `reduce_FORFEIT` int(11) DEFAULT '0' COMMENT '减免滞纳金',
  `reduce_INST_FEE` int(11) DEFAULT '0' COMMENT '减免分期费用',
  `reduce_penalty` int(11) DEFAULT '0' COMMENT '减免违约金',
  `reduce_PRE_FEE` int(11) DEFAULT '0' COMMENT '减免前期费用',
  `reduce_OTHER_FEE` int(11) DEFAULT '0' COMMENT '减免其他费用',
  `REMAIN_CAPITAL` int(11) DEFAULT '0' COMMENT '剩余本金',
  `NPV_remain_capital` int(11) DEFAULT '0' COMMENT 'NPV剩余本金',
  `ALL_REPAYMENT_AMOUNT` int(11) DEFAULT '0' COMMENT '一次性全部提前还款金额',
  `REPAYMENT_STATE` varchar(2) DEFAULT NULL COMMENT '还款状态：\n            0	未还款\n            1	已还款\n            2	部分还款\n            3	逾期\n            4	未满足收款条件（前期费用收取用）\n            ',
  `REMARK` varchar(256) DEFAULT NULL COMMENT '备注',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `IS_OPERATING` varchar(20) DEFAULT NULL COMMENT 'Y:是  N：否',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='还款_还款计划表';

/*Data for the table `nplm_repayment_plan` */

/*Table structure for table `nplm_repayment_record` */

DROP TABLE IF EXISTS `nplm_repayment_record`;

CREATE TABLE `nplm_repayment_record` (
  `ID` int(11) NOT NULL COMMENT 'id',
  `BUSINESS_REQUEST_ID` int(11) DEFAULT NULL COMMENT '业务请求ID',
  `LOAN_CONTRACT_NUM` int(11) DEFAULT NULL COMMENT '合同编号',
  `REPAYMENT_DATE` date DEFAULT NULL COMMENT '还款请求日期',
  `OVERDUE_DAYS` int(11) DEFAULT NULL COMMENT '逾期天数',
  `OVERDUE_AMOUNT` int(11) DEFAULT NULL COMMENT '逾期总金额',
  `REPAYMENT_AMOUNT` int(11) DEFAULT '0' COMMENT '扣款金额',
  `SUCCESS_AMOUNT` int(11) DEFAULT '0' COMMENT '成功金额',
  `STATUS` varchar(2) DEFAULT NULL COMMENT '还款状态\n            0	处理中\n            1	成功\n            2	失败\n            3	部分成功\n            4	已撤销\n            5              不执行\n            ',
  `REMARK` varchar(256) DEFAULT NULL COMMENT '备注',
  `SPECIAL_CODE` varchar(8) DEFAULT NULL COMMENT '划扣特殊标识',
  `SORT` int(11) DEFAULT NULL COMMENT '扣款顺序',
  `data_create_type` varchar(2) DEFAULT NULL COMMENT '数据创建类型：\n            0	前期费用(先放后收模式)\n            1	正常\n            2	逾期\n            3	预约-逾期\n            4	预约-正常\n            5	预约-一次性提前还款\n            6	预约-部分提前还款\n            7	预约-前期费用\n            8	展期\n            9	转产品\n            10	部分提前还款\n            11	循环贷结清\n            12	退款-保证金\n            13	退款-还款\n            14	退款-前期费用\n            15	减免\n            16	减免结清\n            17	线下-正常\n            18	保证金抵偿\n            19	前期费用(先收后放模式)\n            20	线下-提前还款\n            21	晚确认提前还款结清\n            22	前期费用（差额放款模式）\n            23	线下-前期费用\n            24	线下-展期费用\n            25	逾期-晚回盘补算逾期\n            26	逾期-前期费用',
  `RESERVE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  `CREATOR` varchar(32) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `UPDATER` varchar(32) DEFAULT NULL COMMENT '末次修改者',
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '末次修改时间',
  `ACCOUNT_NAME` varchar(32) DEFAULT NULL COMMENT '账户姓名',
  `ACCT_IDEN_TYPE` varchar(2) DEFAULT NULL COMMENT '账户证件类型',
  `ACCT_IDEN_NUM` varchar(30) DEFAULT NULL COMMENT '账户证件号',
  `ACCOUNT_NO` varchar(30) DEFAULT NULL COMMENT '账户',
  `ACCOUNT_TYPE` varchar(2) DEFAULT NULL COMMENT '账户卡折标识',
  `ACCOUNT_BANKID` varchar(12) DEFAULT NULL COMMENT '账户银行行别代码',
  `ACCOUNT_BRANCH_NO` varchar(32) DEFAULT NULL COMMENT '账户开户行行号(支付行号)',
  `ACCOUNT_BANK_NAME` varchar(128) DEFAULT NULL COMMENT '账户开户行名称',
  `PUBLIC_PRIVATE` varchar(2) DEFAULT NULL COMMENT '账户对公对私标识',
  `ACT_PROVINCE` varchar(64) DEFAULT NULL COMMENT '账户开户省',
  `ACCOUNT_CITY` varchar(64) DEFAULT NULL COMMENT '账户开户市',
  `UPDATE_TYPE` varchar(20) DEFAULT NULL COMMENT '修改类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='还款_还款记录表';

/*Data for the table `nplm_repayment_record` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
