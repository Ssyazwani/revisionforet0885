package classexer;

//Q6.3.1 Design a Donation class, which has:
//public instance variable donor which stores donor’s name
//public instance variable amount which stores the amount of money a donor donates
//public static property totalAmount which stores total amount of money from all donors
//A constructor which can initialize donor’s name and amount of money donated through its parameters, then update totalAmount
//Method donate with signature:
//public void donate(double amt)
//which increases instance variable amount’s value by parameter amt’s value, and updates totalAmount.

//Q6.3.2 Design a testing program, in this program,
// •	Mr. Lee KC donates $100,000 initially, then he donates $8,000, $5,000 again.
// •	Organization “Foundation Two” donates $10,000 initially, then it donates $5,000, $3,000, $9,000 respectively.
// •	Print out total amount of money donated by Mr. Lee KC
// •	Print out total amount of money donated by "Foundation Two".


public class Donation {
	
	public static String donor;
	public static double amount;
	public static double totalAmount;

	public Donation(String donor, double amount,double totalAmount){
		this.donor = donor;
		this.amount = amount;
		this.totalAmount = totalAmount;
	}
	
	public String getdonor() {
	    return donor;
	  }
	  public void setdonor(String donor) {
	   this.donor= donor;
	
	  }

	  public double getamount() {
		return amount;
		 
	  }

	  public void setamount(int amount) {
		  this.amount = amount;
	  }

	   public double gettotalAmount() {
		return totalAmount;
		 
	  }

	  public void settotalAmount(int totalAmount) {
		  this.totalAmount = totalAmount;
	  }

	  public void donate(double amt){
		 amount += amt;         
         totalAmount += amt;

	  }

	  public static void checktotalDonation() {
		System.out.println(donor + " has donated " + amount);
		System.out.println("The donation from " + donor +" has amounted to "  + totalAmount + " as of now");
		
	}

		


public static void main(String[] args) {

	Donation testdonor1 = new Donation("Hokuto", 0,0);

	    testdonor1.checktotalDonation();
		testdonor1.donate(500);
		testdonor1.checktotalDonation();

	Donation donor1 = new Donation("Mr. Lee KC", 100000,100000);
	donor1.donate(8000);
	donor1.donate(5000);
	donor1.checktotalDonation();



	Donation donor2 = new Donation("Foundation Two", 10000,10000);
	donor2.donate(5000);
	donor2.donate(3000);
	donor2.donate(9000);
	donor2.checktotalDonation();


	

}

}
