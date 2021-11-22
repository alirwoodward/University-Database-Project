/** Undergraduate.java
*
* This is a class that extends the Studnet abstract class and represents an affiliate who is an Undergraduate Student
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.Collections;
import java.util.ArrayList;

/** The UndergraduateStudent class is used to represent an Undergraduate Student
 * The UndergraduateStudent class consists of basic methods for accessing undergraduate student information
 */
public class UndergradStudent extends Student{
  /**The number of courses taken. */
  protected int m_numCourses;
  /**The scholarship amount. */
  protected int m_scholarship;

  /**The default constructor - sets the number of courses taken and scholarship amount to 0.
   */
  public UndergradStudent(){
    super();
    m_numCourses = 0;
    m_scholarship = 0;
  }

  /**The overloaded constructor - creates an undergraduate student by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the higher classes
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param major String representing major
   * @param minor String representing minor
   * @param classStanding String representing class standing
   * @param courses int representing number of courses taken by the undergrad student
   * @param scholarship int representing scholarship amount
	 */
  public UndergradStudent(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String major, String minor, String classStanding, int courses, int scholarship){
    super(name, age, address, phoneNumber, id, yearToChapman, major, minor, classStanding);
    m_numCourses = courses;
    m_scholarship = scholarship;
  }

  /** Returns the number of courses taken.
  * @return A String representing the number of courses taken
  */
  public int getCourses(){
    return m_numCourses;
  }
  /** Returns the scholarship amount.
  * @return A String representing the scholarship amount.
  */
  public int getScholarship(){
    return m_scholarship;
  }

  /** Returns a string representation of the undergraduate student with each variable on a new line.
   * @return A string representation of the UndergraduateStudent object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nCourses taken: " + getCourses();
    a += "\nScholarship: " + getScholarship();
    return a;
  }

  /** Returns a string representation of the undergraduate student with each variable in alphabetical order.
   * @return A string representation of the UndergraduateStudent object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Undergraduate Student";
    String allInfo = toString();
    String[] split = allInfo.split("\\n");
    ArrayList<String> splitInfo = new ArrayList<String>();
    for(String i : split){
      splitInfo.add(i);
    }
    Collections.sort(splitInfo);
    for(String s : splitInfo){
      sortedString += ", " + s;
    }
    return sortedString;
  }

  /** Displays the alphabetically sorted information of an Undergraduate Student.
  */
  public void print(){
    System.out.println(sorter());
  }
}
