
public class TestCourse {
  //Main method 
  public static void main(String[] args) {
    //Create a course 
    Course course = new Course("Software Development I");
    System.out.println("The following course has been created: " + course.getCourseName());
    
    //Add Students 
    course.addStudent("Peter");
    course.addStudent("Kim");
    course.addStudent("Anne");
    
    //Output Statement
    System.out.println("\nThe students that are currently enrolled in " + course.getCourseName() + " are: ");
    //Determines who is in the class initially 
    for (int i = 0; i < course.getNumberOfStudents(); i++){
      System.out.println(course.getStudents().get(i));
    }
    //Drops student 
    course.dropStudent("Peter");
    System.out.println();
    
    //Output Statement
    System.out.println("\nThe students that are currently enrolled in " + course.getCourseName() + " are: ");
    //Determines who is currently in the class after the drop 
    for (int i = 0; i < course.getNumberOfStudents(); i++) { 
      System.out.println(course.getStudents().get(i));
    }
  }
}
