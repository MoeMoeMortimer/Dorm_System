package dm.vo;

public class DT {
	private int Bno;
	private String Tno;
	public DT(int bno, String tno) {
		super();
		Bno = bno;
		Tno = tno;
	}
	public DT() {
		super();
	}
	public int getBno() {
		return Bno;
	}
	public void setBno(int bno) {
		Bno = bno;
	}
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}

}
