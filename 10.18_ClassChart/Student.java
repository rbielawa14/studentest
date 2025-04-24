import java.util.ArrayList;
/**
 * Test for 11.14 and 11.15.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    ArrayList<String> myList = new ArrayList<>();
    
    /**
     * Creates new student objects.
     */
    public Student(String name)
    {
        this.name = name;
    }

    /**
     * Overrides toString and returns student names for printing. 
     */
    @Override
    public String toString()
    {
        return name;
    }
    
    /**
     * Creates a new student and prints hashcode to the terminal. 
     */
    public static void newStudent() {
        Student st = new Student("Dylan");
        System.out.println(st);
    }
    
    /**
     * Prints a list of current students to the terminal from an array list. 
     */
    public static void studentList() {
        ArrayList<Student> myList = new ArrayList<>(); 
        myList.add(new Student("Mark"));
        myList.add(new Student("Helly"));
        
        for (Object st : myList) {
            System.out.println(st);
        }
    }
    
}
