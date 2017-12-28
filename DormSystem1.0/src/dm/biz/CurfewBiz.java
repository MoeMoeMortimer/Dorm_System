package dm.biz;

import java.util.Date;
import java.util.List;

import dm.vo.*;

public interface CurfewBiz {
	public boolean add(Curfew c);

	public boolean delete(String Sno,String Tno,String NightTime);

	public List<Curfew> findById(String Sno);

        public List<Curfew> findByIdNot(String Sno);
        
        public List<Curfew> findByIdAc(String Sno);
        
	public List<Curfew> findAll();

	public List<Curfew> findByCondition(String condition);

}
