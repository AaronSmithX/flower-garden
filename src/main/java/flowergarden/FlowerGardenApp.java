package flowergarden;

import java.util.Scanner;

public class FlowerGardenApp {

	public static void main(String[] args) {
		
		// Initialize the Scanner to enable user input
		Scanner input = new Scanner(System.in);
		
		// Greet the player by name
		System.out.println("What is your name?");
		String player = input.nextLine();
		System.out.println("Welcome to your new garden, " + player + "!\n");
		
		// Create a new garden with 3 flowers in it
		Garden garden = new Garden(3);
		
		// The *Game Loop* begins!
		String userInput = "";
		while (!userInput.equals("4")) {
			
			// Display the status of the garden flowers
			System.out.println("Let's see how the flowers are doing...");
			System.out.println("Flower\t|Hydration\t|Soil Health");
			int flowerIndex = 1;
			for (Flower flower : garden.getFlowers()) {
				System.out.println(flowerIndex + "\t|" + flower.getHydration() + "\t\t|" + flower.getSoilHealth());
				flowerIndex++;
			}
			System.out.println();
			
			// Ask the user which action they want to take
			System.out.println("What would you like to do?");
			System.out.println("1. Water all of the flowers");
			System.out.println("2. Fertilize a flower");
			System.out.println("3. Smell the flowers");
			System.out.println("4. Leave the garden");
			System.out.print("Your choice: ");
			userInput = input.nextLine();
			
			// Take action based on user choice
			if (userInput.equals("1")) {
				
				// Water all of the flowers
				System.out.println("You water all of the flowers.");
				garden.waterAllFlowers();
			}
			else if (userInput.equals("2")) {
				
				// Allow the user to choose a flower to fertilize
				System.out.println("Which flower would you like to fertilize?");
				int flowerNum= 1;
				for (Flower flower : garden.getFlowers()) {
					System.out.println(flowerNum + ". Flower #" + flowerNum);
					flowerNum++;
				}
				System.out.print("Your choice: ");
				int userInputNum = input.nextInt();
				input.nextLine(); // clear extra ENTER from console
				
				// Fertilize the selected flower
				System.out.println("You fertilize Flower #" + userInputNum);
				garden.getFlowers().get(userInputNum-1).fertilize();
			}
			else if (userInput.equals("3")) {
				
				// The user "smells the flowers", which does nothing
				System.out.println("You smell the flowers...");
				System.out.println("They're delightful!");
			}
			
			// Each round, call the tick method of the garden to represent the passage of time
			garden.tick();
		}
		
		// If the user enters 4, they exit the loop and quit the game
		System.out.println("Thanks for playing!");

	}

}
