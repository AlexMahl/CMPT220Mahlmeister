//Class
public class Problem_8_10 {
  //Main Method 
  public static void main(String[] args) {
    //Create a 4-by-4 matrix 
    int[][] matrixGraph = new int[4][4];
    //Generates the 0s and 1s and finds the largest row index
   int largestRow = 0;
   int largest = -1;
    for (int i = 0; i < matrixGraph.length; i++) {
      int rowCount = 0;
      for (int z = 0; z < matrixGraph[i].length; z++) {
        matrixGraph[i][z] = (int)(Math.random() * 2);
        rowCount += matrixGraph[i][z];
      }
      if (rowCount > largest) {
        largestRow = i;
        largest = rowCount;
      }
    }
    //finds largest column index 
    int largestColumn = 0;
    largest = -1;
    for (int z = 0; z < matrixGraph[0].length; z++) {
      int columnCount = 0;
      for (int i = 0; i < matrixGraph.length; i++) {
        columnCount =+ matrixGraph[i][z];
      }
      if (columnCount > largest) {
        largest = columnCount;
        largestColumn = z;
      }
    }
    //Displays matrix output 
    for (int i = 0; i < matrixGraph.length; i++) {
      for (int z = 0; z <  matrixGraph[i].length; z++) {
        System.out.printf("%d", matrixGraph[i][z]);
      }
      System.out.printf("\n");
    }
    //Output 
    System.out.println("The largest row index: " + largestRow);
    System.out.println("The largest column index: " + largestColumn);
    
  }
}
     
    

