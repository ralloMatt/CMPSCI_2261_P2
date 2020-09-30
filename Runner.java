import java.util.Scanner; // So I can use the scanner

public class Runner {  // Main class that runs the program
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); // Making the scanner
		
		System.out.println("How many humans do you want?"); 
		int num_humans = scan.nextInt(); //Seeing how big of an array of humans I need based on user input
		
		Human[] array = new Human[num_humans]; // creating the array of HUMAN objects

		
		
		int counter = 0; // counter used for while loop
		int num_dogs; // num_dogs is the amount of dogs each human will have based on user input
		scan.nextLine(); // It was used to fixed the while loop
		
		while(counter != num_humans){ // So when the counter == num_humans it will stop looping
			
			System.out.println("\nWhat would you like to name human number " + (counter+1) + "?"); // getting names
			String name = scan.nextLine();// scanning names from user
			
			System.out.println("How many dogs should " + name + " have?"); // getting amount of dogs each human will have

			num_dogs = scan.nextInt();
			scan.nextLine();
			array[counter] = new Human(name, num_dogs); // Using human constructor to make array and store name
			

			counter++; // adding up counter
		}
		
		
	
		
		int day = 1; // Days used to determine what day the user is on
		int game_over = 0;
		int i; // for for loop
		
		while(game_over != -1) {
			
			System.out.println("\nDay " + day +"\n"); // Showing user what day they are on
			
			for(i=0; i<array.length; i++) {
				array[i].display_humans(); // Display human attributes
			}
			
			
			int truth = 1;
			
			while(truth != 0){
			
				System.out.println("\nWhich human would you like to play with?");
				
				for(i=0; i<array.length; i++) {
					// Printing out all the human names and asking for a digit that will be used to find human in the array
					System.out.println("Press " + (i+1) + " for " + array[i].human_name); 
				}
				
				
				
				int play_with = scan.nextInt();  // Play_with will be the human the user is playing with
				play_with--;
				
				System.out.println("You chose to play with " + array[play_with].human_name);
				System.out.println("What would you like to do with " + array[play_with].human_name + "?");
				
				//Giving user options for the game
				System.out.println("\nPress 1 if you want " + array[play_with].human_name + " to walk the dogs.");
				System.out.println("Press 2 if you want " + array[play_with].human_name + " to feed the dogs.");
				System.out.println("Press 3 if you want "  + array[play_with].human_name + " to bathe the dogs.");
				System.out.println("Press 4 if you want " + array[play_with].human_name + " to go to work.");
				System.out.println("Press 5 if you want " + array[play_with].human_name + " to buy more dogfood.\n");
				
				
				int action = scan.nextInt(); // Scanning that action 
				
				switch(action){ // using switch statement to do the human method the user wants
				
					case 1:		array[play_with].walks(); //if user enters 1 and so on
								break;
					
					case 2: 	array[play_with].feeds();
								break;
					
					case 3: 	array[play_with].bathes();
								break;
								
					case 4:		array[play_with].works();
								break;
						
					case 5: 	array[play_with].buys_food();
								break;
								
					default: 	break;  // in case user enters something else
				
				}
				
			
				System.out.println("\nDo you wish to play with another human?");
				System.out.println("Enter 1 for YES. Enter 0 for NO.");
				truth = scan.nextInt();
			
			}// ends while
			
			
			for(i=0; i<array.length; i++){ //Pass the time method after end of day
				array[i].pass_the_time();
			}
			
			day++;
			
			System.out.println("\n\nDo you wish to still play my silly game or do you wish to move on to tomorrow?");
			System.out.println("Enter -1 if you want to quit. Enter 1 if you want to go on to Day " + day);
			game_over = scan.nextInt();
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
