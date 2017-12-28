package dm.biz;

import java.util.List;

import dm.dao.DADao;
import dm.vo.DA;

public class DABizImpl implements DABiz{

	DADao ddao = new DADao();
	public boolean add(DA d) {
		String sql = "insert into DA values(?,?,?)";

		Object[] params = {d.getDno(), d.getAno(), d.getAmount()};
		return ddao.update(sql, params);
	}


	public boolean delete(String Dno,String Ano) {

		String sql = "delete from DA where Dno = ? AND Ano = ?";
		Object[] params = {Dno,Ano};
		return ddao.update(sql, params);
		}


	public DA findByDId(String Dno) {
		String sql = "select * from DA where Dno = ?";
		Object[] params = {Dno};
		return (DA) ddao.get(sql, DA.class, params);
	}

	public List<DA> findAll() {
		String sql = "select * from DA";
		return ddao.query(sql, DA.class);
	}
		
	public List<DA> findByCondition(String condition) {
		String sql = "select * from DA and concat(Dno,Ano,Amount) like ?";
		Object[] params = {"%"+condition+"%"};
		return ddao.query(sql, DA.class, params);
	}
}
