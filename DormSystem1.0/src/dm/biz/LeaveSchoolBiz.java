package dm.biz;

import java.util.Date;
import java.util.List;

import dm.po.Dormitory;
import dm.po.LeaveSchool;

public interface LeaveSchoolBiz {

	public boolean add(LeaveSchool ls);
	
	public boolean delete(String Sno, java.sql.Date Sltime);
        
        public boolean update(String Sno, java.sql.Date Sltime,java.sql.Date Sreturn);
	
        public List<LeaveSchool> findById (String sno);

	public List<LeaveSchool> findAll();
	
	public List<LeaveSchool> findByCondition(String condition);
        
        public List<LeaveSchool> findByIdDate(String Sno, String st, String ed);
        
        public boolean findBySno(String sno);
        
        public boolean delelteBySno(String sno);
}
