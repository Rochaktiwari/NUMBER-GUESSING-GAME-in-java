//NUMBER GUESSING GAME

import java.util.Random;
import java.util.Scanner;

public class task2 
{
        public static void main(String[] args) 
        {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int total_Round = 3;  
                int max_Attempt = 5;
                int total_Score = 0;

                System.out.println("*********************************************");
                System.out.println("!! Welcome To The Number Guessing Game !!");
                System.out.println("*********************************************");
                System.out.println("Here are the Rules of the Game");
                System.out.println("1-You will play " + total_Round + " rounds. In each round, you have " + max_Attempt + " attempts.");
                System.out.println("2-You total score will be calculated according to the total attempts left in all 3 rounds.");
                System.out.println("3-Guess a number between 1 and 100.");
                System.out.println();

                for (int round = 1; round <= total_Round; round++) 
                {
                        int random_Number = random.nextInt(100) + 1;
                        int Attempts = 0;
                        System.out.println("***** Round " + round + " *****");
                        while (Attempts < max_Attempt) 
                        {
                                System.out.print("Enter your guess Number : ");
                                int guess = scanner.nextInt();
                                if (guess == random_Number) 
                                {
                                        int round_Score = max_Attempt - Attempts;
                                        total_Score += round_Score;
                                        System.out.println("!! Congratulations !! ");
                                        System.out.println("You guessed the right number: " + random_Number);
                                        System.out.println("Round Score: " + round_Score);
                                        break;
                                } 
                                else if (guess < random_Number) 
                                {
                                        System.out.println("Your guess is smaller than the actual number.");
                                } 
                                else 
                                {
                                        System.out.println("Your guess is larger than the actual number.");
                                }
                                Attempts++;
                                int remaining_Attempts = max_Attempt - Attempts;
                                System.out.println("Attempts left: " + remaining_Attempts);
                                if (remaining_Attempts == 0) 
                                {
                                        System.out.println(" ");
                                        System.out.println("Round " + round + " Over..!");
                                        System.out.println("Sorry, you have run out of attempts!");
                                        System.out.println("The actual number was: " + random_Number);
                                }
                                System.out.println(" ");
                        }
                }
                System.out.println("***** Game Over *****");
                System.out.println("Total Score: " + total_Score);

                scanner.close();
        }
}
