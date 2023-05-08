/*
You have to make a program that will be an interactive guessing game. It will ask the
user to guess a number between 1 and 99. The program will tell the user if their input is
too high or too low. The game ends when the user finds out the secret number or types
exit. 
*/

package projects01;

import java.util.*;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		int secret_number = (int)(Math.random()*100);
		int n_guesses = 0;
		int guess;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hello, What's your name? \n>> ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + ". Welcome to the hardest game you've ever played.");
	
		while(true) {
			
			System.out.print("Guess a number between 1 and 99 (or type 'exit' to quit):  \n>> ");
			String guessString = scanner.nextLine();
			
			if (guessString.equals("exit")) {
				System.out.println("See you next time!");
				break;
			}
			
			
			try {
				guess = Integer.parseInt(guessString);
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number between 1 and 99.");
					continue;
				}

			if (guess < 1 || guess > 99) {
				System.out.println("Invalid input. Please enter a number between 1 and 99.\"");
			}
			
			n_guesses++;
			
			if (guess == secret_number) {
				if (n_guesses == 1) {
					System.out.println("Congratulations, you've got it!");
				} else {
					System.out.println("Congratulations, you guesses the number in " + n_guesses + " guesses!");			
			}
			
			break;		
			
		} else  if (guess < secret_number) {
			System.out.println("Too low.");	
			
		} else if (guess > secret_number) {
			System.out.println("Too high.");			
		}
	}
	
	scanner.close();

	}
}