import java.util.Random;

public class Assignment5 {

	public static void main(String[] args) {
		makeGuesses();
		makeGuesses2();
		

	}
    // using while loop
	public static void makeGuesses() {	
		Random rand= new Random();
		int counter=0;
		int guess=0;
		while (guess < 48) {
			guess = rand.nextInt(50)+1;
			counter ++;
			System.out.println("guess = "+ guess);
			
		}
		System.out.println("total guesses = " + counter);
	}
	//using do while loop
	public static void makeGuesses2() {
		Random rand= new Random();
		int counter = 0;
		int guess = 0;
		do {
			guess =rand.nextInt(50)+1;
			counter++;
			System.out.println("guess = "+ guess);
			
		} while(guess < 48);
		System.out.println("total guesses = " + counter);
		
	}
}
