package dm.biz;


import java.util.Date;
import java.util.List;
import dm.vo.StuCurfew;

public interface StuCurfewBiz {
	public boolean add(StuCurfew a);

	//删除一条晚归申请，如果是教师已经批准的则不能取消
	public boolean delete(String Sno, Date NightTime);
	
	//更改一条晚归申请，如果是教师已批准的则不能取消
	public boolean update(StuCurfew a);

	public StuCurfew findById(String Sno);

	public List<StuCurfew> findAll();

	public List<StuCurfew> findByCondition(String condition);
}  
