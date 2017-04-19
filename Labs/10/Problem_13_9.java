
public class Problem_13_9 {

  public static void main(String[] args) {
    //Create two circles 
    Circle1 circle1 = new Circle1(10,"blue", true);
    Circle1 circle2 = new Circle1(10, "green", false);
    
    //Display Circles 
    System.out.print("Circle 1 radius: " + circle1.getRadius());
    System.out.println(" ");
    System.out.print("\nCircle 2 radius: " + circle2.getRadius());
    System.out.println(" ");
    
    //Display if circles are equal 
    System.out.println("\nIt is " + (circle1.equals(circle2) ? true : false) + " that circle1 eauals that of circle2."); 

  }

}
