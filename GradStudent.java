/** GradStudent.java
*
* This is a class that extends the Student abstract class and represents an affiliate who is a Graduate Student
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;


/** The GradStudent class is used to represent a Graduate Student
 * The GradStudent class consists of basic methods for accessing graduate student information
 */
public class GradStudent extends Student{
  /**The number of papers written by the graduate student. */
  protected int m_numPapers;
  /**The student's thesis advisor. */
  protected String m_thesisAdvisor;

  /**The default constructor - sets the number of papers to 0 and the thesis advisor to null
	 */
  public GradStudent(){
    super();
    m_numPapers = 0;
    m_thesisAdvisor = null;
  }

  /**The overloaded constructor - creates a graduate student by taking in all of the information needed and using
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
   * @param numPapers int representing number of papers written by the grad student
   * @param thesisAdvisor String representing thesis advisor
	 */
  public GradStudent(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String major, String minor, String classStanding, int numPapers, String thesisAdvisor){
    super(name, age, address, phoneNumber, id, yearToChapman, major, minor, classStanding);
    m_numPapers = numPapers;
    m_thesisAdvisor = thesisAdvisor;
  }

  /** Returns the number of papers written.
  * @return A String representing the student's number of papers
  */
  public int getNumPapers(){
    return m_numPapers;
  }

  /** Returns the thesis advisor.
  * @return A String representing the student's thesis advisor
  */
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /** Returns a string representation of the graduate student with each variable on a new line.
   * @return A string representation of the GradStudent object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nPapers written: " + getNumPapers();
    a += "\nThesis advisor: " + getThesisAdvisor();
    return a;
  }

  /** Returns a string representation of the graduate student with each variable in alphabetical order.
   * @return A string representation of the GradStudent object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Graduate Student";
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

  /** Displays the alphabetically sorted information of a Graduate Student.
  */
  public void print(){
    System.out.println(sorter());
  }
}
