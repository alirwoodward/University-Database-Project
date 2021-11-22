/** FullProf.java
*
* This is a class that extends the Faculty abstract class and represents an affiliate who is an Full Professor
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/** The FullProf class is used to represent a Full Time Professor
 * The FullProf class consists of basic methods for accessing and returning full time professor information
 */
public class FullProf extends Faculty{
  /**The number of years until retirement. */
  protected int m_yearsTilRetire;

  /**The default constructor - sets the years until retirement to 0
	 */
  public FullProf(){
    super();
    m_yearsTilRetire = 0;
  }

  /**The overloaded constructor - creates a full time professor by taking in all of the information needed and using
   * the super() method to set the variables declared in higher classes
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param department String representing department
   * @param yearlySalary int representing yearly salary
   * @param numOfPapers int representing number of papers written
   * @param yearsTilRetire int representing years until retirement
	 */
  public FullProf(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String department, int yearlySalary, int numOfPapers, int yearsTilRetire){
    super(name, age, address, phoneNumber, id, yearToChapman, department, yearlySalary, numOfPapers);
    m_yearsTilRetire = yearsTilRetire;
  }

  /** Returns the years until retirement.
  * @return An int representing the years until retirement
  */
  public int getYearsTilRetire(){
    return m_yearsTilRetire;
  }

  /** Returns a string representation of a full time professor with each variable on a new line.
   * @return A string representation of the FullProf object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nYears until retirement: " + getYearsTilRetire();
    return a;
  }

  /** Returns a string representation of a full time professor with each variable in alphabetical order.
   * @return A string representation of the FullProf object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Full Time Professor";
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

  /** Displays the alphabetically sorted information of a Full Time Professor.
  */
  public void print(){
    System.out.println(sorter());
  }
}
