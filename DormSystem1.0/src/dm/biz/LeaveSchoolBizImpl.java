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


	public boolean delete(String dno, Date Sltime, Date Sreturn) {

		String sql = "delete from LeaveSchool where Sno = ? and Sltime = ? and Sreturn = ?";
		Object[] params = {dno, Sltime, Sreturn};
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
}
