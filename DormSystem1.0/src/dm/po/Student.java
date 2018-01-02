package dm.po;

import java.sql.Date;

public class Student {
    private String Sno;
    private String Sname;
    private String Ssex;
	private Integer Sgrade;
    private String Sdept;
    private String Dno;
    private Date Scin;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sno, String sname, String ssex, Integer sgrade, String sdept, String dno, Date scin) {
		super();
		Sno = sno;
		Sname = sname;
		Ssex = ssex;
		Sgrade = sgrade;
		Sdept = sdept;
		Dno = dno;
		Scin = scin;
	}
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
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	public Integer getSgrade() {
		return Sgrade;
	}
	public void setSgrade(Integer sgrade) {
		Sgrade = sgrade;
	}
	public String getSdept() {
		return Sdept;
	}
	public void setSdept(String sdept) {
		Sdept = sdept;
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