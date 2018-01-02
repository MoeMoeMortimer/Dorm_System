package dm.biz;

import java.util.List;

import dm.po.Dormitory;



public interface DormitoryBiz {

	public boolean add(Dormitory d);
	

	public boolean delete(String dno);
	

	public boolean updateSub(String dnoNew);
	
        public boolean updateAdd(String dnoOld);
	
        public List<Dormitory> findDormitory();
        
	public Dormitory findById(String dno);
	
        public List<Dormitory> findByBno(String bno);
        
        public List<Dormitory> findByDsurplus(String Dsurplus);
        
	public List<Dormitory> findAll();
	

	public List<Dormitory> findByCondition(String condition);
}
