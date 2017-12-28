/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.biz;

import dm.dao.tFixInfoDao;
import dm.vo.tFixInfo;
import java.util.List;

/**
 *
 * @author 28104
 */
public class tFixInfoBizImpl implements tFixInfoBiz{
    tFixInfoDao tdao = new tFixInfoDao();
    @Override
    public boolean update(tFixInfo f) {
        String sql = "update tFixInfo set FixTime = ? where Ano = ? and Dno = ? and ReportTime = ?";
	Object[] params = {f.getFixTime(), f.getAno(), f.getDno(), f.getReportTime()};
	return tdao.update(sql, params);
    }

    @Override
    public List<tFixInfo> findByAno(String Ano) {
        String sql = "select * from tFixInfo where Ano = ? order by ReportTime DESC";
	Object[] params = {Ano};
	return tdao.query(sql, tFixInfo.class, params);
    }

    @Override
    public List<tFixInfo> findByAname(String Aname) {
        String sql = "select * from tFixInfo where Aname = ? order by ReportTime DESC";
	Object[] params = {Aname};
	return tdao.query(sql, tFixInfo.class, params);     
    }

    @Override
    public List<tFixInfo> findByDno(String Dno) {
        String sql = "select * from tFixInfo where Dno = ? order by ReportTime DESC";
	Object[] params = {Dno};
	return tdao.query(sql, tFixInfo.class, params);
    }

    @Override
    public List<tFixInfo> findBySolve() {
        String sql = "select * from tFixInfo where FixTime is not null order by ReportTime DESC";
	return tdao.query(sql, tFixInfo.class);
    }

    @Override
    public List<tFixInfo> findByUnsolve() {
        String sql = "select * from tFixInfo where FixTime is null order by ReportTime DESC";
	return tdao.query(sql, tFixInfo.class);
    }

    @Override
    public List<tFixInfo> findAll() {
        String sql = "select * from tFixInfo order by ReportTime DESC";
	return tdao.query(sql, tFixInfo.class);   
    }

    @Override
    public List<tFixInfo> findByCondition(String condition) {
        String sql = "select * from tFixInfo where Ano+Aname+Dno like ?";
        Object[] params = {"%"+condition+"%"};
	return tdao.query(sql, tFixInfo.class, params);        
    }
    
}
