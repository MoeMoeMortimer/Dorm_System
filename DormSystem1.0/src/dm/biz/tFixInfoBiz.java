/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;

import dm.vo.tFixInfo;
import java.util.List;

/**
 *
 * @author 28104
 */
public interface tFixInfoBiz {
    	public boolean update(tFixInfo f);        

	public List<tFixInfo> findByAno(String Ano);
        
        public List<tFixInfo> findByAname(String Aname);   
        
        public List<tFixInfo> findByDno(String Dno); 
        
        public List<tFixInfo> findBySolve(); 
        
        public List<tFixInfo> findByUnsolve(); 

	public List<tFixInfo> findAll();
	
	public List<tFixInfo> findByCondition(String condition);
}
