package gameone;

import java.util.Scanner;

public class Character {
	static Scanner keyboard;
	private static String CharType, FoodPreference;
	
	public Character(){
		keyboard = new Scanner(System.in);
	}
	
	public void character(){
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
			while (!FoodPreference.equals("vegetarian") && !FoodPreference.equals("carnivore")){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
			}
			if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Oh, phew! Me too.'");
				}	
			else if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Oh, so you're the evil type.'");
				}
			}
	
		else if (CharType.equalsIgnoreCase("vampire")){
			System.out.println(" ");
			System.out.println("'Oooo, I love when we get vampires!'");
			System.out.println("'Don't suck my blood! Hahaha.'");
			System.out.println(" ");
			System.out.println("'Well you might not suck blood at all...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			while (!FoodPreference.equals("vegetarian") && !FoodPreference.equals("carnivore")){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
			}
			if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Just no garlic, right? Hahaha.'");
				}	
			else if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'I guess that makes sense.'");
				}
			}
		
		else if (CharType.equalsIgnoreCase("demon")){
			System.out.println(" ");
			System.out.println("'From the underworld, right on!'");
			System.out.println("'Are you the bratty type? We get a lot of bratty demons.'");
			System.out.println(" ");
			System.out.println("'Well if you throw any fits, I have to ask...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			while (!FoodPreference.equals("vegetarian") && !FoodPreference.equals("carnivore")){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
			}
			if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'Oh, good! Me too.'");
				}	
			else if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Oh, so you're the evil type.'");
				}
			}
		
		else if (CharType.equalsIgnoreCase("witch")){
			System.out.println(" ");
			System.out.println("'Aye voodoo magic!'");
			System.out.println("'Did you eat Hansel and Gretel? Haha just playing!'");
			System.out.println(" ");
			System.out.println("'Well maybe not...'");
			System.out.println("'Are you a vegetarian or carnivore?'");
			FoodPreference = keyboard.next();
			while (!FoodPreference.equals("vegetarian") && !FoodPreference.equals("carnivore")){
				System.out.println("'Are you a vegetarian or carnivore?'");
				FoodPreference = keyboard.next();
			}
			if (FoodPreference.equalsIgnoreCase("vegetarian")){
					System.out.println(" ");
					System.out.println("'No wonder you glow!'");
				}	
			else if (FoodPreference.equalsIgnoreCase("carnivore")){
					System.out.println(" ");
					System.out.println("'Typical!'");
				}
			}
	} // character()
} // end of class
