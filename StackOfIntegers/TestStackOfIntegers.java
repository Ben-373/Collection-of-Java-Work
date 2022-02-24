// Program Name: TestStackOfIntegers.java
/* Description: 22.7 Program It: Stacks of Integers */
// Programmer: 
// Date: 3/2/2021

public class TestStackOfIntegers
{
  public static void main(String[] args)
  {
    java.util.Scanner input = new java.util.Scanner(System.in);

    StackOfIntegers stack = new StackOfIntegers();

    for (int i = 0; i < 5; i++)
    {
      stack.push(input.nextInt());
    }

    while (!stack.empty())
    {
      System.out.print(stack.pop() + " ");
    }
  }
}
