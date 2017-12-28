package dm.biz;

import java.util.List;


import dm.dao.TeacherDao;
import dm.po.Teacher;
public class TeacherBizImpl implements TeacherBiz{

	TeacherDao sdao = new TeacherDao();

	
	public boolean add(Teacher t) {
		String sql = "insert into Teacher values(?,?,?)";

		Object[] params = {t.getTno(), t.getTname(), t.getTsex()};
		return sdao.update(sql, params);
	}


	public boolean delete(String tno) {

		String sql = "delete from Teacher where Tno = ?";
		Object[] params = {tno};
		return sdao.update(sql, params);
		}


	public boolean update(Teacher t) {
		String sql = "update Teacher set Tname = ?, Tsex = ? where Tno = ?";

		Object[] params = {t.getTname(), t.getTsex(), t.getTno()};

		return sdao.update(sql, params);
	}


	public List<Teacher> findAll() {
		String sql = "select * from Teacher";
		return sdao.query(sql, Teacher.class);
	}
		
	public List<Teacher> findByCondition(String condition) {
		String sql = "select * from Teacher and concat(Tno, Tname, Tsex) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Teacher.class, params);
	}


	@Override
	public Teacher findById(String tno) {
		String sql = "select * from Teacher where Tno = ?";
		Object[] params = {tno};
		return (Teacher) sdao.get(sql, Teacher.class, params);
	}
}
