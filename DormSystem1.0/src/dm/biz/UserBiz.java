package dm.biz;

import java.util.List;

import dm.po.User;

public interface UserBiz {

	public boolean add(User u);
	
	public boolean delete(String uno);
	
	public boolean update(User u);

	public User findById(String uno);
	
	public List<User> findAll();

}
