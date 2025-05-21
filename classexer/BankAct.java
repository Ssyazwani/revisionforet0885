package classexer;

public class BankAct {
	
	//Instance Variables
	
	public static String accNo;
	public static String Name;
private static double balance;
	
	public BankAct(String ac, String n,double b) {
		this.accNo = ac;
		this.Name = n;
		this.balance = b;
	}
	
	public static String getaccNo() {
		return accNo;
		
	}
	
	
	public  String setaccNo(String acctNo) {
		return this.accNo = acctNo;
		
	}
	
	
	public static String getName() {
		return Name;
		
	}
	
	
	public String setName(String Name) {
		return this.Name = Name;
	}
	
	public static double getBalance() {
		return balance;
		
	}
	
	
	public double setBalance(double amt) {
		return this.balance = balance;
	}
	
	
	
	//Methods (Behaviour)
	
      public void deposit(double amt) {
		balance += amt;
	}
	
	private static boolean withdraw (double amt) {
		if(balance >= amt) {
			balance = amt;
			return true;}
		else 
		{
		return false;	
		}
	} 
	
	
	public static void checkbalance() {
		System.out.println("The balance is currently "  + balance);
	}
	
	
	
	
	

}
