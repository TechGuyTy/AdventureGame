import java.util.Scanner;

public class DiceRoller {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome to the Automated Dice Roller! \nwould you like to roll the dice? (y/n):");
		
		
		do{
		
		int numberOfSides = 0;
		
		String choice = scan.nextLine();
		
		while(!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
			System.out.println("Sorry, incorrect input. Please type a \" y \" or and \" n \" ");
			choice=scan.nextLine();
		}
		
		System.out.println("Great! Let's get started! How many sides does the die you want to roll have?" );
		
//		while(true){
		
		
		numberOfSides = Integer.parseInt(scan.nextLine());
		
		
		System.out.println("You chose to use a die with " + numberOfSides + " sides.");
		
		diceRoll(numberOfSides);

		System.out.println("Do you want to roll again?! (y/n)");
		
		choice = scan.nextLine();
		
		while (!choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("y")) {
			System.out.println("Sorry, incorrect input.");
			choice = scan.nextLine();
		}
		
		if (choice.equalsIgnoreCase("n")) {
			System.out.println("Goodbye!");
			break;
		} 
		
//		}
		}while(true);
		
		
	}


public static int diceRoll(int numberOfSides){
	
	int result = (int) Math.ceil(Math.random() * numberOfSides);
	System.out.println("Roll 1: " + result);
	
	int result2 = (int) Math.ceil(Math.random() * numberOfSides);
	System.out.println("Roll 2: " + result2);
		
	int total = (result + result2);
	
	System.out.println("Total: " + total);

	
	if (result == 1 && result2 == 1){
		System.out.println("SNAKE EYES! NOICE!");
	}
	
	if (result == 6 && result2 == 6){
		System.out.println("BOX CARS! NOICE!");
	}
	
	if (total == 7){
		System.out.println("YOU GOT CRAPS! NOICE!");
	}
	
	
	return (result + result2);
}





}