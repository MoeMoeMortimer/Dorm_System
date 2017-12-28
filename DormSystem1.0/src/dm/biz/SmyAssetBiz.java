package dm.biz;

import java.util.List;

import dm.po.Asset;
import dm.vo.SmyAsset;

public interface SmyAssetBiz {
	public boolean add(SmyAsset a);
	
	public boolean delete(String Ano, String Dno);

	public boolean update(SmyAsset a);
	
	public List<SmyAsset> findById(String Dno);

	public List<SmyAsset> findAll();

	public List<SmyAsset> findByCondition(String condition);

    public List<SmyAsset> findByAId(String con);

    public List<SmyAsset> findByAname(String con);
}
