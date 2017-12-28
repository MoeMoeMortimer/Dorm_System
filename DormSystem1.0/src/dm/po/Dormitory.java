package dm.po;

public class Dormitory {
	private String Dno;
	private String Dtel;
	public Dormitory() {
		super();
	}
	public Dormitory(String dno, String dtel) {
		super();
		Dno = dno;
		Dtel = dtel;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getDtel() {
		return Dtel;
	}
	public void setDtel(String dtel) {
		Dtel = dtel;
	}
}
