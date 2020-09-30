import java.util.Scanner; // So I can use the scanner

public class Human { // Object Human
	
	String human_name; // Name of the human
	int money = 100; // Money that the human has
	int dogfood = 10; // Amount of food the human has
	Dog[] pet_array; // The array of dogs the human owns
	int size;  //Size of specific human dog array 
	
	public Human(String name, int length){ // Constructor human
		
		human_name = name; // giving values to attributes of human
		pet_array = new Dog[length];
		size = length; // Used for size of dog array
		
		System.out.println("\nYou created " + human_name); // To let user know what's up
		System.out.println(human_name + " now has " + length + " dogs.\n");
		Scanner scan = new Scanner(System.in); // making scanner
		int counter = 0;
		
		
		
		while(counter != length){
			
			System.out.println("What would you like to name dog number " + (counter+1) + "?");
			String dog_name = scan.nextLine();
			
			pet_array[counter] = new Dog(dog_name, human_name); // Giving names to the dogs using the dog constructor
			
	
			counter++;
		}
	
		
	
	
	}
	
	
	public void walks () { // Method to walk the dogs
		
			System.out.println("It's a beutiful day and the dogs are having fun on their walk.");
			
			int i;
			
			for(i=0; i<size; i++){
				pet_array[i].fun = pet_array[i].fun + 10; // Increasing the fun dog attribute
				pet_array[i].cleanliness = pet_array[i].cleanliness - 5; // decreasing clean dog attribute
			}
			
			System.out.println(human_name + "'s dogs fun increased but the dogs got a little dirty.");
			
	}
	
	public void feeds (){ // Method to feed the dogs
		
		if(dogfood > 0) { // User can feed teh dogs as long as the got food
			System.out.println("The dogs are so excited that their fun increased a little.");
			System.out.println(human_name + "'s dogs are eating like they never ate before.");
			System.out.println("Each dog eats about 2 cups of dogfood everyday.");
			
			dogfood = dogfood - pet_array.length * 2; // Subtracting dogfood based on amount of dogs human has 
			
			int i;
			for(i=0; i<size; i++){
				pet_array[i].hunger = pet_array[i].hunger + 15; // increasing hunger dog attribute
				pet_array[i].fun = pet_array[i].fun + 5; // increasing fun dog attribute
				
			}
			
			System.out.println("The dogs are so full their hunger increased.");
			
		}// ends if
		
		else { // If user has not food left
			System.out.println(human_name + " does not have enought dogfood. Maybe " + human_name + " should buy more food.");
		}
	}
	
	public void bathes () { // Method to bathe the dogs
		System.out.println(human_name + " gets the hose out and is ready to wash the dogs.");
		int i;
		for(i=0; i<size; i++){
			pet_array[i].cleanliness = pet_array[i].cleanliness + 15; // Increasing dog clean attribute
			pet_array[i].fun = pet_array[i].fun - 10; // decreasign dog fun attribute
		}	
		
		System.out.println("The dogs cleanliness is increased but they don't seem to be having fun.");
		
	}
	
	
	
	public void pass_the_time (){ // method to pass the time when the day ends 
		System.out.println("The day is to an end and " + human_name + " is tired.");
		System.out.println("The dogs are going to sleep.");
		System.out.println("When they wake up, " + human_name + " knows they will be hungry and want to play.");
		
		money = money + 10; // giving user more money
		
		int i;
		for(i=0; i<size; i++){
			pet_array[i].hunger = pet_array[i].hunger - 15; // decreasing dog hunger attribute
			pet_array[i].fun = pet_array[i].fun - 10; // decreasing fun dog attribute
		}			
		
		
	}
	
	public void buys_food () { // Method to buy food
		
		if(money > 0) { //If they have money
			System.out.println(human_name + " goes to the store and buys dogfood.");
			System.out.println(human_name + " sees that it costs $25 for 10 cups of dogfood.");
			System.out.println(human_name + " buys the dogfood anyway because he has to.");
			
			money = money - 25; // Subtracting money used to buy food
		
			dogfood = dogfood + 10; // Giving user more dogfood
		
				
		
		}// ends if 	
		
		else { // if user has no money
			
			System.out.println(human_name + " has no money to buy dogfood. Maybe " + human_name + " should work.");
		}
		
		
	}
	
	
	public void works () { // method i added so user can get more money if needed
		
		System.out.println(human_name + " decides to go to work.");
		System.out.println("The dogs get sad and wait for him on the couch, their fun is decreased.");
			
		money = money + 20; // adding to money
		
		int i;
		for(i=0; i<size; i++){
			pet_array[i].fun = pet_array[i].fun - 20; // subtracting fun from dog attribute
		
		}			
		
		System.out.println(human_name + " makes about $20 for the day.");
	}
	
	
	//toString method below, just named it different to make sense to me
	public void display_humans () { // Displaying Human attributes
		
		System.out.println(human_name + " the human.\n");
		System.out.println(human_name + " currently has $" + money);
		System.out.println(human_name + " only has " + dogfood + " cups of dogfood.");
		
		
		int i;
		
		for(i=0; i<size; i++) {
			pet_array[i].display_dog(); // Displaying the dogs each human owns
			
		}
		//System.out.println();
		
	}
	
	

}
