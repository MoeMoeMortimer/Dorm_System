package dm.vo;

import java.sql.Time;
import java.util.Date;

public class Repairs {
	private String Ano;
	private String Dno;
	private String ReportTime;
	private String ReportReason;
	private String FixTime;
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getReportTime() {
		return ReportTime;
	}
	public void setReportTime(String reportTime) {
		ReportTime = reportTime;
	}
	public String getReportReason() {
		return ReportReason;
	}
	public void setReportReason(String reportReason) {
		ReportReason = reportReason;
	}
	public String getFixTime() {
		return FixTime;
	}
	public void setFixTime(String fixTime) {
		FixTime = fixTime;
	}
	public Repairs(String ano, String dno, String reportTime, String reportReason, String fixTime) {
		super();
		Ano = ano;
		Dno = dno;
		ReportTime = reportTime;
		ReportReason = reportReason;
		FixTime = fixTime;
	}
	public Repairs() {
		super();
	}

}
