package Gitdemo1;

public class Bank {
	
	static int currentbalance = 10000;
	 // method body
	public static void greetcustomer() {
		System.out.println("Hello, Welcome to Axis bank Application");
	
	}
	public void deposit(int amount) {
		currentbalance = currentbalance + amount;
		System.out.println("Ammount is deposited successfully");
	}
	
	public static void  withdrawal(int amount) {
		currentbalance = currentbalance - amount;
		System.out.println("Amount is withdrawn succesully");

	}
	public int getcurrentBalance() {
		return currentbalance;
		
	}
	public static void main(String[] args) {
   	 Bank bank= new Bank();
         greetcustomer();
         System.out.println("currentbalance is :"+ bank.getcurrentBalance());

    	bank.deposit(1000);
        	System.out.println("currentbalance is :" +bank.getcurrentBalance());
        withdrawal(3000);
    	System.out.println("currentbalance is :" +bank.getcurrentBalance());
    	bank.deposit(500);
     	System.out.println("currentbalance is :"+ bank.getcurrentBalance());
     	withdrawal(600);
     	System.out.println("currentbalance is :"+ bank.getcurrentBalance());


    	

}
}
