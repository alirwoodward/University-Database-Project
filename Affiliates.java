/** Affiliates.java
*
* This is an abstract class that implements Prinatble and Comparable interfaces and represents all Chapman Affiliates
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/

import java.util.Collections;
import java.util.ArrayList;

/** The Affiliates abstract class holds information that every affiliate at chapman contains
 * The Affiliates class contains accessor and mutator methods as well as a method to compare affiliates
 * and an abstract method to sort aspects of an affiliate alphabetically
 */

public abstract class Affiliates implements Printable, Comparable<Affiliates>{
  /**The name of the affiliate. */
  protected String m_name;
  /**The age of the affiliate. */
  protected int m_age;
  /**The address of the affiliate. */
  protected String m_address;
  /**The phone number of the affiliate. */
  protected String m_phoneNumber;
  /**The ID of the affiliate. */
  protected int m_id;
  /**The year that the affiliate came to Chapman. */
  protected int m_yearToChapman;

  /**The default constructor - sets the name, address, and phone number to null,
    * and the age, id, and year they came to chapman to 0.
    */
  public Affiliates(){
    m_name = null;
    m_age = 0;
    m_address = null;
    m_phoneNumber = null;
    m_id = 0;
    m_yearToChapman = 0;
  }

  /**The overloaded constructor - creates an affiliate of given name, age, address,
  	 * phone number, id and year to chapman.
  	 * @param name String representing name
     * @param age int representing age
     * @param address String reptesenting address
     * @param phoneNumber String representing phoneNumber
     * @param id int representing id
     * @param yearToChapman int representing year the affiliate came to chapman
  	 */
  public Affiliates(String name, int age, String address, String phoneNumber, int id, int yearToChapman){
    m_name = name;
    m_age = age;
    m_address = address;
    m_phoneNumber = phoneNumber;
    m_id = id;
    m_yearToChapman = yearToChapman;
  }

  /** Returns the name.
  * @return A String representing the name of the affiliate
  */
  public String getName(){
    return m_name;
  }

  /** Returns the age.
  * @return An int representing the age of the affiliate
  */
  public int getAge(){
    return m_age;
  }

  /** Returns the address.
  * @return A String representing the address of the affiliate
  */
  public String getAddress(){
    return m_address;
  }

  /** Returns the phone number.
  * @return A String representing the phone number of the affiliate
  */
  public String getPhoneNumber(){
    return m_phoneNumber;
  }

  /** Returns the id.
  * @return An int representing the id of the affiliate
  */
  public int getID(){
    return m_id;
  }

  /** Returns the year the affiliate came to Chapman.
  * @return An int representing the year the affiliate came to Chapman
  */
  public int getYearToChapman(){
    return m_yearToChapman;
  }

  /** Returns a string representation of the affiliate with each variable on a new line.
   * @return A string representation of the Affiliates object.
   */
  public String toString(){
    String a = "";
    a += "Name: " + m_name;
    a += "\nAge: " + m_age;
    a += "\nAddress: " + m_address;
    a += "\nPhone number: " + m_phoneNumber;
    a += "\nID: " + m_id;
    a += "\nYear to Chapman: " + m_yearToChapman;
    return a;
  }

  /** Returns an int value that represents the comparison between two affiliates years they came to Chapman.
  * @return An in representing the comparison of two affiliates years to Chapman.
  */
  public int compareTo(Affiliates i){
    int ret = 0;
    if(getYearToChapman() > i.getYearToChapman()){
      ret = 1;
    }else if(getYearToChapman() < i.getYearToChapman()){
      ret = -1;
    }

    return ret;
  }


  /** Abstract method to be implemented in later use of inheritence
  */
  public abstract String sorter();

}
