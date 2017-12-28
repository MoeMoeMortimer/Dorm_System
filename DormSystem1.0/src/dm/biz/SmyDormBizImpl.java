package dm.biz;

import java.util.List;

import dm.dao.SmyDormDao;
import dm.vo.SmyDorm;
import dm.vo.SmyDorm;

public class SmyDormBizImpl implements SmyDormBiz{
	SmyDormDao ddao = new SmyDormDao();
	@Override
	public SmyDorm findById(String Dno) {
		String sql = "select * from SmyDorm where Dno = ?";
		Object[] params = {Dno};
		return (SmyDorm) ddao.get(sql, SmyDorm.class, params);
	}

	@Override
	public List<SmyDorm> findAll() {
		String sql = "select * from SmyDorm";
		return ddao.query(sql, SmyDorm.class);
	}

	@Override
	public List<SmyDorm> findByCondition(String condition) {
		String sql = "select * from SmyDorm and concat(Dno,Ano, Aname) like ?";
		Object[] params = {"%"+condition+"%"};
		return ddao.query(sql, SmyDorm.class, params);
	}

}
