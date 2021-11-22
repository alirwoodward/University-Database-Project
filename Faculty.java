/** Faculty.java
*
* This is an abstract class that extends the Affiliates abstract class and represents an affiliate who is a Faculty member
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

/** The Faculty class is used to represent a Faculty member
 * The Faculty class consists of basic methods for accessing faculty information
 */
public abstract class Faculty extends Affiliates{
  /**The department name. */
  protected String m_department;
  /**The yearly salary. */
  protected int m_yearlySalary;
  /**The number of papers written. */
  protected int m_numOfPapers;

  /**The default constructor - sets the department to null and
   * the yearly salry and number of papers to 0
	 */
  public Faculty(){
    super();
    m_department = null;
    m_yearlySalary = 0;
    m_numOfPapers = 0;
  }

  /**The overloaded constructor - creates a faculty member by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the Affiliates class
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param department String representing department
   * @param yearlySalary int representing yearly salary
   * @param numOfPapers int representing number of papers written
	 */
  public Faculty(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String department, int yearlySalary, int numOfPapers){
    super(name, age, address, phoneNumber, id, yearToChapman);
    m_department = department;
    m_yearlySalary = yearlySalary;
    m_numOfPapers = numOfPapers;
  }

  /** Returns the department name.
  * @return A String representing the name of the faculty's department
  */
  public String getDepartment(){
    return m_department;
  }

  /** Returns the yearly salary.
  * @return An int representing the yearly salary
  */
  public int getYearlySalary(){
    return m_yearlySalary;
  }

  /** Returns the number of papers written.
  * @return An int representing the neumber of papers written
  */
  public int getNumOfPapers(){
    return m_numOfPapers;
  }

  /** Returns a string representation of the faculty member with each variable on a new line.
   * @return A string representation of the Faculty object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nDepartment: " + m_department;
    a += "\nYearly salary: " + m_yearlySalary;
    a += "\nPapers written: " + m_numOfPapers;
    return a;
  }

  /** Abstract method to be implemented in later use of inheritence
  */
  public abstract String sorter();

}
