package dm.po;

public class Asset {
	private String Ano;
	private String Aname;
	private int Aprice;
	private int Astore;
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public int getAprice() {
		return Aprice;
	}
	public void setAprice(int aprice) {
		Aprice = aprice;
	}
	public int getAstore() {
		return Astore;
	}
	public void setAstore(int astore) {
		Astore = astore;
	}
	public Asset() {
		super();
	}
	public Asset(String ano, String aname, int aprice, int astore) {
		super();
		Ano = ano;
		Aname = aname;
		Aprice = aprice;
		Astore = astore;
	}
}
