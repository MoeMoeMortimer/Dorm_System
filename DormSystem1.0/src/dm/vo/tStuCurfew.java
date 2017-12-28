package dm.vo;

import java.util.Date;

public class tStuCurfew {
	private String Sno;
	private String Sname;
	private String Dno;
	private Date NightTime;
	private String NightReason;
	private String Tno;
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
	public Date getNightTime() {
		return NightTime;
	}
	public void setNightTime(Date nightTime) {
		NightTime = nightTime;
	}
	public String getNightReason() {
		return NightReason;
	}
	public void setNightReason(String nightReason) {
		NightReason = nightReason;
	}
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public tStuCurfew(String sno, String sname, String dno, Date nightTime, String nightReason, String tno) {
		super();
		Sno = sno;
		Sname = sname;
		Dno = dno;
		NightTime = nightTime;
		NightReason = nightReason;
		Tno = tno;
	}
	public tStuCurfew() {
		super();
		// TODO Auto-generated constructor stub
	}
}
