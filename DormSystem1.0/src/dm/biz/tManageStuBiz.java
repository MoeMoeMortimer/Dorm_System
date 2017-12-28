/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;
import java.util.List;

import dm.vo.tManageStu;
/**
 *
 * @author 28104
 */
public interface tManageStuBiz {
        public boolean add(tManageStu s);
	
	public boolean delete(String Sno);
	
	public boolean update(tManageStu s);

	public tManageStu findBySno(String Sno);
        
        public boolean findStudent(String Sno);
        
	public List<tManageStu> findBySname(String Sname);
        
        public List<tManageStu> findBySsex(String Ssex);
        
        public List<tManageStu> findBySgrade(String Sgrade);
        
        public List<tManageStu> findBySdept(String Sdept);
        
        public List<tManageStu> findByDno(String Dno);
        
        public List<tManageStu> findByScin(String startDate,String endDate);

	public List<tManageStu> findAll();
        
        public List<tManageStu> findAssigned();
        
        public List<tManageStu> findDisAssigned();
	
	public List<tManageStu> findByCondition(String condition);
}
