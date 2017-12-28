package dm.po;

public class User {
	private String Uno;
	private String Pass;
	private int Pri;
	public User(){
		super();
	}
	public User(String uno, String pass, int pri) {
		super();
		Uno = uno;
		Pass = pass;
		Pri = pri;
	}
	
	public String getUno() {
		return Uno;
	}
	public void setUno(String uno) {
		Uno = uno;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public int getPri() {
		return Pri;
	}
	public void setPri(int pri) {
		Pri = pri;
	}
	
}
