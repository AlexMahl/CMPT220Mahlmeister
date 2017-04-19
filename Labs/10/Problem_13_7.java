
public class Problem_13_7 {

  public static void main(String[] args) {
    //Create five squares
    GeometricObject3[] squareList = {
        new Square(2.3),
        new Square(15),
        new Square(10),
        new Square(8),
        new Square(4.9),
    };
    
    //Display information 
    for (int i = 0; i < squareList.length; i++){
      System.out.println("Square Number: " + (i + 1));
      System.out.println("Area of Square: " + squareList[i].getArea());
      System.out.println("HowToColor: " + ((Square)squareList[i]).howToColor());
      System.out.println(" ");
      }
    }

  }


