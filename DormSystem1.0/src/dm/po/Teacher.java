package dm.po;

public class Teacher {
	private String Tno;
	private String Tname;
	private String Tsex;
	
	
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTsex() {
		return Tsex;
	}
	public void setTsex(String tsex) {
		Tsex = tsex;
	}
	public Teacher(String tno, String tname, String tsex) {
		super();
		Tno = tno;
		Tname = tname;
		Tsex = tsex;
	}
	public Teacher() {
		super();
	}

}
