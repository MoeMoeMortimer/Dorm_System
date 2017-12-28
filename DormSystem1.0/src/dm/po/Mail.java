package dm.po;

import java.util.Date;

public class Mail {
	private String Mno;
	private String Sno;
	private Date Marrive;
	private Date Maccept;
	public Mail() {
		super();
	}
	public Mail(String mno, String sno, Date marrive, Date maccept) {
		super();
		Mno = mno;
		Sno = sno;
		Marrive = marrive;
		Maccept = maccept;
	}
	public String getMno() {
		return Mno;
	}
	public void setMno(String mno) {
		Mno = mno;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public Date getMarrive() {
		return Marrive;
	}
	public void setMarrive(Date marrive) {
		Marrive = marrive;
	}
	public Date getMaccept() {
		return Maccept;
	}
	public void setMaccept(Date maccept) {
		Maccept = maccept;
	}
	
}
