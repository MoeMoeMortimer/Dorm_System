package dm.biz;

import java.util.List;

import dm.vo.*;

public interface DABiz {
	public boolean add(DA d);

	public boolean delete(String Dno,String Ano);

	public DA findByDId(String Dno);

	public List<DA> findAll();

	public List<DA> findByCondition(String condition);

}
