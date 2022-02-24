
// Program Name: GuessNumber
/* Description: The program asks the user to guess the predetermined random
 * number. The number of attempts is recorded. */
// Programmer:
// Date: 12/11/2020

import java.util.Scanner;

public class GuessNumber
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    // Intro
    System.out.println("Please enter a username: ");
    String username = input.next();

    int numOfAttempts = 0;

    // Random Numberness begins
    int number = (int) (Math.random() * 101);

    System.out.println("Guess a magic number between 0 and 100");

    int guess = -1;

    while (guess != number)
    {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      numOfAttempts++;

      if (guess == number)
      {

        System.out.println("Yes, the number is " + number + "\nIt took "
          + username + " " + numOfAttempts + " tries.");

        if (numOfAttempts <= 3)
          System.out.println(username + " is an Epic Gamer!");
        else if ((numOfAttempts >= 4) && (numOfAttempts <= 7))
          System.out.println(username + " didn't do too bad.");
        else if (numOfAttempts > 7)
          System.out.println(username + " is not efficient");

      }
      else if (guess > number)
      {
        System.out.println("Your guess is too high");
      }
      else
      {
        System.out.println("Your guess is too low");
      }
    }
  }

}