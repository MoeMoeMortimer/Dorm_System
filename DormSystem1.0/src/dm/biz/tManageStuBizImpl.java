/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;
import java.util.List;

import dm.dao.tManageStuDao;
import dm.vo.tManageStu;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 28104
 */
public class tManageStuBizImpl implements tManageStuBiz{
    tManageStuDao sdao = new tManageStuDao();
    @Override
    public boolean add(tManageStu s) {
        Date date = new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(date);
        String sql = "insert into tManageStu values(?,?,?,?,?,?,?)";
        Object[] params = {s.getSno(), s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept(), s.getDno(), date};
	return sdao.update(sql, params);
    }

    @Override
    public boolean delete(String Sno) {
        String sql = "delete from tManageStu where Sno = ?";
	Object[] params = {Sno};
	return sdao.update(sql, params);
    }

    @Override
    public boolean update(tManageStu s) {
        String sql = "update tManageStu set Sname = ?, Ssex = ?, Sgrade = ?, Sdept = ?, Dno = ?, Scin = ? where Sno = ?";
	Object[] params = {s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept(), s.getDno(), s.getScin(), s.getSno()};
	return sdao.update(sql, params);
    }

    @Override
    public tManageStu findBySno(String Sno) {
        String sql = "select * from tManageStu where Sno = ?";
	Object[] params = {Sno};
	return (tManageStu) sdao.get(sql, tManageStu.class, params);
    }

    @Override
    public boolean findStudent(String Sno) {
        String sql = "select * from tManageStu where Sno = ?";
                Object[] params = {Sno};
                tManageStu s = (tManageStu) sdao.get(sql, tManageStu.class, params);
                if(s!=null) 
                    return true;
                else 
                    return false; 
    }

    @Override
    public List<tManageStu> findBySname(String Sname) {
        String sql = "select * from tManageStu where Sname = ?";
                Object[] params = {Sname};
                return sdao.query(sql, tManageStu.class, params);
    }

    @Override
    public List<tManageStu> findBySsex(String Ssex) {
        String sql = "select * from tManageStu where Ssex = ?";
                Object[] params = {Ssex};
                return sdao.query(sql, tManageStu.class, params);
    }

    @Override
    public List<tManageStu> findBySgrade(String Sgrade) {
        String sql = "select * from tManageStu where Sgrade = ?";
                Object[] params = {Sgrade};
                return sdao.query(sql, tManageStu.class, params);
    }

    @Override
    public List<tManageStu> findBySdept(String Sdept) {
        String sql = "select * from tManageStu where Sdept = ?";
                Object[] params = {Sdept};
                return sdao.query(sql, tManageStu.class, params);
    }

    @Override
    public List<tManageStu> findByDno(String Dno) {
        String sql = "select * from tManageStu where Dno = ?";
                Object[] params = {Dno};
                return sdao.query(sql, tManageStu.class, params);
    }
    
    @Override
    public List<tManageStu> findByScin(String startDate,String endDate) {
        String sql = "select * from tManageStu where Scin between '"+startDate+"' and '"+endDate+"'";
                return sdao.query(sql, tManageStu.class);
    }
    
    @Override
    public List<tManageStu> findAll() {
        String sql = "select * from tManageStu";
	return sdao.query(sql, tManageStu.class);    
    }

    @Override
    public List<tManageStu> findByCondition(String condition) {
        String sql = "select * from tManageStu where Sno+Sname+Ssex+Sdept+Dno like ?";
	Object[] params = {"%"+condition+"%"};
	return sdao.query(sql, tManageStu.class, params);
    }

    
    
}
