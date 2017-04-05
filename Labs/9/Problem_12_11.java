import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_12_11 {

  public static void main(String[] args) {
    //Check command line parameters
    if (args.length != 2) {
      System.out.println("Usage: java Chapter_12_11 John FileName.txt");
      System.exit(1);
    }
    //Checks to see if file exists 
    File sourceFile = new File(args[1]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + args[1] + " does not exist.");
      System.out.println(2);
    }
    
    //Creates String 
    String s1 = "";
    try{
      //Scanner
      Scanner scanner = new Scanner(sourceFile);
      while (scanner.hasNext()){
        s1 += scanner.nextLine();
        }
        //Catch Argument
      } catch(FileNotFoundException e){
        e.printStackTrace();
      }
        //Replaces the desired word with a space
        s1 = s1.replaceAll(args[0], " ");
      try {
        //Writes new file 
        PrintWriter output = new PrintWriter(sourceFile);
        //Prints new string 
        System.out.println(s1);
        //Write new string  
        output.write(s1);
        //Closes output writer 
        output.close();
        //Catch Argument  
      }catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    //Outputs done when system is complete 
    System.out.println("Done");
  }

}
