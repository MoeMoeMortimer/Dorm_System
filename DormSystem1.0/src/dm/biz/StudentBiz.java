package dm.biz;

import java.util.List;

import dm.po.Student;

public interface StudentBiz {

	public boolean add(Student s);
	
	public boolean delete(String sno);
	

	public boolean update(Student s);

	public Student findById(String sno);
	

	public List<Student> findAll();
	

	public List<Student> findByCondition(String condition);
}
