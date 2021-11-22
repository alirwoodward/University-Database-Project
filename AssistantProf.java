/** AssistantProf.java
*
* This is a class that extends the Faculty abstract class and represents an affiliate who is an Assistant Professor
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/** The AssistantProf class is used to represent an Assistant Professor
 * The AssistantProf class consists of basic methods for accessing and returning assistant professor information
 */
public class AssistantProf extends Faculty{
  /**The number of years until tenure. */
  protected int m_yearsTilTenure;

  /**The default constructor - sets the years until tenure to 0
	 */
  public AssistantProf(){
    super();
    m_yearsTilTenure = 0;
  }

  /**The overloaded constructor - creates assistant professor by taking in all of the information needed and using
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
   * @param yearsTilTenure int representing years until tenure
	 */
  public AssistantProf(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String department, int yearlySalary, int numOfPapers, int yearsTilTenure){
    super(name, age, address, phoneNumber, id, yearToChapman, department, yearlySalary, numOfPapers);
    m_yearsTilTenure = yearsTilTenure;
  }

  /** Returns the years until tenure.
  * @return An int representing the years until tenure
  */
  public int getYearsTilTenure(){
    return m_yearsTilTenure;
  }

  /** Returns a string representation of the assistant professor with each variable on a new line.
   * @return A string representation of the AssistantProf object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nYears until tenure: " + getYearsTilTenure();
    return a;
  }

  /** Returns a string representation of the assistant professor with each variable in alphabetical order.
   * @return A string representation of the AssistantProf object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Assistant Professor";
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

  /** Displays the alphabetically sorted information of an Assistant Professor.
  */
  public void print(){
    System.out.println(sorter());
  }
}
