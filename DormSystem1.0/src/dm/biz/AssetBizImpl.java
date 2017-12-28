package dm.biz;

import java.util.List;

import dm.dao.AssetDao;
import dm.po.Asset;

public class AssetBizImpl implements AssetBiz{

	AssetDao adao = new AssetDao();

	
	public boolean add(Asset a) {
		String sql = "insert into Asset values(?,?,?,?)";

		Object[] params = {a.getAno(), a.getAname(), a.getAprice(), a.getAstore()};
		return adao.update(sql, params);
	}


	public boolean delete(String Ano) {
		String sql = "delete from Asset where Ano = ?";
		Object[] params = {Ano};
		return adao.update(sql, params);
		}


	public boolean update(Asset a) {
		String sql = "update Asset set Aname = ?, Aprice = ?, Astore = ? where Ano = ?";
		Object[] params = {a.getAname(), a.getAprice(), a.getAstore(),a.getAno()};
		return adao.update(sql, params);
	}

	public List<Asset> findAll() {
		String sql = "select * from Asset";
		return adao.query(sql, Asset.class);
	}
		
	public List<Asset> findByCondition(String condition) {
		String sql = "select * from Asset and concat(Ano, Aname, Aprice, Astore) like ?";
		Object[] params = {"%"+condition+"%"};
		return adao.query(sql, Asset.class, params);
	}


	@Override
	public Asset findById(String Ano) {
		String sql = "select * from Asset where Ano = ?";
		Object[] params = {Ano};
		return (Asset) adao.get(sql, Asset.class, params);
	}


}
