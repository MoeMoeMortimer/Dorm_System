package dm.biz;

import java.util.List;

import dm.dao.MailDao;
import dm.po.Mail;

public class MailBizImpl implements MailBiz{

	MailDao sdao = new MailDao();

	
	public boolean add(Mail m) {
		String sql = "insert into Mail values(?,?,?,?)";

		Object[] params = {m.getMno(), m.getSno(), m.getMarrive(), m.getMaccept()};
		return sdao.update(sql, params);
	}


	public boolean delete(String mno) {

		String sql = "delete from Mail where Mno = ?";
		Object[] params = {mno};
		return sdao.update(sql, params);
		}


	public boolean update(Mail m) {
		String sql = "update Mail set Sno = ?, Marrive = ?, Maccept = ? where Mno = ?";
		Object[] params = {m.getSno(), m.getMarrive(), m.getMaccept(), m.getMno()};
		return sdao.update(sql, params);
	}
	
	public List<Mail> findAll() {
		String sql = "select * from Mail";
		return sdao.query(sql, Mail.class);
	}
		
	public List<Mail> findByCondition(String condition) {
		String sql = "select * from Mail and concat(Sno, Sname, Ssex, Sdept) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Mail.class, params);
	}

	public List<Mail> findBySid(String sno) {
		String sql = "select * from Mail where Sno = ?";
		Object[] params = {sno};
		return sdao.query(sql, Mail.class, params);
	}
	
	public List<Mail> findByMid(String mno) {
		String sql = "select * from Mail where Sno = ?";
		Object[] params = {mno};
		return sdao.query(sql, Mail.class, params);
	}

    @Override
    public List<Mail> findBySidTimeAll(String sno, String st, String ed) {
        String sql = "select * from Mail where Marrive >= ? and Marrive <= ? and Sno = ? ";
	Object[] params = {st, ed, sno};
	return sdao.query(sql, Mail.class, params);
    }

    @Override
    public List<Mail> findBySidTimeAr(String sno, String st, String ed) {
        String sql = "select * from Mail where Marrive >= ? and Marrive <= ? and Sno = ? and Maccept is not null ";
	Object[] params = {st, ed, sno};
	return sdao.query(sql, Mail.class, params);
    }

    @Override
    public List<Mail> findBySidTimeAc(String sno, String st, String ed) {
        String sql = "select * from Mail where Marrive >= ? and Marrive <= ? and Sno = ? and Maccept is null ";
	Object[] params = {st, ed, sno};
	return sdao.query(sql, Mail.class, params);
    }

}
