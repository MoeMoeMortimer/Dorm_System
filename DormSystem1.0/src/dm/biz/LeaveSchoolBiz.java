package dm.biz;

import java.util.Date;
import java.util.List;

import dm.po.Dormitory;
import dm.po.LeaveSchool;

public interface LeaveSchoolBiz {

	public boolean add(LeaveSchool ls);
	

	public boolean delete(String dno, Date Sltime, Date Sreturn);
	

	public List<LeaveSchool> findById(String sno);

	public List<LeaveSchool> findAll();
	
	public List<LeaveSchool> findByCondition(String condition);
        
        public List<LeaveSchool> findByIdDate(String Sno, String st, String ed);
}
