package dm.biz;

import java.util.List;

import dm.dao.StudentDao;
import dm.po.Student;

public class StudentBizImpl implements StudentBiz{

	StudentDao sdao = new StudentDao();

	
	public boolean add(Student s) {
		String sql = "insert into Student values(?,?,?,?,?)";
		Object[] params = {s.getSno(), s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept()};
		return sdao.update(sql, params);
	}


	public boolean delete(String Sno) {

		String sql = "delete from Student where Sno = ?";
		Object[] params = {Sno};
		return sdao.update(sql, params);
		}


	public boolean update(Student s) {
		String sql = "update Student set Sname = ?, Ssex = ?, Sgrade = ?, Sdept = ? where Sno = ?";
		Object[] params = {s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept(), s.getSno()};
		return sdao.update(sql, params);
	}

	public Student findById(String Sno) {
		String sql = "select * from Student where Sno = ?";
		Object[] params = {Sno};
		return (Student) sdao.get(sql, Student.class, params);
	}


	public List<Student> findAll() {
		String sql = "select * from Student";
		return sdao.query(sql, Student.class);
	}
		
	public List<Student> findByCondition(String condition) {
		String sql = "select * from Student and concat(Sno, Sname, Ssex, Sdept) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Student.class, params);
	}



}
