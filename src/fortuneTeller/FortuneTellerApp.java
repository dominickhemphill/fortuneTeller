package fortuneTeller;
import java.util.Scanner;
import java.lang.*;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter your first name: ");
		
			String fName = input.next();
			
			
		
		System.out.println("Please enter your last name: ");
		
			String lName = input.next();
			
			
		
		System.out.println("Please enter your age: ");
		
			int age = input.nextInt();
			String retirementYears;   
			if ((age % 2) == 0) {
				retirementYears = " you will retire in " + (age + 12) + " years,";
				 } else {
				retirementYears = " you will retire in " + (age + 14) + " years,"; }
		
		
			
			System.out.println("Please enter 1-12 for your birth month number:");
		
			int bMont = input.nextInt();
			String bStatement;
			
			if (bMont == 1 || bMont == 2 || bMont == 3 || bMont == 4 ) {
				bStatement = " your bank account will contain $-45.00,";
			}
			else if (bMont == 5 || bMont == 6 || bMont == 7 || bMont == 8) {
				bStatement = " your bank account will contain $60000.00,";
			}
			else if (bMont == 9 || bMont == 10 || bMont == 11 || bMont == 12) {
			    bStatement = " your bank account will contain $100000000.00,";
			}else{
				bStatement = " your bank account will contain $0.00,";
			}
			
		
		
			System.out.println("Please enter your favorite ROYGBIV color(type Help for a list of colors).: ");
		
			String rOygbiv = input.next();
			String favColor = rOygbiv.toLowerCase();
			String carName = "";
			
			
				
			if(favColor.equals("red")) {
				carName = " your mode of transportation will be a skateboard.";
			}
			else if(favColor.equals("orange")) {
				carName = " your mode of transportation will be a private jet.";
			}
			else if(favColor.equals("yellow")) {
				carName = " your mode of transportation will be a bicycle.";
			}
			else if(favColor.equals("green")) {
				carName = " your mode of transportation will be a luxury yacht.";
			}
			else if(favColor.equals("blue")) {
				carName = " your mode of transportation will be a Tesla.";
			}
			else if(favColor.equals("indigo")) {
				carName = " your mode of transportation will be walking.";
			}
			else if(favColor.equals("violet")) {
				carName = " your mode of transportation will be a Cota.";
			}
			else if(favColor.equals("help")) {
				System.out.println("ROYGBIV colors include: Red, Orange, Yellow, Green, Blue, Indigo, or Violet.");
			
			
			}
			
			
			
			
			System.out.println("Please enter the number of siblings you have: ");
			
			int sIbling = input.nextInt();
			String vacationHome;
			if(sIbling == 0) {
				vacationHome = " your vacation home location will be in Columbus, OH, and";
			}
			else if(sIbling == 1) {
				vacationHome = " your vacation home location will be in Cincinnati, OH, and";
			}
			else if(sIbling == 2) {
				vacationHome = " your vacation home location will be in Cleveland, OH, and";
			}
			else if(sIbling == 3) {
				vacationHome = " your vacation home location will be in Dayton, OH, and";
			}
			else if(sIbling > 3) {
				vacationHome = " your vacation home location will be somewhere in New York, and";
			}else{
				vacationHome = "your vacation home location will be alone on a deserted island, and";
		}
		

			
		System.out.println(fName + " " + lName + "," + retirementYears +  bStatement + vacationHome + carName);	
		
		
		
		
		
	}

}


