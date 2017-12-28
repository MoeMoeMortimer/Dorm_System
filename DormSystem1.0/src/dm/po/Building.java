package dm.po;

import java.util.Date;

public class Building {
	private int Bno;
	private String Bblock;
	private Date Btime;// DateTime for Sql, Date for Java
	public Building() {
		super();
	}
	public Building(int bno, String bblock, Date btime) {
		super();
		Bno = bno;
		Bblock = bblock;
		Btime = btime;
	}
	public int getBno() {
		return Bno;
	}
	public void setBno(int bno) {
		Bno = bno;
	}
	public String getBblock() {
		return Bblock;
	}
	public void setBblock(String bblock) {
		Bblock = bblock;
	}
	public Date getBtime() {
		return Btime;
	}
	public void setBtime(Date btime) {
		Btime = btime;
	}
}
