import java.util.Scanner;
public class HelloName
	{
	public static void main(String [] args)
		{
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userStringInput.nextLine();
		System.out.println("Hello, " + name + "!");
		System.out.println("Whats your favorite color?");
		String favoriteColor = userStringInput.nextLine();
		System.out.println("Oh. I love the color " + favoriteColor + "!");
		
		if(name.equals("Tika")
					{
					System.out.println("Your very pretty. Have a cupcake!");	
					}
				else if(name.equals("fred")
					{
					System.out.println("You could have a better name");
					}
				else
					{
					System.out.println("I dont like your name...");
					}
		
		//age 
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("How old are you?");
		int age =  userIntInput.nextInt();
		if(age == 16)
			{
			System.out.println("Ah, so you can drive");
			}
		else if(age == 18)
			{
			System.out.println("You are an adult");	
			}
			
			
		
		}

	}
