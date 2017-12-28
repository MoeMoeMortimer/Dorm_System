package dm.biz;

import java.sql.Date;
import java.util.List;

import dm.po.*;

import dm.vo.*;
public interface RepairsBiz {
	public boolean add(Repairs r);

	public boolean delete(String Ano, String Dno,Date ReportTime);

	public Repairs findById(String Ano,String Dno);

	public List<Repairs> findAll();

	public List<Repairs> findByCondition(String condition);

}
