package dm.vo;

public class DT {
	private String Bno;
	private String Tno;
	public DT(String bno, String tno) {
		super();
		Bno = bno;
		Tno = tno;
	}
	public DT() {
		super();
	}
	public String getBno() {
		return Bno;
	}
	public void setBno(String bno) {
		Bno = bno;
	}
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}

}
