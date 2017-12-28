package dm.biz;

import java.util.Date;
import java.util.List;

import dm.dao.StuCurfewDao;
import dm.po.Student;
import dm.vo.StuCurfew;


public class StuCurfewBizImpl implements StuCurfewBiz{
	StuCurfewDao scdao = new StuCurfewDao();
	@Override
	public StuCurfew findById(String Sno) {
		String sql = "select * from StuCurfew where Sno = ?";
		Object[] params = {Sno};
		return (StuCurfew) scdao.get(sql, StuCurfew.class, params);
	}

	@Override
	public List<StuCurfew> findAll() {
		String sql = "select * from StuCurfew";
		return scdao.query(sql, StuCurfew.class);
	}

	@Override
	public List<StuCurfew> findByCondition(String condition) {
		String sql = "select * from StuCurfew and concat(Sno, Sname, Dno, Tno, NightReason) like ?";
		Object[] params = {"%"+condition+"%"};
		return scdao.query(sql, StuCurfew.class, params);
	}

	
	@Override
	public boolean add(StuCurfew a) {
		String sql = "insert into StuCurfew values(?,?,?,?,?, NULL)";
		Object[] params = {a.getSno(), a.getSname(),a.getDno(),a.getNightTime(), a.getNightReason()};
		return scdao.update(sql, params);
	}

	@Override
	public boolean update(StuCurfew a) {
		String sql = "update StuCurfew set Sname = ?, Dno = ?, NightReason = ? where Sno = ? and NightTime = ?";
		Object[] params = {a.getSname(), a.getDno(), a.getNightReason(), a.getSno(), a.getNightTime()};
		return scdao.update(sql, params);
	}

	//删除一条晚归申请，如果是教师已经批准的则不能取消
	public boolean delete(String Sno, Date NightTime){
		String sql = "delete from StuCurfew where Sno = ? and NightTime = ?";
		Object[] params = {Sno, NightTime};
		return scdao.update(sql, params);
	}
}
