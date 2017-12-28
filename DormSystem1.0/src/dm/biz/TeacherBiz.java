package dm.biz;

import java.util.List;

import dm.po.Teacher;

public interface TeacherBiz {

	public boolean add(Teacher t);
	

	public boolean delete(String tno);

	
	public boolean update(Teacher t);

	public Teacher findById(String tno);
	

	public List<Teacher> findAll();
	

	public List<Teacher> findByCondition(String condition);
}
