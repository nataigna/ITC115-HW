import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the month (number from 1 to 12): ");
		int month=console.nextInt();
		System.out.println("Enter the day (number from 1 to 31): ");
		int day=console.nextInt();
		System.out.println(season(month,day));
}
    
    public static String season(int month, int day){
        if ((month == 12 && day > 15 )||(month == 3 && day <= 15)|| month <= 2){
            return "winter";
        } else if ((month == 6 && day <= 15) || month <= 5){
            return "spring";
        } else if ((month == 9 && day <= 15) || month <= 8){
            return "summer";
        } else {
            return "fall";
        }
    }
}
		
		
	