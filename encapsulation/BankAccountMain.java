package encapsulation;

public class BankAccountMain {

	    public static void main(String[] args) {
	        BankAccount ac = new BankAccount();

	        ac.deposit(5000);
	        ac.withdraw(1500);

	        System.out.println("Current Balance: " + ac.getBalance());
	    }
}

