package dm.biz;

import java.util.List;

import dm.dao.SmyAssetDao;
import dm.vo.SmyAsset;


public class SmyAssetBizImpl implements SmyAssetBiz {

	SmyAssetDao adao = new SmyAssetDao();
	@Override
	public List<SmyAsset> findById(String Dno) {
		String sql = "select * from SmyAsset where Dno = ?";
		Object[] params = {Dno};
		return (List<SmyAsset>) adao.query(sql,SmyAsset.class, params);
	}

	@Override
	public List<SmyAsset> findAll() {
		String sql = "select * from SmyAsset";
		return adao.query(sql, SmyAsset.class);
	}

	@Override
	public List<SmyAsset> findByCondition(String condition) {
		String sql = "select * from SmyAsset and concat(Ano, Aname, Dno, Amount) like ?";
		Object[] params = {"%"+condition+"%"};
		return adao.query(sql, SmyAsset.class, params);
	}

	@Override
	public boolean add(SmyAsset a) {
		String sql = "insert into SmyAsset values(?,?,?,?)";
		Object[] params = {a.getDno(), a.getAno(), a.getAname(), a.getAmount()};
		return adao.update(sql, params);
	}

	@Override
	public boolean delete(String Ano, String Dno) {
		String sql = "delete from SmyAsset where Dno = ? and Ano = ?";
		Object[] params = {Ano, Dno};
		return adao.update(sql, params);
		}

	@Override
	public boolean update(SmyAsset a) {
		String sql = "update SmyAsset set Aname = ?, Amount = ? where Ano = ? and Dno = ?";
		Object[] params = {a.getAname(), a.getAmount(), a.getAno(),a.getDno()};
		return adao.update(sql, params);
	}

    @Override
    public List<SmyAsset> findByAId(String con) {
        String sql = "select * from SmyAsset where Ano = ?";
        Object[] params = {con};
        return (List<SmyAsset>) adao.query(sql,SmyAsset.class, params);
    }

    @Override
    public List<SmyAsset> findByAname(String con) {
        String sql = "select * from SmyAsset where Aname = ?";
	Object[] params = {con};
	return (List<SmyAsset>) adao.query(sql,SmyAsset.class, params);
    }

}
