import java.util.ArrayList;

// Program Name: StackOfIntegers.java
/* Description: 22.7 Program It: Stacks of Integers */
// Programmer:
// Date: 3/2/2021

public class StackOfIntegers
{
  private ArrayList<Integer> elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;

  public StackOfIntegers()
  {
    this(DEFAULT_CAPACITY);
  }

  public StackOfIntegers(int capacity)
  {
    elements = new ArrayList<Integer>();

    for (int i = 0; i < capacity; i++)
    {
      elements.add(new Integer(0));
    }
    size = 1;
  }

  public void push(int value)
  {
    if (size >= elements.size())
    {

      ArrayList<Integer> temp = new ArrayList<Integer>();
      for (int i = 0; i < elements.size() * 2; i++)
      {
        temp.add(new Integer(0));
      }

      for (int i = 0; i < elements.size(); i++)
      {
        temp.set(i, elements.get(i));
      }

      elements = temp;

      elements.set(size - 1, new Integer(value));
      size++;
    }
  }

  public int pop()
  {
    size--;
    return elements.remove(size);
  }

  public int peek()
  {
    return elements.get(size - 1);
  }

  public boolean empty()
  {
    return size == 0;
  }

  public int getSize()
  {
    return size;
  }
}
