package dm.po;

public class Student {
    private String Sno;
    private String Sname;
    private String Ssex;
	private Integer Sgrade;
    private String Sdept;
    public Student(String sno, String sname, String ssex, Integer sgrade, String sdept) {
		super();
		this.Sno = sno;
		this.Sname = sname;
		this.Ssex = ssex;
		this.Sgrade = sgrade;
		this.Sdept = sdept;
	}
    
    
	public Student() {
		super();
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

}