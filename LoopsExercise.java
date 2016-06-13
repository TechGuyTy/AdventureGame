import java.util.Scanner;

public class LoopsExercise {

	public static void main(String[] args) {

		String choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my Java-based text adventure! \nWould you like to play?\n1. yes\n2. no");
		choice = scan.nextLine();
		String ans = isValidInput2(scan, choice);

		boolean start = true;

		if (Integer.parseInt(choice) == 2) {
			System.out.println("You're missing out on an epic adventure! Maybe some other time.");
			start = false;
		}

		if (start == true)
			// ask for name
			System.out.println("What's your name, mighty warrior?!");
		String name = scan.nextLine();
		do {
			System.out.println("A dragon is approaching the city to satisfy its hunger for human flesh");
			System.out.println("1. Head out with the group \n2. You're already good as dead, head to the pub!");
			ans = scan.nextLine();
			// validate input
			ans = isValidInput2(scan, ans);
			if (ans.equalsIgnoreCase("1")) {
				// run
				System.out.println("You and the rest of your party embark into the woods. \nYou reach a small clearing as dusk begins to fall.\n They all want to rest, but you know time's a limited resource. \n Do you press on or get some shut eye? \n1.Press Forward! \n2. Rest in the woods");
				ans = scan.nextLine();
				// validate input
				ans = isValidInput2(scan, ans);
				if (ans.equalsIgnoreCase("1")) {
					// gun
					
					System.out.println("You decide this dragon must be defeated even if it must be done by yourself. You grab your belongings and head into the woods.");
					
					System.out.println("You reach the approximate location of where the dragon is rumored to reside. \nThere's a shiny mirrored boulder blocking the entrance to the cave. \nYou remember there were special words to unlock the door, but you're stuck between two. \n1. Wingardium Leviosa \n2. Sectrum Sempra");
					
					ans = scan.nextLine();
					// validate input
					ans = isValidInput2(scan, ans);
					
					if (ans.equalsIgnoreCase("1")) {
						// gun
						System.out.println("You murmer the incantation and the boulder begins to tremble. After a brief moment, the boulder is now levitating allowing passage into the cave.");
						
						System.out.println("A dark tunnel is revealed with torches lining the side of it. \nThis is definitely it, but you're alone. You walk into the cave and you soon meet the menace! Now's your time to strike.\nDo you want to use the small dagger the old man says to use or your trusty battle axe? \n1.Trusty Battle Axe \n2.Worn beaten, dagger. ");
						
						ans = scan.nextLine();
						// validate input
						ans = isValidInput2(scan, ans);
						
						if (ans.equalsIgnoreCase("1")) {
							// gun
							System.out.println("You murmer the incantation and the boulder begins to tremble. After a brief moment, the boulder is now levitating allowing passage into the cave.");
						} else if (ans.equalsIgnoreCase("2")) {
							// sword
							System.out.println("You murmer the incantation and a beam of light heads towards the boulder. \nThe beam of light refracts within the boulder and then the beam comes back at you! \nYou remembered the wrong spell. GAME OVER!");
						}
						
					} else if (ans.equalsIgnoreCase("2")) {
						// sword
						System.out.println("You murmer the incantation and a beam of light heads towards the boulder. \nThe beam of light refracts within the boulder and then the beam comes back at you! \nYou remembered the wrong spell. GAME OVER!");
					}
					
				} else if (ans.equalsIgnoreCase("2")) {
					// sword
					System.out.println("You lay down to rest with the group. \n Just as fast as your eyes begin to shut, a dragon appears. \nHe incinerates your entire camp. \n GAME OVER.");
				}
			} else {
				// pub death
				System.out.println(
						"As you get to the door of the pub, the dragon flies in and incinerates the whole town. \nNice try "
								+ name + " \nGAME OVER");
				break;
				// fight

			}
			// do you want to play game?
			System.out.println("Do you want to play again? \n1. yes\n2. no");
			choice = scan.nextLine();

		} while (choice.equalsIgnoreCase("1"));

		System.out.println("Thank you for playing?");
	}

	//
	// /**
	// * Checks if input is less than 3
	// * @param scan
	// * @param ans
	// * @return
	// */
	public static String isValidInput2(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("1") && !ans.equalsIgnoreCase("2")) {
			System.out.println("Invalid input. You must choose a 1 or a 2");
			ans = scan.nextLine();
		}
		return ans;
	}

}