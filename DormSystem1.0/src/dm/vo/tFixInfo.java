package dm.vo;

import java.util.Date;

public class tFixInfo {
	private String Ano;
	private String Aname;
	private String Dno;
	private Date ReportTime;
	private String ReportReason;
	private Date FixTime;
	public tFixInfo(String ano, String aname, String dno, Date reportTime, String reportReason, Date fixTime) {
		super();
		Ano = ano;
		Aname = aname;
		Dno = dno;
		ReportTime = reportTime;
		ReportReason = reportReason;
		FixTime = fixTime;
	}
	public tFixInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public Date getReportTime() {
		return ReportTime;
	}
	public void setReportTime(Date reportTime) {
		ReportTime = reportTime;
	}
	public String getReportReason() {
		return ReportReason;
	}
	public void setReportReason(String reportReason) {
		ReportReason = reportReason;
	}
	public Date getFixTime() {
		return FixTime;
	}
	public void setFixTime(Date fixTime) {
		FixTime = fixTime;
	}
	
	
}
