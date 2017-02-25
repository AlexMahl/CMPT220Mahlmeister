//Class
public class Problem_8_7 {
  //Main Method 
  public static void main(String[] args) {
    //Array with coordinates 
    double[][] coordinates = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},{5.5, 4, -0.5}};
    //Initialize points 
    int p1 = 0, p2 = 1, p3 = 3; 
    //Initialize shortest distance 
    double shortestDistance = distance(coordinates[p1][0], coordinates[p1][1], coordinates[p1][2], coordinates[p2][0], coordinates[p2][p1], coordinates[p3][p2]);
    //Finds distance for every two points 
    for (int i = 0; i < coordinates.length; i++) {
      for (int j = i + 1; j < coordinates.length; j++) {
        double distance = distance(coordinates[i][0], coordinates[i][1], coordinates[i][2], coordinates[j][0], coordinates[j][1], coordinates[j][2]);
        
        if (shortestDistance > distance) {
          p1 = i;
          p2 = j;
          shortestDistance = distance;
        }
      }
    }
    //Display the output
    System.out.println("The closest two points are " + "(" + coordinates[p1][0] + ", " + coordinates[p1][1] + ") and (" +
        coordinates[p2][0] + ", " + coordinates[p2][1] + ")");
  }
    //Finds distance between two points 
    public static double distance (
        double x1, double y1, double z1, double x2, double y2, double z2) {
      return Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2); // JA: This formula is wrong
	  // JA: It should be  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
    
}
