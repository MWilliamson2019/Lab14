import java.util.Scanner;

public class Romshambo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scnr = new Scanner(System.in);
	      int nextChoice;

	      nextChoice = scnr.nextInt();
		   switch (nextChoice) {
		      case 0: 
		         System.out.println("Rock");
		         break;
		         
		      case 1:
		         System.out.println("Paper");
		         break;
		         
		      case 2:
		         System.out.println("Scissors");
		         break;
		         
		     default:
		         System.out.println("Unknown");
		         break;
		   }
		
	}

}
