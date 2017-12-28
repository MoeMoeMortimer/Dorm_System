package dm.biz;

import java.sql.Date;
import java.util.List;

import dm.dao.RepairsDao;
import dm.vo.Repairs;

public class RepairsBizImpl implements RepairsBiz {
	RepairsDao ddao = new RepairsDao();
	public boolean add(Repairs r)
	{		
		String sql = "insert into Repairs values(?,?,?,?,?)";

		Object[] params = {r.getDno(), r.getAno(),r.getReportTime(),r.getReportReason(),r.getFixTime()};
		return ddao.update(sql, params);
		
	}

	public boolean delete(String Ano, String Dno,Date ReportTime)
	{
		String sql = "delete from Repairs where Ano = ? AND Dno = ? AND ReportTime =?";
		Object[] params = {Ano,Dno,ReportTime};
		return ddao.update(sql, params);
	}

	public Repairs findById(String Ano,String Dno)
	{
		String sql = "select * from Repairs where Ano = ? AND Dno = ?";
		Object[] params = {Ano,Dno};
		return (Repairs) ddao.get(sql, Repairs.class, params);
	}

	public List<Repairs> findAll()
	{
		String sql = "select * from Repairs";
		return ddao.query(sql, Repairs.class);
	}

	public List<Repairs> findByCondition(String condition)
	{
		String sql = "select * from Repairs and concat(Ano,Dno,ReportTime,ReportReason,FixTime) like ?";
		Object[] params = {"%"+condition+"%"};
		return ddao.query(sql, Repairs.class, params);
	}


	}

