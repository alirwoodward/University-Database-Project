/** AssociateProf.java
*
* This is a class that extends the Faculty abstract class and represents an affiliate who is an Associate Professor
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/** The AssociateProf class is used to represent an Associate Professor
 * The AssociateProf class consists of basic methods for accessing and returning associate professor information
 */
public class AssociateProf extends Faculty{
  /**The number of years since tenure. */
  protected int m_yearsSinceTenure;

  /**The default constructor - sets the years since tenure to 0
   */
  public AssociateProf(){
    super();
    m_yearsSinceTenure = 0;
  }

  /**The overloaded constructor - creates associate professor by taking in all of the information needed and using
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
   * @param yearsSinceTenure int representing years since tenure
	 */
  public AssociateProf(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String department, int yearlySalary, int numOfPapers, int yearsSinceTenure){
    super(name, age, address, phoneNumber, id, yearToChapman, department, yearlySalary, numOfPapers);
    m_yearsSinceTenure = yearsSinceTenure;
  }

  /** Returns the years since tenure.
  * @return An int representing the years since tenure
  */
  public int getYearsSinceTenure(){
    return m_yearsSinceTenure;
  }

  /** Returns a string representation of the associate professor with each variable on a new line.
   * @return A string representation of the AssociateProf object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nYears since tenure: " + getYearsSinceTenure();
    return a;
  }

  /** Returns a string representation of the associate professor with each variable in alphabetical order.
   * @return A string representation of the AssociateProf object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Associate Professor";
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

  /** Displays the alphabetically sorted information of an Associate Professor.
  */
  public void print(){
    System.out.println(sorter());
  }
}
