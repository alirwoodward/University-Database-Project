/** FullTimeStaff.java
*
* This is a class that extends the Staff abstract class and represents an affiliate who is an full time staff member
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/** The FullTimeStaff class is used to represent a full time staff member
 * The FullTimeStaff class consists of basic methods for accessing full time staff information
 */
public class FullTimeStaff extends Staff{
  /**The yearly salary. */
  protected int m_yearlySalary;

  /**The default constructor - sets the yearly salary to 0.
	 */
  public FullTimeStaff(){
    super();
    m_yearlySalary = 0;
  }

  /**The overloaded constructor - creates a full time staff member by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the higher classes
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param title String representing staff title
   * @param building String representing staff building
   * @param yearlySalary int representing hourly salary
	 */
  public FullTimeStaff(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String title, String building, int yearlySalary){
    super(name, age, address, phoneNumber, id, yearToChapman, title, building);
    m_yearlySalary = yearlySalary;
  }

  /** Returns the staff member's yearly salary.
  * @return A String representing the yearly salary of the staff member
  */
  public int getYearlySalary(){
    return m_yearlySalary;
  }

  /** Returns a string representation of the full time staff member with each variable on a new line.
   * @return A string representation of the FullTimeStaff object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nYearly salary: " + getYearlySalary();
    return a;
  }

  /** Returns a string representation of the full time staff member with each variable in alphabetical order.
   * @return A string representation of the FullTimeStaff object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Full Time Staff";
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

  /** Displays the alphabetically sorted information of a full time staff member.
  */
  public void print(){
    System.out.println(sorter());
  }
}
