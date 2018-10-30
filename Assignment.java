import java.util.Random;

public class Assignment {

	public static void main(String[] args) {
		randomWalk();
		

	}
	public static void randomWalk() {
		Random rand = new Random();
		int position =0;
		int step =0;
		
	
		while(position!=3 && position !=-3){
			step = rand.nextInt(2);
			step++;
			System.out.println("possition= "+ position);
			
			if(position == 0) {
				step++;
			} else {
			
		}
	
		System.out.println("Position: " + step);
		

			step ++;
		}
	}

}
