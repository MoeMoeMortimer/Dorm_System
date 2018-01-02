package dm.biz;

import java.util.List;

import dm.dao.DormitoryDao;
import dm.po.Dormitory;

public class DormitoryBizImpl implements DormitoryBiz{

		DormitoryDao sdao = new DormitoryDao();

		
		public boolean add(Dormitory d) {
			String sql = "insert into Dormitory values(?,?)";

			Object[] params = {d.getDno(), d.getDtel()};
			return sdao.update(sql, params);
		}


		public boolean delete(String dno) {

			String sql = "delete from Dormitory where dno = ?";
			Object[] params = {dno};
			return sdao.update(sql, params);
			}


		public boolean updateSub(String dnoNew) {
			String sql = "update Dormitory set Dsurplus = Dsurplus - 1 where Dno = ?";
			Object[] params = {dnoNew};
			return sdao.update(sql, params);
		}
                
                public boolean updateAdd(String dnoOld) {
                    String sql = "update Dormitory set Dsurplus = Dsurplus + 1 where Dno = ?";
			Object[] params = {dnoOld};
			return sdao.update(sql, params);
                }
                public List<Dormitory> findDormitory() {
                    String sql = "select * from Dormitory where Dsurplus != 0";
                    return sdao.query(sql, Dormitory.class);
                }

		public List<Dormitory> findAll() {
			String sql = "select * from Dormitory";
			return sdao.query(sql, Dormitory.class);
		}
			
		public List<Dormitory> findByCondition(String condition) {
			String sql = "select * from Dormitory and concat(Dno, Dtel) like ?";
			Object[] params = {"%"+condition+"%"};
			return sdao.query(sql, Dormitory.class, params);
		}


		@Override
		public Dormitory findById(String dno) {
			String sql = "select * from Dormitory where Dno = ?";
			Object[] params = {dno};
			return (Dormitory) sdao.get(sql, Dormitory.class, params);
		}
                public List<Dormitory> findByBno(String bno) {
                    String sql = "select * from Dormitory where Bno = ? and Dsurplus != 0";
			Object[] params = {bno};
			return  sdao.query(sql, Dormitory.class, params);
                }
        
                public List<Dormitory> findByDsurplus(String Dsurplus) {
                    String sql = "select * from Dormitory where Dsurplus >= ? and Dsurplus != 0";
			Object[] params = {Dsurplus};
			return  sdao.query(sql, Dormitory.class, params);
                }
}
