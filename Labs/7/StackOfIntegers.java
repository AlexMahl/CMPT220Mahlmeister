
public class StackOfIntegers {
  //Data field 
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16; 
  
  //Makes stack with capacity of 16 
  public StackOfIntegers() {
    this (DEFAULT_CAPACITY);
  }

  public StackOfIntegers(int capacity) {
    elements = new int[capacity];
  }
  
  //Push new integer to top 
  public void push(int value) {
    if (size >= elements.length) {
      int [] temp = new int [elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    
    elements[size++] = value;
  }
  
  //Return and remove top number of stack 
  public int pop() {
    return elements[--size];
  }
  
  //Return the top number of stack 
  public int peek() { 
    return elements[size - 1];
  }
  
  //Test if the stack is empty 
  public boolean empty() {
    return size == 0; 
  }
  
  //Return number of elements within stack 
  public int getSize() {
    return size;
  }
  
}
