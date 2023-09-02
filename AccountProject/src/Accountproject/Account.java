package Accountproject;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	//creando mi constructor 
	public Account (String id, String name) {
		this.id =id;
		this.name=name;
	}
	
	public Account (String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	//getters and setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//mètodos
	public int credit (int amount) {
		this.balance += amount;
		return this.balance;
		
	}
	
	public int debit (int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			
		} else {
			System.out.println("LA cantidad excede el balance");
		}
		return this.balance;
	}
	
	public int tranferTo(Account another, int amount) {
		if (amount <= this.balance) {
			this.debit(amount);
			another.credit(amount);
		} else {
			
			System.out.println("El monto supera el balance");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

	
}
