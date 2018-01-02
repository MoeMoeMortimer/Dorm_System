package dm.biz;

import java.util.Date;
import java.util.List;

import dm.dao.LeaveSchoolDao;
import dm.po.LeaveSchool;

public class LeaveSchoolBizImpl implements LeaveSchoolBiz {
	LeaveSchoolDao sdao = new LeaveSchoolDao();

	
	public boolean add(LeaveSchool ls) {
		String sql = "insert into LeaveSchool values(?,?,?)";
		Object[] params = {ls.getSno(), ls.getSltime(), ls.getSreturn()};
		return sdao.update(sql, params);
	}


	public boolean delete(String Sno, java.sql.Date Sltime) {
		String sql = "delete from LeaveSchool where Sno = ? and Sltime = ?";
		Object[] params = {Sno, Sltime};
		return sdao.update(sql, params);
		}
        public boolean update(String Sno, java.sql.Date Sltime,java.sql.Date Sreturn)
        {
            String sql = "update LeaveSchool set Sreturn = ? where Sno = ? and Sltime = ?";
            Object[] params ={Sreturn, Sno, Sltime};
            return sdao.update(sql, params);
        }
	public List<LeaveSchool> findAll() {
		String sql = "select * from LeaveSchool";
		return sdao.query(sql, LeaveSchool.class);
	}
		
	public List<LeaveSchool> findByCondition(String condition) {
		String sql = "select * from LeaveSchool and concat(Sno, Sltime, Sreturn) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, LeaveSchool.class, params);
	}


	/*public LeaveSchool findById (String sno) {
		String sql = "select * from LeaveSchool where Sno = ?";
		Object[] params = {sno};
		return (LeaveSchool) sdao.get(sql, LeaveSchool.class, params);
	}*/
        
        	public List<LeaveSchool> findById (String sno) {
		String sql = "select * from LeaveSchool where Sno = ?";
		Object[] params = {sno};
		return sdao.query(sql, LeaveSchool.class, params);
	}
        
            @Override
    public List<LeaveSchool> findByIdDate(String Sno, String st, String ed) {
        String sql = "select * from LeaveSchool where Sno = ? and Sltime >= ? and Sreturn <= ?";
	Object[] params = {Sno, st, ed};
	return sdao.query(sql, LeaveSchool.class, params);
    }
    
    public boolean findBySno(String sno) {
        String sql = "select * from LeaveSchool where Sno = ?";
	Object[] params = {sno};
        List<LeaveSchool> list = sdao.query(sql, LeaveSchool.class, params);
	if(list.size()!=0) {
            return true;
        }
        else {
            return false;
        }
    }
        
    public boolean delelteBySno(String sno) {
        String sql = "delete from LeaveSchool where Sno = ?";
        Object[] params = {sno};
	return sdao.update(sql, params);
    }
}
