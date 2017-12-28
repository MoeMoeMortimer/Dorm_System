package dm.po;

import java.util.Date;

public class LeaveSchool {
	private String Sno;
	private Date Sltime;
	private Date Sreturn;
	public LeaveSchool() {
		super();
	}
	public LeaveSchool(String sno, Date sltime, Date sreturn) {
		super();
		Sno = sno;
		Sltime = sltime;
		Sreturn = sreturn;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
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
}
