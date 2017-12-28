package dm.biz;

import java.util.List;

import dm.vo.SD;

public interface SDBiz {
	public boolean add(SD s);

	public boolean delete(String Sno, String Dno);

	public SD findById(String Sno);

	public List<SD> findAll();

	public List<SD> findByCondition(String condition);

}
