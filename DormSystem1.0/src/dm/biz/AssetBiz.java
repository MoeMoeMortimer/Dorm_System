package dm.biz;

import java.util.List;

import dm.po.Asset;

public interface AssetBiz {

	public boolean add(Asset a);


	public boolean delete(String Ano);


	public boolean update(Asset a);


	public Asset findById(String Ano);


	public List<Asset> findAll();


	public List<Asset> findByCondition(String condition);


}