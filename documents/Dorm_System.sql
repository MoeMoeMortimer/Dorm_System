drop table DA;
drop table DT;
drop table SD;
drop table Repairs;
drop table Curfew;
drop table Mail;
drop table LeaveSchool;
drop table Asset;
drop table Dormitory;
drop table Building;
drop table Teacher;
drop table Student;
drop table Users;


--创建User表
create table Users
(Uno char(11) primary key,	--用户名
 Pass char(20) not null,	--密码
 Pri char(1)				--权限（0为学生，1为老师）
);
--对Pri添加check约束
alter table Users
add constraint CK_Pri check(Pri='1' or Pri='0');

insert into Users values('2110','2110','1');
insert into Users values('2111','2111','1');
insert into Users values('2120','2120','1');
insert into Users values('2121','2121','1');
insert into Users values('2122','2122','1');
insert into Users values('2130','2130','1');
insert into Users values('2131','2131','1');
insert into Users values('2240','2240','1');
insert into Users values('2241','2241','1');
insert into Users values('2250','2250','1');
insert into Users values('2251','2251','1');
insert into Users values('2360','2360','1');
insert into Users values('2361','2361','1');
insert into Users values('2370','2370','1');
insert into Users values('2371','2371','1');
insert into Users values('2372','2372','1');
insert into Users values('14010011001','14010011001','0');
insert into Users values('14010011002','14010011002','0');
insert into Users values('14010011003','14010011003','0');
insert into Users values('14010022001','14010022001','0');
insert into Users values('14010022002','14010022002','0');
insert into Users values('14010022003','14010022003','0');
insert into Users values('14010022004','14010022004','0');
insert into Users values('14020011012','14020011012','0');
insert into Users values('14020011013','14020011013','0');
insert into Users values('15020012001','15020012001','0');
insert into Users values('15020011033','15020011033','0');
insert into Users values('14020031015','14020031015','0');
insert into Users values('16020041002','16020041002','0');
insert into Users values('17020023005','17020023005','0');
insert into Users values('15020032010','15020032010','0');
insert into Users values('15020032009','15020032009','0');
insert into Users values('15020031042','15020031042','0');
insert into Users values('15020031048','15020031048','0');
insert into Users values('15020031108','15020031108','0');
insert into Users values('15110041008','15110041008','0');
insert into Users values('15110011002','15110011002','0');
insert into Users values('16110022037','16110022037','0');
insert into Users values('14120011028','14120011028','0');
insert into Users values('15120012009','15120012009','0');
insert into Users values('16120013011','16120013011','0');
insert into Users values('16120013013','16120013013','0');
insert into Users values('17120014011','17120014011','0');
insert into Users values('14090021027','14090021027','0');
insert into Users values('14090021001','14090021001','0');
insert into Users values('15090032010','15090032010','0');
insert into Users values('15090032013','15090032013','0');
insert into Users values('16090012014','16090012014','0');
insert into Users values('17090011045','17090011045','0');

--创建Student（学生）表
create table Student
(Sno char(11) primary key,
 Sname char(20) not null,
 Ssex char(2),
 Sgrade smallint,
 Sdept char(20)
);
--对Ssex和Sage添加check约束
alter table Student
add constraint CK_Ssex check(Ssex='女' or Ssex='男');

insert into Student values('14010011001','安辰','女',2014,'海洋环境学院');
insert into Student values('14010011002','安琪','女',2014,'海洋环境学院');
insert into Student values('14010011003','陈宇','女',2014,'海洋环境学院');
insert into Student values('14010022001','陈佳玉','女',2014,'海洋环境学院');
insert into Student values('14010022002','董玥','女',2014,'海洋环境学院');
insert into Student values('14010022003','丁强','男',2014,'海洋环境学院');
insert into Student values('14010022004','李勇','男',2014,'海洋环境学院');
insert into Student values('14020011012','梁非凡','男',2014,'信息科学与工程学院');
insert into Student values('14020011013','蒋丞','男',2014,'信息科学与工程学院');
insert into Student values('15020012001','顾飞','男',2015,'信息科学与工程学院');
insert into Student values('15020011033','詹永旭','男',2015,'信息科学与工程学院');
insert into Student values('14020031015','王敏','女',2014,'信息科学与工程学院');
insert into Student values('16020041002','陈冬','女',2016,'信息科学与工程学院');
insert into Student values('17020023005','李楠','女',2017,'信息科学与工程学院');
insert into Student values('15020032010','刘渊晨','女',2015,'信息科学与工程学院');
insert into Student values('15020032009','刘艺语','女',2015,'信息科学与工程学院');
insert into Student values('15020031042','刘峰','男',2015,'信息科学与工程学院');
insert into Student values('15020031048','刘真','男',2015,'信息科学与工程学院');
insert into Student values('15020031108','张庆渝','男',2015,'信息科学与工程学院');
insert into Student values('15110041008','李悦','女',2015,'管理学院');
insert into Student values('15110011002','陈泽鑫','男',2015,'管理学院');
insert into Student values('16110022037','徐帅','男',2016,'管理学院');
insert into Student values('14120011028','张凌云','男',2014,'经济学院');
insert into Student values('15120012009','吴峰','男',2015,'经济学院');
insert into Student values('16120013011','白雪','女',2016,'经济学院');
insert into Student values('16120013013','江浩','男',2016,'经济学院');
insert into Student values('17120014011','沈深','男',2017,'经济学院');
insert into Student values('14090021027','李然','男',2014,'工程学院');
insert into Student values('14090021001','罗亮','男',2014,'工程学院');
insert into Student values('15090032010','张立','男',2015,'工程学院');
insert into Student values('15090032013','刘帆','男',2015,'工程学院');
insert into Student values('16090012014','林诺','女',2016,'工程学院');
insert into Student values('17090011045','张冰洁','女',2017,'工程学院');


--创建Teacher（教师）表
create table Teacher
(Tno char(11) primary key,
 Tname char(20) not null,
 Tsex char(2)
);
--对Tsex添加check约束
alter table Teacher
add constraint CK_Tsex check(Tsex='女' or Tsex='男');

insert into Teacher values('2110','赵凤娇','女');
insert into Teacher values('2111','苏丽','女');
insert into Teacher values('2120','刘杰','男');
insert into Teacher values('2121','乔楚','男');
insert into Teacher values('2122','王明','男');
insert into Teacher values('2130','武强','男');
insert into Teacher values('2131','程晓','男');
insert into Teacher values('2240','赵婷','女');
insert into Teacher values('2241','宁露','女');
insert into Teacher values('2250','曹琦','男');
insert into Teacher values('2251','孙强','男');
insert into Teacher values('2360','卢莉','女');
insert into Teacher values('2361','文欣','女');
insert into Teacher values('2370','高展','男');
insert into Teacher values('2371','白云','男');
insert into Teacher values('2372','孙晓斌','男');


--创建Building（宿舍楼）表
create table Building
(Bno char(2) primary key,
 Bblock char(6) not null,
 Btime time not null
);
--对Bblock添加check约束
alter table Building
add constraint CK_Bblock check(Bblock='北海苑' or Bblock='东海苑' or Bblock='南海苑');

insert into Building values('1','北海苑','22:30:00');
insert into Building values('2','北海苑','22:30:00');
insert into Building values('3','北海苑','22:30:00');
insert into Building values('4','东海苑','22:45:00');
insert into Building values('5','东海苑','22:45:00');
insert into Building values('6','南海苑','22:45:00');
insert into Building values('7','南海苑','22:45:00');


--创建Dormitory（宿舍）表
create table Dormitory
(Dno char(6) primary key,
 Bno char(2) not null,
 Dsize int not null,
 Dsurplus int not null,	--空位
 Dtel char(20) not null,
 foreign key(Bno) references Building(Bno)
);

insert into Dormitory values('1#101','1','6','2','6001101');
insert into Dormitory values('1#102','1','6','1','6001102');
insert into Dormitory values('1#103','1','6','2','6001103');
insert into Dormitory values('1#201','1','6','6','6001201');
insert into Dormitory values('1#202','1','6','6','6001202');
insert into Dormitory values('2#101','2','4','3','6002101');
insert into Dormitory values('2#102','2','4','0','6002102');
insert into Dormitory values('2#103','2','4','2','6002103');
insert into Dormitory values('2#201','2','4','4','6002201');
insert into Dormitory values('2#203','2','4','4','6002202');
insert into Dormitory values('3#101','3','4','4','6003101');
insert into Dormitory values('3#102','3','4','2','6003102');
insert into Dormitory values('3#201','3','4','4','6003201');
insert into Dormitory values('3#202','3','4','4','6003202');
insert into Dormitory values('4#101','4','4','3','6004101');
insert into Dormitory values('4#102','4','4','3','6004102');
insert into Dormitory values('4#201','4','4','4','6004201');
insert into Dormitory values('4#202','4','4','4','6004202');
insert into Dormitory values('5#101','5','4','2','6005101');
insert into Dormitory values('5#102','5','4','0','6005102');
insert into Dormitory values('5#103','5','6','6','6005103');
insert into Dormitory values('5#201','5','6','6','6005201');
insert into Dormitory values('5#202','5','6','6','6005202');
insert into Dormitory values('6#101','6','4','2','6006101');
insert into Dormitory values('6#102','6','4','1','6006102');
insert into Dormitory values('6#103','6','4','4','6006103');
insert into Dormitory values('6#104','6','4','4','6006104');
insert into Dormitory values('7#101','7','4','2','6007101');
insert into Dormitory values('7#102','7','4','4','6007102');
insert into Dormitory values('7#103','7','4','4','6007103');
insert into Dormitory values('7#104','7','4','4','6007104');

--创建Asset（财产）表
create table Asset
(Ano char(3) primary key,
 Aname char(20) not null,
 Aprice int not null,
 Astore int
);

insert into Asset values('1','床',2000,120);
insert into Asset values('2','桌子',1500,100);
insert into Asset values('3','衣柜',1800,120);
insert into Asset values('4','电灯',60,200);
insert into Asset values('5','玻璃',130,140);
insert into Asset values('6','门',1600,50);
insert into Asset values('7','公共洗衣机',2500,4);
insert into Asset values('8','公共吹风机',70,15);


--创建LeaveSchool（学生离校）表
create table LeaveSchool
(Sno char(11),
 Sltime date,
 Sreturn date,
 primary key(Sno,Sltime),
 foreign key(Sno) references Student(Sno)
);

insert into LeaveSchool values('15020032010','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020032010','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020032010','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020032010','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020032009','2016-1-22','2016-3-2');
insert into LeaveSchool values('15020032009','2016-7-18','2016-7-27');
insert into LeaveSchool values('15020032009','2017-1-20','2017-3-3');
insert into LeaveSchool values('15020032009','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031042','2016-1-21','2016-3-3');
insert into LeaveSchool values('15020031042','2016-7-18','2016-8-11');
insert into LeaveSchool values('15020031042','2017-1-22','2017-2-27');
insert into LeaveSchool values('15020031042','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031048','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020031048','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020031048','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020031048','2017-7-16','2017-8-19');
insert into LeaveSchool values('15020031108','2016-1-23','2016-3-3');
insert into LeaveSchool values('15020031108','2016-7-20','2016-8-12');
insert into LeaveSchool values('15020031108','2017-1-19','2017-2-27');
insert into LeaveSchool values('15020031108','2017-7-13','2017-8-18');

--创建Mail（信件收发）表
create table Mail
(Mno char(20) primary key,
 Sno char(11),
 Marrive date not null,
 Maccept date,
 foreign key(Sno) references Student(Sno)
);

insert into Mail values('M1','15020032010','2015-10-13','2015-10-13');
insert into Mail values('M2','15020032010','2015-12-1','2015-12-2');
insert into Mail values('M3','15020032010','2016-5-6','2016-5-8');
insert into Mail values('M4','15020032010','2017-12-25',null);
insert into Mail values('M5','15020032009','2015-10-13','2015-10-13');
insert into Mail values('M6','15020032009','2015-12-1','2015-12-2');
insert into Mail values('M7','15020032009','2016-5-6','2016-5-8');
insert into Mail values('M8','15020032009','2017-12-25',null);
insert into Mail values('M9','15020031042','2015-10-13','2015-10-13');
insert into Mail values('M10','15020031042','2015-12-1','2015-12-2');
insert into Mail values('M11','15020031042','2016-5-6','2016-5-8');
insert into Mail values('M12','15020031042','2017-12-25',null);
insert into Mail values('M13','15020031048','2015-10-13','2015-10-13');
insert into Mail values('M14','15020031048','2015-12-1','2015-12-2');
insert into Mail values('M15','15020031048','2016-5-6','2016-5-8');
insert into Mail values('M16','15020031048','2017-12-25',null);
insert into Mail values('M17','15020031108','2015-10-13','2015-10-13');
insert into Mail values('M18','15020031108','2015-12-1','2015-12-2');
insert into Mail values('M19','15020031108','2016-5-6','2016-5-8');
insert into Mail values('M20','15020031108','2018-1-12',null);

--创建Curfew（夜归关系）表
create table Curfew
(Sno char(11),
 NightTime datetime,
 NightReason char(50),
 Tno char(11),
 primary key(Sno,NightTime),
 foreign key(Sno) references Student(Sno),
 foreign key(Tno) references Teacher(Tno)
);

insert into Curfew values('15020032010','2016-11-11 22:45:00','社团活动','2110');
insert into Curfew values('15020032010','2017-11-11 22:45:00','社团活动',null);
insert into Curfew values('15020032009','2016-10-7 23:30:00','回家返校','2111');
insert into Curfew values('15020032009','2017-5-3 23:30:00','社团活动',null);
insert into Curfew values('15020031042','2016-1-1 22:45:00','社团活动','2121');
insert into Curfew values('15020031042','2016-11-11 22:45:00','社团活动',null);
insert into Curfew values('15020031048','2015-12-11 22:45:00','外校比赛返校','2120');
insert into Curfew values('15020031048','2016-11-11 22:45:00','社团活动',null);
insert into Curfew values('15020031108','2016-9-16 23:30:00','实习返校','2121');
insert into Curfew values('15020031108','2016-11-11 22:45:00','社团活动',null);

--创建Repairs（报修关系）表
create table Repairs
(Dno char(6),
 Ano char(3),
 ReportTime date,
 ReportReason char(50) not null,
 FixTime date,
 primary key(Ano,Dno,ReportTime),
 foreign key(Ano) references Asset(Ano),
 foreign key(Dno) references Dormitory(Dno)
);

insert into Repairs values('1#101','2','2016-11-30','抽屉坏掉惹','2016-12-1');
insert into Repairs values('1#101','4','2017-12-25','灯不亮惹',null);
insert into Repairs values('1#102','7','2016-10-20','洗衣机不工作惹','2016-10-22');
insert into Repairs values('1#102','6','2017-12-30','门把坏惹',null);
insert into Repairs values('2#101','3','2015-9-30','衣柜门坏掉惹','2015-10-8');
insert into Repairs values('2#101','5','2018-1-3','窗户玻璃破惹',null);
insert into Repairs values('2#102','4','2015-12-11','灯不亮惹','2015-12-12');
insert into Repairs values('2#102','8','2017-11-11','吹风机坏惹',null);
insert into Repairs values('2#103','1','2015-9-19','床板坏惹','2015-9-19');
insert into Repairs values('2#103','7','2017-12-11 22:45:00','洗衣机不工作惹',null);

--创建SD（学生宿舍关系）表
create table SD
(Sno char(11) primary key,
 Dno char(6),
 Scin date,
 foreign key(Sno) references Student(Sno),
 foreign key(Dno) references Dormitory(Dno)
);

insert into SD values('14010011001','6#101','2014-8-25');
insert into SD values('14010011002','6#101','2014-8-25');
insert into SD values('14010011003','6#102','2014-8-25');
insert into SD values('14010022001','6#102','2014-8-25');
insert into SD values('14010022002','6#102','2014-8-25');
insert into SD values('14010022003','7#101','2014-8-25');
insert into SD values('14010022004','7#101','2014-8-25');
insert into SD values('14020011012','2#102','2014-8-25');
insert into SD values('14020011013','2#102','2014-8-25');
insert into SD values('15020012001','2#102','2015-8-25');
insert into SD values('15020011033','2#103','2015-8-25');
insert into SD values('14020031015','1#101','2014-8-25');
insert into SD values('16020041002','1#102','2016-8-25');
insert into SD values('17020023005','1#102','2017-8-25');
insert into SD values('15020032010','1#101','2015-8-25');
insert into SD values('15020032009','1#102','2015-8-25');
insert into SD values('15020031042','2#101','2015-8-25');
insert into SD values('15020031048','2#102','2015-8-25');
insert into SD values('15020031108','2#103','2015-8-25');
insert into SD values('15110041008','4#101','2015-8-25');
insert into SD values('15110011002','5#101','2015-8-25');
insert into SD values('16110022037','5#101','2016-8-25');
insert into SD values('14120011028','5#102','2014-8-25');
insert into SD values('15120012009','5#102','2015-8-25');
insert into SD values('16120013011','4#102','2016-8-25');
insert into SD values('16120013013','5#102','2016-8-25');
insert into SD values('17120014011','5#102','2017-8-25');
insert into SD values('14090021027','3#101','2014-8-25');
insert into SD values('14090021001','3#101','2014-8-25');
insert into SD values('15090032010','3#102','2015-8-25');
insert into SD values('15090032013','3#102','2015-8-25');
insert into SD values('16090012014','1#103','2016-8-25');
insert into SD values('17090011045','1#103','2017-8-25');


--创建DT（宿舍管理关系）表
create table DT
(Bno char(2),
 Tno char(11),
 primary key(Bno,Tno),
 foreign key(Bno) references Building(Bno),
 foreign key(Tno) references Teacher(Tno)
);

insert into DT values('1','2110');
insert into DT values('1','2111');
insert into DT values('2','2120');
insert into DT values('2','2121');
insert into DT values('2','2122');
insert into DT values('3','2130');
insert into DT values('3','2131');
insert into DT values('4','2240');
insert into DT values('4','2241');
insert into DT values('5','2250');
insert into DT values('5','2251');
insert into DT values('6','2360');
insert into DT values('6','2361');
insert into DT values('7','2370');
insert into DT values('7','2371');
insert into DT values('7','2372');


--创建DA（宿舍财产关系）表
create table DA
(Dno char(6),
 Ano char(3),
 Amount int not null,
 primary key(Dno,Ano),
 foreign key(Dno) references Dormitory(Dno),
 foreign key(Ano) references Asset(Ano)
);

insert into DA values('1#101','1',4);
insert into DA values('1#101','2',4);
insert into DA values('1#101','3',4);
insert into DA values('1#101','4',4);
insert into DA values('1#101','5',2);
insert into DA values('1#101','7',1);
insert into DA values('1#102','1',4);
insert into DA values('1#102','2',4);
insert into DA values('1#102','3',4);
insert into DA values('1#102','4',4);
insert into DA values('1#102','5',2);
insert into DA values('1#102','7',1);
insert into DA values('2#101','1',4);
insert into DA values('2#101','2',4);
insert into DA values('2#101','3',4);
insert into DA values('2#101','4',4);
insert into DA values('2#101','5',2);
insert into DA values('2#101','7',1);
insert into DA values('2#102','1',4);
insert into DA values('2#102','2',4);
insert into DA values('2#102','3',4);
insert into DA values('2#102','4',4);
insert into DA values('2#102','5',2);
insert into DA values('2#102','7',1);
insert into DA values('2#103','1',4);
insert into DA values('2#103','2',4);
insert into DA values('2#103','3',4);
insert into DA values('2#103','4',4);
insert into DA values('2#103','5',2);
insert into DA values('2#103','7',1);




