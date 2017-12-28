drop view StuCurfew;
drop view StuFix;
drop view SmyDorm;
drop view SmyAsset;
drop view tManageStu;
drop view tStuLeave;
drop view tFixInfo;
drop view tStuCurfew;


-- 学生晚归信息
create view StuCurfew as
	select Student.Sno,Sname,Dno,NightTime,NightReason,Tno 
	from Student,Curfew,SD
	where Student.Sno=Curfew.Sno and Student.Sno=SD.Sno;
	
-- 学生报修信息
create view StuFix as 
	select Asset.Ano,Aname,Dno,ReportTime,ReportReason,FixTime 
	from Asset,Repairs
	where Asset.Ano = Repairs.Ano;

-- 学生查看宿舍信息
create view SmyDorm as 
	select Bblock,Building.Bno,Dormitory.Dno,Btime,Dtel,Scin
	from Dormitory,SD,Building
	where SD.Dno=Dormitory.Dno and Building.Bno=Dormitory.Bno;

-- 学生查看宿舍财产信息(教师查看学生宿舍财产信息也用这个！)
create view SmyAsset as 
	select Dno,Asset.Ano,Aname,Amount
	from DA,Asset
	where DA.Ano=Asset.Ano;

-- 教师管理学生信息
create view tManageStu as
	select Student.Sno,Sname,Ssex,Sgrade,Sdept,Dno,Scin
	from Student,SD
	where Student.Sno=SD.Sno;

-- 教师管理学生离校信息
create view tStuLeave as
	select Student.Sno,Sname,Dno,Sltime,Sreturn
	from Student,SD,LeaveSchool
	where Student.Sno=SD.Sno and Student.Sno=LeaveSchool.Sno;

-- 教师管理报修信息
create view tFixInfo as
	select Asset.Ano,Aname,Aprice,Astore,Dno,ReportTime,ReportReason,FixTime
	from Asset,Repairs
	where Asset.Ano=Repairs.Ano;

-- 教师管理学生晚归信息
create view tStuCurfew as
	select Student.Sno,Sname,Dno,NightTime,NightReason,Tno
	from Student,Curfew,SD
	where Student.Sno=SD.Sno and Student.Sno=Curfew.Sno;

