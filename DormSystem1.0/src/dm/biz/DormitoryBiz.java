package dm.biz;

import java.util.List;

import dm.po.Dormitory;



public interface DormitoryBiz {

	public boolean add(Dormitory d);
	

	public boolean delete(String dno);
	

	public boolean update(Dormitory d);
	

	public Dormitory findById(String dno);
	

	public List<Dormitory> findAll();
	

	public List<Dormitory> findByCondition(String condition);
}
