
public class Course {
  //Create students 
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents; 
  
  //Add a course
  public Course(String courseName){
    this.courseName = courseName;
  }
  
  
  public void addStudent(String student) {
  //Automatically increase the size of the array 
    if(numberOfStudents == students.length) {
      String[] temp = new String[students.length + 1];
      for (int i = 0; i < numberOfStudents; i ++) {
        temp[i] = students[i];
      }
      students = temp;
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  //Returns students 
  public String [] getStudents() {
    return students;
  }
  //returns numberOfStudetns 
  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  //returns courseName
  public String getCourseName() {
    return courseName;
  }
  
  //Remove student from course 
  public void dropStudent(String student){
    int dropIndex = -1;
    for(int i = 0; i < students.length; i++) {
      if (students[i].equals(student)){
        dropIndex = i;
        break;
      }
    }
    //index 
    if(dropIndex != -1){
      for(int i = dropIndex; i < numberOfStudents; i ++) {
        students[i] = students [i + 1];
      }
      numberOfStudents --;
    }
  }
  //Clears 
  public void clear (){
    students = new String[100];
    numberOfStudents = 0;
  }
}
