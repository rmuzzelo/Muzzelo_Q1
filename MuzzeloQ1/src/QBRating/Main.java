package QBRating;

//imports Scanner
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		//Creates Scanner object
		Scanner input = new Scanner(System.in);
		
		/*Asks for attempts, completions, yards, touchdowns, and interceptions
		 and stores inputs as variables.
		 */
		System.out.print("Number of passing attempts:");
		double att = input.nextDouble();
		System.out.print("Number of completions:");
		double comp = input.nextDouble();
		System.out.print("Passing yards:");
		double yds = input.nextDouble();
		System.out.print("Touchdown passes:");
		double td = input.nextDouble();
		System.out.print("Number of Interceptions:");
		double inter = input.nextDouble();
		
		//Calculates passer rating
		double a = ((comp/att) - 0.3) * 5;
		double b = ((yds/att) - 3) * .25;
		double c = (td/att) * 20;
		double d = 2.375 - ((inter/att) *25);
		
		double rating = ((a + b + c + d) / 6) * 100;
		
		//Prints out passer rating
		System.out.printf("The QB passer rating is %.1f ", rating);

	}

}
