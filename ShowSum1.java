import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//read numbers from the file and report the sum
public class ShowSum1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input= new Scanner(new File ("numbers.dat"));
		double sum =0.0;
		for (int i =1; i<=5;i++) {
			double next=input.nextDouble();
			System.out.println("number"+ i +"=" +next);
			sum+=next; //sum=sum+next
		}
		System.out.println("Sum =" + sum);
		input.close();

	}

}
