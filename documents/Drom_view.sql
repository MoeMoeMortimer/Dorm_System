drop view StuCurfew;
drop view StuFix;
drop view SmyDorm;
drop view SmyAsset;
drop view tManageStu;
drop view tStuLeave;
drop view tFixInfo;
drop view tStuMail;


-- 学生晚归信息（教师管理学生晚归也用这个）
create view StuCurfew as
	select Student.Sno,Sname,Dno,NightTime,NightReason,Tno 
	from Student,Curfew
	where Student.Sno=Curfew.Sno;
	
-- 学生报修信息
create view StuFix as 
	select Asset.Ano,Aname,Dno,ReportTime,ReportReason,FixTime 
	from Asset,Repairs
	where Asset.Ano = Repairs.Ano;

-- 学生查看宿舍信息
create view SmyDorm as 
	select Bblock,Building.Bno,Dormitory.Dno,Btime,Dtel,Scin
	from Dormitory,Student,Building
	where Student.Dno=Dormitory.Dno and Building.Bno=Dormitory.Bno;

-- 学生查看宿舍财产信息(教师查看学生宿舍财产信息也用这个！)
create view SmyAsset as 
	select Dno,Asset.Ano,Aname,Amount
	from DA,Asset
	where DA.Ano=Asset.Ano;


-- 教师管理学生离校信息
create view tStuLeave as
	select Student.Sno,Sname,Dno,Sltime,Sreturn
	from Student,LeaveSchool
	where Student.Sno=LeaveSchool.Sno;

-- 教师管理报修信息
create view tFixInfo as
	select Asset.Ano,Aname,Aprice,Astore,Dno,ReportTime,ReportReason,FixTime
	from Asset,Repairs
	where Asset.Ano=Repairs.Ano;


-- 教师管理学生快递信息
create view tStuMail as
	select Mno,Student.Sno,Sname,Dno,Marrive,Maccept
	from Student,Mail
	where Student.Sno=Mail.Sno;
