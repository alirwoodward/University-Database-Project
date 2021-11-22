/** Staff.java
*
* This is an abstract class that extends Affiliates and represents affiliates who are considered staff
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

/** The Staff class is used to represent a Staff member
 * The Staff class consists of basic methods for accessing staff information
 */
public abstract class Staff extends Affiliates{
  /**The staff's title. */
  protected String m_title;
  /**The building name. */
  protected String m_building;

  /**The default constructor - sets title and building to null
	 */
  public Staff(){
    super();
    m_title = null;
    m_building = null;
  }

  /**The overloaded constructor - creates a faculty member by taking in all of the information needed and using
   * the super() method to set the variables declared previously in the Affiliates class
   * @param name String representing name
   * @param age int representing age
   * @param address String reptesenting address
   * @param phoneNumber String representing phoneNumber
   * @param id int representing id
   * @param yearToChapman int representing year the affiliate came to chapman
   * @param title String representing staff title
   * @param building String representing staff building
	 */
  public Staff(String name, int age, String address, String phoneNumber, int id, int yearToChapman, String title, String building){
    super(name, age, address, phoneNumber, id, yearToChapman);
    m_title = title;
    m_building = building;
  }

  /** Returns the staff member's title.
  * @return A String representing the title of the staff member
  */
  public String getTitle(){
    return m_title;
  }

  /** Returns the building name.
  * @return A String representing the name of the building
  */
  public String getBuilding(){
    return m_building;
  }

  /** Returns a string representation of the staff member with each variable on a new line.
   * @return A string representation of the Staff object.
   */
  public String toString(){
    String a = super.toString();
    a += "\nTitle: " + getTitle();
    a += "\nBuilding: " + getBuilding();
      return a;

  }

  /** Abstract method to be implemented in later use of inheritence
  */
  public abstract String sorter();
}
