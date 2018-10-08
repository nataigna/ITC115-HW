
public class Fibonacci {

	public static void main(String[] args) {
		int fib1=1;
		int fib2=1;
		int fib =0;
		System.out.print(fib2 + " ");
		System.out.print(fib1 + " ");
		
		for (int i=3;i<=12; i++) {
			fib=fib1+fib2;
			System.out.print(fib + " ");
			fib2=fib1;
			fib1=fib;
			
		}
		

	}

}
