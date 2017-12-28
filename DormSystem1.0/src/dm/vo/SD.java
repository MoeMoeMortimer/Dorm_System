package dm.vo;

import java.sql.Date;

public class SD {
	private String Sno;	
	private String Dno;
	private Date Scin;
	public SD() {
		super();
	}
	public SD(String sno, String dno, Date scin) {
		super();
		Sno = sno;
		Dno = dno;
		Scin = scin;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public Date getScin() {
		return Scin;
	}
	public void setScin(Date scin) {
		Scin = scin;
	}

}
