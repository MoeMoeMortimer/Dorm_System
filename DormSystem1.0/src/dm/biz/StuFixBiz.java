package dm.biz;

import java.util.List;

import dm.vo.StuFix;

public interface StuFixBiz {
public boolean add(StuFix a);
	
	public boolean delete(String ReportTime, String Dno);

	public boolean update(StuFix a);
	

	public List<StuFix> findAll(String Dno);
        
        public List<StuFix> findAllNot(String Dno);
        
        public List<StuFix> findAllAc(String Dno);

	public List<StuFix> findByCondition(String condition);
}
