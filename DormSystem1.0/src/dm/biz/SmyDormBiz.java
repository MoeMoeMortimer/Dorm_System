package dm.biz;

import java.util.List;

import dm.vo.SmyDorm;

public interface SmyDormBiz {
	public SmyDorm findById(String Dno);

	public List<SmyDorm> findAll();

	public List<SmyDorm> findByCondition(String condition);
}
