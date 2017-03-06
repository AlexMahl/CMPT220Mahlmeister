
public class TestRectanlge {

  public static void main(String[] args) {
    
    //Create Rectangle 1 with a width of 4 and a height of 40
    Rectangle rectangle1 = new Rectangle(4, 40);
    //Create Rectangle 2 with a width of 3.5 and a height of 35.9
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    
    //Display the width, height, area, perimeter of Rectangle 1
    System.out.println("Results of Rectangle 1: " );
    System.out.println("Width: " + rectangle1.getWidth());
    System.out.println("Height: " + rectangle1.getHeight());
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter());
    System.out.println("    ");
    //Display the width, height, area, perimeter of Rectangle 2
    System.out.println("Results of Rectangle 2: " );
    System.out.println("Width: " + rectangle2.getWidth());
    System.out.println("Height: " + rectangle2.getHeight());
    System.out.println("Area: " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter());
  }

}

