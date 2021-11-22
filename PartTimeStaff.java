/** PartTimeStaff.java
*
* This is a class that extends the Staff abstract class and represents an affiliate who is a part time staff member
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/** The PartTimeStaff class is used to represent a part time staff member
 * The PartTimeStaff class consists of basic methods for accessing part time staff information
 */
public class PartTimeStaff extends Staff{
  /**The hourly salary. */
  protected int m_hourlySalary;

  /**The default constructor - sets the hourly salary to 0.
	 */
  public PartTimeStaff(){
    super();
    m_hourlySalary = 0;
  }

  /**The overloaded constructor - creates a part time staff member by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the higher classes
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param title String representing staff title
   * @param building String representing staff building
   * @param hourlySalary int representing hourly salary
	 */
  public PartTimeStaff(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String title, String building, int hourlySalary){
    super(name, age, address, phoneNumber, id, yearToChapman, title, building);
    m_hourlySalary = hourlySalary;
  }

  /** Returns the staff member's hourly salary.
  * @return A String representing the hourly salary of the staff member
  */
  public int getHourlySalary(){
    return m_hourlySalary;
  }

  /** Returns a string representation of the part time staff member with each variable on a new line.
   * @return A string representation of the PartTimeStaff object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nHourly salary: " + getHourlySalary();
    return a;
  }

  /** Returns a string representation of the part time staff member with each variable in alphabetical order.
   * @return A string representation of the PartTimeStaff object in alphabetical order.
   */
  public String sorter(){
    String sortedString = "Part Time Staff";
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

  /** Displays the alphabetically sorted information of a part time staff member.
  */
  public void print(){
    System.out.println(sorter());
  }
}
