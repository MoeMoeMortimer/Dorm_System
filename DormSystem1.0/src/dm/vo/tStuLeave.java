package dm.vo;

import java.util.Date;

public class tStuLeave {
	private String Sno;
	private String Sname;
	private String Dno;
	private Date Sltime;
	private Date Sreturn;
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public Date getSltime() {
		return Sltime;
	}
	public void setSltime(Date sltime) {
		Sltime = sltime;
	}
	public Date getSreturn() {
		return Sreturn;
	}
	public void setSreturn(Date sreturn) {
		Sreturn = sreturn;
	}
	public tStuLeave(String sno, String sname, String dno, Date sltime, Date sreturn) {
		super();
		Sno = sno;
		Sname = sname;
		Dno = dno;
		Sltime = sltime;
		Sreturn = sreturn;
	}
	public tStuLeave() {
		super();
		// TODO Auto-generated constructor stub
	}
}
