/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;
import java.util.List;

import dm.vo.tStuLeave;
/**
 *
 * @author 28104
 */
public interface tStuLeaveBiz {
        public boolean add(tStuLeave s);
	
	public boolean delete(String Sno);
	
	public boolean update(tStuLeave s);

	public List<tStuLeave> findBySno(String Sno);
        
	public List<tStuLeave> findBySname(String Sname);
        
        public List<tStuLeave> findByDno(String Dno);
        
	public List<tStuLeave> findAll();
	
	public List<tStuLeave> findByCondition(String condition);
        
        public List<tStuLeave> isORNotReturn(boolean flag);
}
