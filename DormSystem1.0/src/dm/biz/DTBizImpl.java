package dm.biz;

import java.util.List;

import dm.dao.DTDao;
import dm.po.Dormitory;
import dm.vo.DT;

public class DTBizImpl implements DTBiz {
	DTDao ddao = new DTDao();
	public boolean add(DT d)
	{		
		String sql = "insert into DT values(?,?)";

		Object[] params = {d.getBno(), d.getTno()};
		return ddao.update(sql, params);
		
	}

	public boolean delete(int Bno, String Tno)
	{
		String sql = "delete from DT where Bno = ? AND Tno = ?";
		Object[] params = {Bno,Tno};
		return ddao.update(sql, params);
	}

	public DT findById(String Bno)
	{
		String sql = "select * from DT where Bno = ?";
		Object[] params = {Bno};
		return (DT) ddao.get(sql, DT.class, params);
	}
        
        public DT findByTno(String Tno) {
        String sql = "select * from DT where Tno = ?";
		Object[] params = {Tno};
		return (DT) ddao.get(sql, DT.class, params);
        }
        
	public List<DT> findAll()
	{
		String sql = "select * from DT";
		return ddao.query(sql, DT.class);
	}

	public List<DT> findByCondition(String condition)
	{
		String sql = "select * from DT and concat(Bno, Tno) like ?";
		Object[] params = {"%"+condition+"%"};
		return ddao.query(sql, DT.class, params);
	}

}

