package dm.biz;

import java.util.List;

import dm.dao.StuFixDao;
import dm.vo.SmyAsset;
import dm.vo.StuFix;

public class StuFixBizImpl implements StuFixBiz {

	StuFixDao sfdao = new StuFixDao();
	@Override
	public boolean add(StuFix a) {
		String sql = "insert into StuFix values(?,?,?,?)";
		Object[] params = {a.getAno(), a.getAname(), a.getDno(), a.getReportTime(), a.getReportReason()};
		return sfdao.update(sql, params);
	}

	@Override
	public boolean delete(String ReportTime, String Dno) {
		String sql = "delete from StuFix where Dno = ? and ReportTime = ?";
		Object[] params = {ReportTime, Dno};
		return sfdao.update(sql, params);
	}

	@Override
	public boolean update(StuFix a) {
		String sql = "update StuFix set Ano = ?, Aname = ?, Dno = ?, ReportReason = ? where Ano = ? and Dno = ?";
		Object[] params = {a.getAno(), a.getAname(), a.getDno(), a.getReportReason(), a.getAno(),a.getDno()};
		return sfdao.update(sql, params);
	}

	@Override
	public List<StuFix> findAll(String Dno) {
            String sql = "select * from StuFix where Dno = ?";
            Object[] params = {Dno};
            return sfdao.query(sql, StuFix.class,params);
	}

	@Override
	public List<StuFix> findByCondition(String condition) {
		String sql = "select * from StuFix and concat(Ano, Aname, Dno, ReportReason) like ?";
		Object[] params = {"%"+condition+"%"};
		return sfdao.query(sql, StuFix.class, params);
	}

    @Override
    public List<StuFix> findAllNot(String Dno) {
        String sql = "select * from StuFix where Dno = ? and FixTime is null";
        Object[] params = {Dno};
        return sfdao.query(sql, StuFix.class, params);
    }

    @Override
    public List<StuFix> findAllAc(String Dno) {
        String sql = "select * from StuFix where Dno = ? and FixTime is not null";
        Object[] params = {Dno};
        return sfdao.query(sql, StuFix.class, params);
    }
}
