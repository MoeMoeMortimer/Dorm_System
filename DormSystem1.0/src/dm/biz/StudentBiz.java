package dm.biz;

import java.util.List;

import dm.po.Student;

public interface StudentBiz {

	public boolean add(Student s);
	
	public boolean delete(String sno);

	public boolean update(Student s,String oldSno);
	
        public Student findBySno(String Sno);
        
        public boolean findStudent(String Sno);
        
	public List<Student> findBySname(String Sname);
        
        public List<Student> findBySsex(String Ssex);
        
        public List<Student> findBySgrade(String Sgrade);
        
        public List<Student> findBySdept(String Sdept);
        
        public List<Student> findByDno(String Dno);
        
        public List<Student> findByScin(String startDate,String endDate);
        
        

	public List<Student> findAll();
	

	public List<Student> findByCondition(String condition);
}
