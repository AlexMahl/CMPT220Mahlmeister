
public class Problem_13_5 {

  public static void main(String[] args) {
     
    //Create two circles 
    Circle circle1 = new Circle(10,"blue", true);
    Circle circle2 = new Circle(20, "green", false);
    
    //Display Circles 
    System.out.print("Circle 1 attributes: " + circle1);
    System.out.println(" ");
    System.out.print("\nCircle 2 attributes: " + circle2);
    System.out.println(" ");
    System.out.println("\nThe larger circle is: ");
    //Compare the two circles 
    System.out.println(GeometricObject2.max(circle1, circle2));
    
    //Create two rectangles 
    Rectangle rectangle1 = new Rectangle(3, 6, "Orange", true);
    Rectangle rectangle2 = new Rectangle(4, 12, "red", true);
    
    //Display the rectangles 
    System.out.print("\nRectangle 1 attributes: " + rectangle1);
    System.out.println(" ");
    System.out.print("\nRectangle 2 attributes: " + rectangle2);
    System.out.println(" ");
    System.out.println("\nThe larger rectangle is: ");
    //Compare the two rectangles 
    System.out.println(GeometricObject2.max(rectangle1, rectangle2));
    

  }

}
