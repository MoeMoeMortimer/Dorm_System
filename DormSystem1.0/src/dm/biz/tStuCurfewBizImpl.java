/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;

import dm.dao.tStuCurfewDao;
import dm.vo.tStuCurfew;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 28104
 */
public class tStuCurfewBizImpl implements tStuCurfewBiz{
    tStuCurfewDao sdao = new tStuCurfewDao();

    public boolean update(tStuCurfew s) {
        String sql = "update StuCurfew set Tno = ? where Sno = ?";
	Object[] params = {s.getTno(), s.getSno()};
	return sdao.update(sql, params);
    }


    public List<tStuCurfew> findBySno(String Sno) {
        String sql = "select * from StuCurfew where Sno = ? order by NightTime DESC" ;
	Object[] params = {Sno};
	return sdao.query(sql, tStuCurfew.class, params);
    }

    public List<tStuCurfew> findBySname(String Sname) {
        String sql = "select * from StuCurfew where Sname = ? order by NightTime DESC";
	Object[] params = {Sname};
	return sdao.query(sql, tStuCurfew.class, params);
    }
        
    public List<tStuCurfew> findByDno(String Dno) {
        String sql = "select * from StuCurfew where Dno = ? order by NightTime DESC";
	Object[] params = {Dno};
	return sdao.query(sql, tStuCurfew.class, params);
    }
    public List<tStuCurfew> findByPermit() {
        String sql = "select * from StuCurfew where Tno is not null order by NightTime DESC";
	//Object[] params = {Tno};
	return sdao.query(sql, tStuCurfew.class);
    }

    public List<tStuCurfew> findByUnpermit() {
        String sql = "select * from StuCurfew where Tno is null order by NightTime DESC";
	//Object[] params = {Tno};
	return sdao.query(sql, tStuCurfew.class);
    }
    public List<tStuCurfew> findByTno(String Tno) {
        String sql = "select * from StuCurfew where Tno = ? order by NightTime DESC";
        Object[] params = {Tno};
        return sdao.query(sql, tStuCurfew.class, params);
    }
    
    
    public List<tStuCurfew> findAll() {
        String sql = "select * from StuCurfew order by NightTime DESC";
	return sdao.query(sql, tStuCurfew.class);    
    }

    
    public List<tStuCurfew> findByCondition(String condition) {
        String sql = "select * from StuCurfew where Sno+Sname+Dno+Tno like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, tStuCurfew.class, params);
    }


}
