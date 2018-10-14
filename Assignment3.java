
public class Assignment3 {

	public static void main(String[] args) {
		printPowersofN(2,7);
		printPowersofN(5,3);
		
		

	}
	public static void printPowersofN( int base, int exp) {
		for(int i=0; i<=exp; i++) {
			System.out.print((int)Math.pow(base, i)+ " ");
			
		}
		System.out.println();
		
		
				
	}

	
}
