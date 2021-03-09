class BankAccount{

	//Static properties.
	private static final String bankName;
	private static final String branchName;
	private static final String ifsc;

	//Non-Static properties.
	private long accNum;
	private String accHname;
	private double balance;

	//Static block for initializing static properties.
	static{
		bankName="HDFC";
		branchName="Ameerpet";
		ifsc="HDFC123";
	}

	//Overloaded Constructors for initializing Non-Static properties.

	BankAccount(){
	
	}

	BankAccount(long accNum){
		this.accNum=accNum;
	}

	BankAccount(long accNum,String accHname,double balance){
		this.accNum=accNum;
		this.accHname=accHname;
		this.balance=balance;
	}

	//Getter methods for static properties.
	//No setter methods because these properties are final.
	public String getBankName(){
		return bankName;
	}

	public String getBranchName(){
		return branchName;
	}

	public String getIfsc(){
		return ifsc;
	}

	//Setter and Getter methods for Non-static fields.
	public void setAccNum(long accNum){
		this.accNum=accNum;
	}

	public long getAccNum(){
		return accNum;
	}

	public void setAccHname(String accHname){
		this.accHname=accHname;
	}

	public String getAccHname(){
		return accHname;
	}

	/* For the properties of balance we do not develop
	 * setter and getter methods.
	 * We will use deposit, withdraw and currentBalance(),transferAmount(). 
	*/ 
	public void deposit(double amt){		//acc1.deposit(-)
		balance=balance+amt;
	}

	public void withdraw(double amt){		//acc1.withdraw(-)
		balance=balance-amt;
	}

	public void currentBalance(){			//acc1.currentBalance()
		System.out.println(balance);
	}

	public void transferAmount(BankAccount destAcc,double amt){ //acc1.transferAmount()
		this.balance=this.balance-amt;
		destAcc.balance=destAcc.balance+amt;
	}

	//Displaying all values of BankAccount properties.
	public void display(){
		System.out.println(" bankName\t:" +this.bankName);
		System.out.println(" branchName\t:" +this.branchName);
		System.out.println(" ifsc\t\t:" +this.ifsc);
		System.out.println(" accNum\t\t:" +this.accNum);
		System.out.println(" accHname\t:" +this.accHname);
		System.out.println(" balance\t:" +this.balance);
		System.out.println();
	}
}
