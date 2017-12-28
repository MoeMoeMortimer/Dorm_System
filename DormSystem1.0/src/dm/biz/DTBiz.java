package dm.biz;

import java.util.List;

import dm.vo.DT;

public interface DTBiz {
	
	public boolean add(DT d);

	public boolean delete(int Bno, String Tno);

	public DT findById(String Bno);
        
        public DT findByTno(String Tno);
        
	public List<DT> findAll();

	public List<DT> findByCondition(String condition);

}
