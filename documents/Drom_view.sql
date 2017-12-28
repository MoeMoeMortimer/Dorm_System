drop view StuCurfew;
drop view StuFix;
drop view SmyDorm;
drop view SmyAsset;
drop view tManageStu;
drop view tStuLeave;
drop view tFixInfo;
drop view tStuCurfew;


-- ѧ�������Ϣ
create view StuCurfew as
	select Student.Sno,Sname,Dno,NightTime,NightReason,Tno 
	from Student,Curfew,SD
	where Student.Sno=Curfew.Sno and Student.Sno=SD.Sno;
	
-- ѧ��������Ϣ
create view StuFix as 
	select Asset.Ano,Aname,Dno,ReportTime,ReportReason,FixTime 
	from Asset,Repairs
	where Asset.Ano = Repairs.Ano;

-- ѧ���鿴������Ϣ
create view SmyDorm as 
	select Bblock,Building.Bno,Dormitory.Dno,Btime,Dtel,Scin
	from Dormitory,SD,Building
	where SD.Dno=Dormitory.Dno and Building.Bno=Dormitory.Bno;

-- ѧ���鿴����Ʋ���Ϣ(��ʦ�鿴ѧ������Ʋ���ϢҲ�������)
create view SmyAsset as 
	select Dno,Asset.Ano,Aname,Amount
	from DA,Asset
	where DA.Ano=Asset.Ano;

-- ��ʦ����ѧ����Ϣ
create view tManageStu as
	select Student.Sno,Sname,Ssex,Sgrade,Sdept,Dno,Scin
	from Student,SD
	where Student.Sno=SD.Sno;

-- ��ʦ����ѧ����У��Ϣ
create view tStuLeave as
	select Student.Sno,Sname,Dno,Sltime,Sreturn
	from Student,SD,LeaveSchool
	where Student.Sno=SD.Sno and Student.Sno=LeaveSchool.Sno;

-- ��ʦ��������Ϣ
create view tFixInfo as
	select Asset.Ano,Aname,Aprice,Astore,Dno,ReportTime,ReportReason,FixTime
	from Asset,Repairs
	where Asset.Ano=Repairs.Ano;

-- ��ʦ����ѧ�������Ϣ
create view tStuCurfew as
	select Student.Sno,Sname,Dno,NightTime,NightReason,Tno
	from Student,Curfew,SD
	where Student.Sno=SD.Sno and Student.Sno=Curfew.Sno;

