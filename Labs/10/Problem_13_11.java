
public class Problem_13_11 {

  public static void main(String[] args) throws CloneNotSupportedException {
    //Create an Octagon 
    Octagon ocatgon1 = new Octagon(5.0);
    
    //Display the results 
    System.out.println("Octagon 1: ");
    System.out.println("\nPerimeter = " + ocatgon1.getPerimeter());
    System.out.println("Area = " + ocatgon1.getArea());
    System.out.println("");
    
    //Clone the Octagon
    Octagon octagon2 = (Octagon) ocatgon1.clone();
    
    //Display the Comparison 
    System.out.println("\nOctagon1 when comapred to Octagon2: " + ocatgon1.compareTo(octagon2));

  }

}
