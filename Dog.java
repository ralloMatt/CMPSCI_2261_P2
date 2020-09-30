import java.util.Random; // So I can use random method
public class Dog { // Object Dog
	
	String name;
	int hunger;
	int fun;
	int cleanliness;
	private int loyalty = Math.max(fun, 100-hunger);
	String owner;

	public Dog(String dog_name, String human_name) { //Dog constructor
		 
		Random rand = new Random(); // Random used to determine hunger fun and cleanliness
		owner = human_name; // Keep track of whose dog is whose
		hunger = rand.nextInt(101); // Giving random value from 0-100
		fun = rand.nextInt(101);
		cleanliness = rand.nextInt(101);
		
		
		name = dog_name; 
		System.out.println(dog_name + " is now owned by " + human_name); // Displaying dog and owner
		
	}
	
	//toString method below, just named it different to make sense to me
	
	public void display_dog() { //Displaying Attributes of dogs 
		
		System.out.println("     " + name + " is owned by " + owner);
		System.out.println("          " + name + " has a hunger of " + hunger);
		System.out.println("          " + name + "'s fun is " + fun);
		System.out.println("          " + name + "'s cleanliness is " + cleanliness);
		
	}
	
	

}
