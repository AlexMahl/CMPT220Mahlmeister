import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem_12_13 {

  public static void main(String[] args) throws FileNotFoundException {
    //Check command line parameters
    if (args.length != 1) {
      System.out.println("Usage: Java Problem_12_13 <input file>");
      System.exit(1);
    }
    
    //Creates file 
    File file = new File(args[0]);
  
    //Create counters 
    int characterCount = 0;
    int wordCount = 0;
    int lineCount = 0;
    
    //Scanner 
    Scanner scanner = new Scanner(file);
    
   //Checks words
   while(scanner.hasNextLine()){
     //Read the lines from the file 
     String line = scanner.nextLine();
     
     //Add to lineCount 
     lineCount++;
     
     //Finds the number of words
     String str[] = line.split(" ");
     for (int i = 0; i < str.length; i++){
       if (str [i].length() > 0){
         wordCount++;
       }
     }
     //Add to character count 
     characterCount += (line.length());
   }
    
    
    //Displays results
    System.out.println("The file " + file.getName() + "contains the following attributes: \n");
    System.out.println("Characters: " + characterCount);
    System.out.println("Words: " + wordCount);
    System.out.println("Lines: " + lineCount);
  }

}
