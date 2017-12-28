/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;

import dm.dao.tStuLeaveDao;
import dm.vo.tStuLeave;
import java.util.List;

/**
 *
 * @author 28104
 */
public class tStuLeaveBizImpl implements tStuLeaveBiz{
    tStuLeaveDao lsdao=new tStuLeaveDao();

    @Override
    public boolean add(tStuLeave s) {
       
        String sql="insert into tStuLeave values(?,?,?,?,?)";
        Object[] params={s.getSno(),s.getSname(),s.getDno(),s.getSltime(),s.getSreturn()};
        return lsdao.update(sql, params);
    }
       

    @Override
    public boolean delete(String Sno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(tStuLeave s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<tStuLeave> findBySno(String Sno) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from tStuLeave where Sno = ?";
        Object[] params={Sno};
        return lsdao.query(sql, tStuLeave.class,params);
    }

    @Override
    public List<tStuLeave> findBySname(String Sname) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from tStuLeave where Sname = ?";
        Object[] params={Sname};
        return lsdao.query(sql, tStuLeave.class,params);
    }

    @Override
    public List<tStuLeave> findByDno(String Dno) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //String sql = "select * from tStuLeave and concat(Dno) like ?";
        //Object[] params = {"%"+Dno+"%"};
        
        String sql = "select * from tStuLeave where Dno = ?";
        Object[] params={Dno};
        return lsdao.query(sql, tStuLeave.class,params);
    }

    @Override
    public List<tStuLeave> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from tStuLeave";
        return lsdao.query(sql, tStuLeave.class);
    }

    @Override
    public List<tStuLeave> findByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<tStuLeave> isORNotReturn(boolean flag){
        String sql;
        if(!flag)
        {
            sql="select * from tStuLeave where Sreturn is null";
        }
        else
        {
            sql="select * from tStuLeave where Sreturn is not null";
        }
        return lsdao.query(sql, tStuLeave.class);
    }
}
