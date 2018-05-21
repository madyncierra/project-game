package gameone;
import java.util.Scanner;

public class MethodMain {
	static Scanner keyboard;
	private static String Name, Fight, Death ;

	
	public static void introduction(){
		System.out.println("***You find yourself on an odd beach.***");
		System.out.println("***A wave crashes and splashes onto you***");
		System.out.println("Where am I?");
		System.out.println(" ");
		System.out.println("***Your hands look weird...***");
		System.out.println("Who am I?");
		System.out.println(" ");
		System.out.println("***You hear someone approach you***");
		System.out.println("'Hey weirdo! What's your name?'");
		Name = keyboard.next();
		System.out.println("'HAHA! " + Name + ", what a great name.'");
		System.out.println("'I'm Stella! Nice to meet you.'");
		System.out.println(" ");
		System.out.println("'Oh, how could I forget!'");
		System.out.println("'Welcome to SCARY ISLAND, " + Name +"!!'");
		System.out.println(" ");
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
	
		introduction();
		Character player = new Character();
		player.character();
	} // main() 
} //Class
 

