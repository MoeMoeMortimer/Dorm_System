package dm.vo;

public class DA {
	private String Dno;
	private String Ano;
	private int Amount;
	public DA() {
		super();
	}
	public DA(String dno, String ano, int amount) {
		super();
		Dno = dno;
		Ano = ano;
		Amount = amount;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
}
