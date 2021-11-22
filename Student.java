/** Student.java
*
* This is a class that extends the Affiliates abstract class and represents an affiliate who is a Student
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

/** The Student class is used to represent a Student
 * The Student class consists of basic methods for accessing student information
 */
public abstract class Student extends Affiliates{
  /**The student's major. */
  protected String m_major;
  /**The student's minor. */
  protected String m_minor;
  /**The student's class standing. */
  protected String m_classStanding;

  /**The default constructor - sets the major, minor and class standing to null
	 */
  public Student(){
    super();
    m_major = null;
    m_minor = null;
    m_classStanding = null;
  }

  /**The overloaded constructor - creates a student by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the Affiliates class
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param major String representing major
   * @param minor String representing minor
   * @param classStanding String representing class standing
	 */
  public Student(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String major, String minor, String classStanding){
    super(name, age, address, phoneNumber, id, yearToChapman);
    m_major = major;
    m_minor = minor;
    m_classStanding = classStanding;
  }

  /** Returns the major.
  * @return A String representing the student's major
  */
  public String getMajor(){
    return m_major;
  }

  /** Returns the minor.
  * @return A String representing the student's minor
  */
  public String getMinor(){
    return m_minor;
  }

  /** Returns the class standing.
  * @return A String representing the student's class standing
  */
  public String getClassStanding(){
    return m_classStanding;
  }

  /** Returns a string representation of the student with each variable on a new line.
   * @return A string representation of the Student object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nMajor: " + getMajor();
    a += "\nMinor: " + getMinor();
    a += "\nClass Standing: " + getClassStanding();
    return a;
  }

  /** Abstract method to be implemented in later use of inheritence
  */
  public abstract String sorter();
}
