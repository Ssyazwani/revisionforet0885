package classexer;

public class TestBankAcc {

	public static void main(String[] args) {


		BankAct b1 = new BankAct("1111", "Amy",1000);
		
		
		System.out.println("B1 is " + b1.Name);
		
		b1.checkbalance();
		b1.deposit(500);
		b1.checkbalance();
		
        BankAct b2 = new BankAct("2222", "Kentaro", 200);
		
		
		System.out.println("B2 is " + b2.Name);
		b2.checkbalance();
		b2.deposit(500);
		b2.checkbalance();
		b2.deposit(5001);
		b2.checkbalance();
		
	}

}
