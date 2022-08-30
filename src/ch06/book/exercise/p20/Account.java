package ch06.book.exercise.p20;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	// 생성자 객체의 값을 초기화
	// Source - 제너레이트 컨스트럭터 유징 필드로 자동생성가능
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
	
}
