import java.util.ArrayList;

public class Course {
  //Create students 
  private String courseName;
  private ArrayList<String> students = new ArrayList<String>();
  private int numberOfStudents; 
  
  //Add a course
  public Course(String courseName){
    this.courseName = courseName;
  }
  
  
  public void addStudent(String student) {
  //Automatically increase the size of the array 
    students.add(student);
    numberOfStudents++;
  }
  //Returns students 
  public ArrayList<String> getStudents() {
    return students;
  }
  //returns numberOfStudetns 
  public int getNumberOfStudents() {
    return students.size();
  }
  //returns courseName
  public String getCourseName() {
    return courseName;
  }
  //Remove student from course 
  public void dropStudent(String student){
    students.remove(student);
  }
  //Clears 
  public void clear (){
    students = new ArrayList<String>();
    numberOfStudents = 0;
  }
}
