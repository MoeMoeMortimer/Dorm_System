package dm.biz;

import java.util.List;

import dm.dao.UserDao;
import dm.po.User;


public class UserBizImpl implements UserBiz {
	UserDao udao = new UserDao();
	
	@Override
	public boolean add(User u) {
		String sql = "insert into Users values(?,?,?)";
		Object[] params = {u.getUno(), u.getPass(), u.getPri()};
		return udao.update(sql, params);
	}

	@Override
	public boolean update(User u) {
		String sql = "update Users set Pass = ?, Pri = ? where Uno = ?";
		Object[] params = {u.getPass(), u.getPri(), u.getUno()};
		return udao.update(sql, params);
	}

	@Override
	public User findById(String uno) {
		String sql = "select * from Users where Uno = ?";
		Object[] params = {uno};
		return (User) udao.get(sql, User.class, params);
	}

	@Override
	public boolean delete(String uno) {
		String sql = "delete from Users where Uno = ?";
		Object[] params = {uno};
		return udao.update(sql, params);
	}

	@Override
	public List<User> findAll() {
		String sql = "select * from Users";
		return udao.query(sql, User.class);
	}

}
