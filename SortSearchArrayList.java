import java.util.ArrayList;
import java.util.Scanner;

// Program Name: SortSearchArrayList.java
/* Description: The program JU21VTest.java provides values for the parameters of
 * this program. This program returns values according to the values of those
 * parameters. */
// Programmer:
// Date: 3/8/2021
/**
 * Look at page 248, 251, and 393 for hints and code. You are to implement
 * iterative insertionSort and binarySearch algorithms.
 * 
 * @author Your firstname and lastname.
 *
 */
public class SortSearchArrayList
{

  // Add insertionSort and recursive binary search here. You can
  // find these in your EText.

  /**
   * Make no changes to the main method below:
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // you are not allowed to used Arrays.sort.
    ArrayList<String> myList = new ArrayList<>();
    myList.add("Hopper");
    myList.add("McNulty");
    myList.add("Lovelace");
    myList.add("Perlman");
    myList.add("Keller");
    myList.add("Clarke");
    myList.add("Granville");
    myList.add("Shaw");
    myList.add("Kare");
    myList.add("Spence");

    System.out.println("BEFORE SORT: " + myList);
    // This will be a compiler error until you declare the method.
    insertionSort(myList);
    System.out.println("AFTER SORT: " + myList);
    Scanner scanner = new Scanner(System.in);
    System.out
      .println("If the name doesn't exist in the list, -1 will be returned.");
    System.out.print("Type in a name to search for: ");
    String inputName = scanner.nextLine();
    // binarySearch will be a compiler error until you add the method.
    System.out.println(inputName + " is located at index "
      + binarySearch(myList, inputName));

  }

  public static void insertionSort(ArrayList<String> list)
  {
    for (int i = 1; i < list.size(); i++)
    {
      String currentElement = list.get(i);
      int k;
      for (k = i - 1; k >= 0 && list.get(k).compareTo(currentElement) > 0; k--)
      {
        list.set(k + 1, list.get(k));
      }

      // Insert the current element into list[k+1]
      list.set(k + 1, list.get(k));
    }
  }

  public static int binarySearch(ArrayList<String> list, String key)
  {
    int low = 0;
    int high = list.size() - 1;

    while (high >= low)
    {
      int mid = (low + high) / 2;
      if (key.compareTo(list.get(mid)) >= 0)
      {
        high = mid - 1;
      }
      else if (key == list.get(mid))
      {
        return mid;
      }
      else
      {
        low = mid + 1;
      }
    }
    return -1;
  }

}
