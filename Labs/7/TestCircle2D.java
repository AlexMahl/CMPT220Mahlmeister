
public class TestCircle2D {
  //Main method
  public static void main(String[] args) {
    //Creates circle 
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    //Displays respective information about the circle 
    System.out.println("Cricle 1 area: " + c1.getArea());
    System.out.println("Circle 1 perimeter: " + " " + c1.getPerimeter());
    System.out.println("Does Circle 1 contains the points (3,3)?" + c1.contains(3,3));
    System.out.println("Does circle 1 contain the circle centered at (4,5) and a radius of 10.5?" +  " " + c1.contains(new Circle2D(4, 5, 10.5)));
    System.out.println("Does circle 1 overlap the circle centered at (3,5) and a radius of 2.3?" +  " " + c1.overlaps(new Circle2D(4, 5, 2.3)));
  }
}

