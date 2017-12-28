/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;

import dm.vo.tStuCurfew;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 28104
 */
public interface tStuCurfewBiz {
	public boolean update(tStuCurfew s);        

	public List<tStuCurfew> findBySno(String Sno);
        
        public List<tStuCurfew> findByTno(String Tno);   
        
        public List<tStuCurfew> findBySname(String Sname); 
        
        public List<tStuCurfew> findByDno(String Dno); 
        
        public List<tStuCurfew> findByPermit(); 
        
        public List<tStuCurfew> findByUnpermit(); 

	public List<tStuCurfew> findAll();
	
	public List<tStuCurfew> findByCondition(String condition);
}
