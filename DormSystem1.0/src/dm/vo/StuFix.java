package dm.vo;

import java.util.Date;

public class StuFix {
	private String Ano;
	private String Aname;
	private String Dno;
	private Date ReportTime;
	private String ReportReason;
	private Date FixTime;
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
