
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Natasha = new BankAccount("Natasha", 1000000, 2);
		System.out.println(Natasha.toString());
		
		Natasha.deposit(10000);
		System.out.println(Natasha.toString());
		
		Natasha.withdraw(1100000);
		System.out.println(Natasha.toString());
	}

}
