package gameone;
import java.util.Scanner;

public class MethodMain {
	static Scanner keyboard;
	static String Name, CharType, FoodPreference, Fight, Death ;

	
	public static void introduction(){
		System.out.println("***You open your eyes and find yourself on an odd beach.***");
		System.out.println("***A wave crashes onto the sand and splashes onto you***");
		System.out.println("Where am I?");
		System.out.println(" ");
		System.out.println("***You look down at your hands, they look weird...***");
		System.out.println("Who am I?");
		System.out.println(" ");
		System.out.println("***You hear someone approach you***");
		System.out.println("'Hey weirdo! What's your name?'");
		Name = keyboard.next();
		System.out.println("'HAHA! " + Name + ", that's great, what a great name.'");
		System.out.println("'I'm Stella! Nice to meet you, " + Name + ".'");
		System.out.println(" ");
		System.out.println("'Oh, how could I forget!'");
		System.out.println("'Welcome to SCARY ISLAND, " + Name +"!!'");
		System.out.println("Scary Island?");
		System.out.println(" ");
		System.out.println("'Hey, not to be rude or anything, but what are you?'");
		System.out.println("'It's harder to tell with newcomers.'");
		System.out.println(" ");
		System.out.println("...what?");
		System.out.println(" ");
		System.out.println("'Oh, you don't know. Well, here on Scary Island,");
		System.out.println("everyone is something scary!'");
		System.out.println("'So what are you, " + Name + "?'");
		System.out.println(" ");
		System.out.println("Choose 'alien', 'vampire', 'demon', or 'witch'.");
	}
	
	public static void main(String[] args){
		keyboard = new Scanner(System.in);
		// initialize your static variables here!
		
		introduction();
		CharType = keyboard.next();
		while(!CharType.equals( "alien" ) && !CharType.equals( "vampire" )&& !CharType.equals( "demon" )&&!CharType.equals( "witch" )){
			System.out.println("Choose 'alien', 'vampire', 'demon', or 'witch'.");
			CharType = keyboard.next();
		}
		
		if (CharType.equalsIgnoreCase("alien")){
			System.out.println(" ");
			System.out.println("'An alien? Dope!'");
			System.out.println("'What planet are you from? Haha you don't have to answer.'");
			System.out.println(" ");
			System.out.println("'Oh also, I have to ask...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			if(FoodPreference != "vegetarian" && FoodPreference != "carnivore"){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
				if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Oh, phew! Me too.'");
				}	
				if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Oh, so you're the evil type.'");
				}
			}
		}
		if (CharType.equalsIgnoreCase("vampire")){
			System.out.println(" ");
			System.out.println("'Oooo, I love when we get vampires!'");
			System.out.println("'Don't suck my blood! Hahaha.'");
			System.out.println(" ");
			System.out.println("'Well you might not suck blood at all...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			if(FoodPreference != "vegetarian" && FoodPreference != "carnivore"){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
				if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Just no garlic, right? Hahaha.'");
				}	
				if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'I guess that makes sense.'");
				}
			}
	}
		if (CharType.equalsIgnoreCase("demon")){
			System.out.println(" ");
			System.out.println("'From the underworld, right on!'");
			System.out.println("'Are you the bratty type? We get a lot of bratty demons.'");
			System.out.println(" ");
			System.out.println("'Well if you throw any fits, I have to ask...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			if(FoodPreference != "vegetarian" && FoodPreference != "carnivore"){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
				if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Oh, good! Me too.'");
				}	
				if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Oh, so you're the evil type.'");
				}
			}
		}
		if (CharType.equalsIgnoreCase("witch")){
			System.out.println(" ");
			System.out.println("'Aye voodoo magic!'");
			System.out.println("'Did you eat Hansel and Gretel? Haha just playing!'");
			System.out.println(" ");
			System.out.println("'Well maybe not...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			if(FoodPreference != "vegetarian" && FoodPreference != "carnivore"){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
				if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'No wonder you glow!'");
				}	
				if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Typical!'");
				}
			}
		}
		
	} // main() 
} //Class
 

