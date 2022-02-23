// Program Name: DeckOfCards.java
/* Description: 19.4 Program It: DeckOfCards */
// Programmer:
// Date: 2/4/2021

public class DeckOfCards
{
  public static void main(String[] args)
  {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks =
      {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
       "King"};
    String endString = "";
    int sumValue = 0;

    // Initialize the cards
    for (int i = 0; i < deck.length; i++)
    {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++)
    {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Ask the user how many cards should be displayed
    System.out
      .println("\"The deck is shuffled. How many cards do you want?\" ");
    java.util.Scanner input = new java.util.Scanner(System.in);
    int numCards = input.nextInt();

    System.out.println("The player wants " + numCards + " cards:");

    // Display the cards
    for (int i = 0; i < numCards; i++)
    {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out
        .println("Card number " + deck[i] + ": " + rank + " of " + suit);

      // Add to sumValue for each card
      if (deck[i] % 13 >= 10)
      {
        // For Jacks, Queens, and Kings
        sumValue += 10;
      }
      else
      {
        // For all other cards
        sumValue += (deck[i] % 13) + 1;
      }
    }

    if (sumValue > 21)
    {
      endString = ", which is over 21.";
    }
    else if (sumValue == 21)
    {
      endString = ", right at 21!";
    }
    else
    {
      endString = ", not quite 21.";
    }

    System.out.println("The numerical value of those cards together is "
      + sumValue + endString);

  }
}
