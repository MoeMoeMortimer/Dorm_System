package dm.po;

public class Dormitory {
	private String Dno;
	private String Bno;
	private Integer Dsize;
	private Integer Dsurplus;
	private String Dtel;
	public Dormitory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dormitory(String dno, String bno, Integer dsize, Integer dsurplus, String dtel) {
		super();
		Dno = dno;
		Bno = bno;
		Dsize = dsize;
		Dsurplus = dsurplus;
		Dtel = dtel;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getBno() {
		return Bno;
	}
	public void setBno(String bno) {
		Bno = bno;
	}
	public Integer getDsize() {
		return Dsize;
	}
	public void setDsize(Integer dsize) {
		Dsize = dsize;
	}
	public Integer getDsurplus() {
		return Dsurplus;
	}
	public void setDsurplus(Integer dsurplus) {
		Dsurplus = dsurplus;
	}
	public String getDtel() {
		return Dtel;
	}
	public void setDtel(String dtel) {
		Dtel = dtel;
	}
	

}
