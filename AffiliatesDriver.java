/** AffiliatesDriver.java
*
* This is the driver class for the Affiliates database
* @author Ali Woodward
* @author Student ID: 2385718
* @author alwoodward@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Programming Mastery Project 4
* @version 1.0
*/


import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/** The AffiliatesDriver class is used manage and perform the actions of the Affiliates database
 * The AffiliatesDriver class consists of the main method and multiple other methods that
 * print and excecute command options for using the affiliates database.
 */

public class AffiliatesDriver{

  /**Hash Map that will hold Affiliate objects */
  static HashMap<Integer, Affiliates> record = new HashMap<Integer, Affiliates>();

  /** The main method. Exercises the AffiliatesDriver class functionality and prompts users for what action they want to perform until they choose "Exit".
    * @param args The command line arguments (not used)
    */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int choice = 0;
    while(choice != 6){
      printMenu();
      System.out.print("Enter a number for your choice here: ");
      choice = scnr.nextInt();
      excecuteCommand(choice);
    }

  }

  /** Displays the menu options for user use.
    */
  public static void printMenu(){
    System.out.println("\nPlease select an action to perform:");
    System.out.println("1. Create an affiliate record");
    System.out.println("2. Print information for an Affiliate given the id");
    System.out.println("3. List all affiliates in order of seniority");
    System.out.println("4. Delete a record given the id");
    System.out.println("5. Save your database to a file");
    System.out.println("6. Exit");
  }

  /** Excecutes the chosen user option by simple function or calling an additional method.
  * @param option The option the user has chosen to be performed
  */
  public static void excecuteCommand(int option){
    Scanner scnr = new Scanner(System.in);
    switch(option){
      case 1:
        System.out.println("What type of affiliate would you like to add?");
        System.out.println("1. Assistant Professor\n2. Associate Professor\n3. Full Professor\n4. Graduate Student\n5. Undergraduate Student\n6. Full Time Staff\n7. Part Time Staff");
        System.out.print("Enter a number: ");
        int choice = scnr.nextInt();
        createAffiliate(choice);
        break;

      case 2:
        System.out.println("Enter ID: ");
        int idNum = scnr.nextInt();
        Affiliates toPrint = record.get(idNum);
        toPrint.print();
        System.out.println();
        break;

      case 3:
        ArrayList<Affiliates> affiliates = new ArrayList<Affiliates>();
        for(Affiliates a: record.values()){
          affiliates.add(a);
        }
        Collections.sort(affiliates);
        for(Affiliates i : affiliates){

          System.out.println(i.getName() + ", " + i.getYearToChapman());
        }
        break;

      case 4:
        System.out.print("Enter the ID number of the affiliate you would like to remove: ");
        int idToRemove = scnr.nextInt();
        record.remove(idToRemove);
        for(Integer i: record.keySet()){
          System.out.println("value: " + record.get(i));
        }
        break;

      case 5:
        System.out.print("File name: ");
        String fileName = scnr.nextLine() + ".txt";
        PrintWriter pw = null;
        try{
          pw = new PrintWriter(new FileWriter(fileName));
          saveToFile(pw);
        }catch(IOException e){
          System.err.println("Error writing file! ");
          System.err.println(e.getMessage());
        }finally{
          if(pw != null){
            pw.close();
          }
        }
        break;

      case 6:
        System.out.println("You have exited the database.");
        break;

      default:
        System.out.println("Not an option please try again");
    }
  }

  /** Creates an affiliate.
    * @param x The type of affiliate to be craeted based upon user selected options
    */
  public static void createAffiliate(int x){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the following information: ");
    System.out.print("Name: ");
    String name = scnr.nextLine();
    System.out.print("Age: ");
    int age = Integer.parseInt(scnr.nextLine());
    System.out.print("Address: ");
    String address = scnr.nextLine();
    System.out.print("Phone Number: ");
    String phoneNumber = scnr.nextLine();
    System.out.print("Chapman ID: ");
    int id = Integer.parseInt(scnr.nextLine());
    System.out.print("Year started at Chapman: ");
    int yearBegan = Integer.parseInt(scnr.nextLine());

    if(x == 1){
      System.out.print("Department: ");
      String department = scnr.nextLine();
      System.out.print("Yearly Salary: ");
      int yearlyFacultySalary = Integer.parseInt(scnr.nextLine());
      System.out.print("Number of papers written: ");
      int numOfPapers = Integer.parseInt(scnr.nextLine());
      System.out.print("Years until tenure: ");
      int tilTenure = Integer.parseInt(scnr.nextLine());
      AssistantProf createdAssistantProf = new AssistantProf(name, age, address, phoneNumber, id, yearBegan, department, yearlyFacultySalary, numOfPapers, tilTenure);
      record.put(id, createdAssistantProf);
    }else if(x == 2){
      System.out.print("Department: ");
      String department = scnr.nextLine();
      System.out.print("Yearly Salary: ");
      int yearlyFacultySalary = Integer.parseInt(scnr.nextLine());
      System.out.print("Number of papers written: ");
      int numOfPapers = Integer.parseInt(scnr.nextLine());
      System.out.print("Years since tenure: ");
      int sinceTenure = Integer.parseInt(scnr.nextLine());
      AssociateProf createdAssociateProf = new AssociateProf(name, age, address, phoneNumber, id, yearBegan, department, yearlyFacultySalary, numOfPapers, sinceTenure);
      record.put(id, createdAssociateProf);
    }else if(x == 3){
      System.out.print("Department: ");
      String department = scnr.nextLine();
      System.out.print("Yearly Salary: ");
      int yearlyFacultySalary = Integer.parseInt(scnr.nextLine());
      System.out.print("Number of papers written: ");
      int numOfPapers = Integer.parseInt(scnr.nextLine());
      System.out.print("Years until retirement: ");
      int tilRetire = Integer.parseInt(scnr.nextLine());
      FullProf createdFullProf = new FullProf(name, age, address, phoneNumber, id, yearBegan, department, yearlyFacultySalary, numOfPapers, tilRetire);
      record.put(id, createdFullProf);
    }else if(x == 4){
      System.out.print("Major: ");
      String major = scnr.nextLine();
      System.out.print("Minor: ");
      String minor = scnr.nextLine();
      System.out.print("Class Standing: ");
      String classStanding = scnr.nextLine();
      System.out.print("Number of papers written: ");
      int papersWritten = Integer.parseInt(scnr.nextLine());
      System.out.print("Thesis advisor: ");
      String advisor = scnr.nextLine();
      GradStudent createdGradStudent = new GradStudent(name, age, address, phoneNumber, id, yearBegan, major, minor, classStanding, papersWritten, advisor);
      record.put(id, createdGradStudent);
    }else if(x == 5){
      System.out.print("Major: ");
      String major = scnr.nextLine();
      System.out.print("Minor: ");
      String minor = scnr.nextLine();
      System.out.print("Class Standing: ");
      String classStanding = scnr.nextLine();
      System.out.print("Number of courses taken: ");
      int numCourses = Integer.parseInt(scnr.nextLine());
      System.out.print("Scholarship amount: ");
      int scholarship = Integer.parseInt(scnr.nextLine());
      UndergradStudent createdUndergradStudent = new UndergradStudent(name, age, address, phoneNumber, id, yearBegan, major, minor, classStanding, numCourses, scholarship);
      record.put(id, createdUndergradStudent);
    }else if(x == 6){
      System.out.print("Title: ");
      String title = scnr.nextLine();
      System.out.print("Building: ");
      String building = scnr.nextLine();
      System.out.print("Yearly Salary: ");
      int yearlyStaffSalary = Integer.parseInt(scnr.nextLine());
      FullTimeStaff createdFullTimeStaff = new FullTimeStaff(name, age, address, phoneNumber, id, yearBegan, title, building, yearlyStaffSalary);
      record.put(id, createdFullTimeStaff);
    }else if(x == 7){
      System.out.print("Title: ");
      String title = scnr.nextLine();
      System.out.print("Building: ");
      String building = scnr.nextLine();
      System.out.print("Hourly Salary: ");
      int hourlyStaffSalary = Integer.parseInt(scnr.nextLine());
      PartTimeStaff createdPartTimeStaff = new PartTimeStaff(name, age, address, phoneNumber, id, yearBegan, title, building, hourlyStaffSalary);
      record.put(id, createdPartTimeStaff);
    }else{
      System.out.print("That number is not an option. Please choose a new one: ");
      int newChoice = Integer.parseInt(scnr.nextLine());
      createAffiliate(newChoice);
    }

  }

  /** Saves database to a file that does not yet exist.
  * @param pw PrintWriter variable that prints into a file with e file name chosen by the user
  */
  public static void saveToFile(PrintWriter pw)
  {
    ArrayList<String> outOfOrder = new ArrayList<String>();
    ArrayList<String> inOrder = new ArrayList<String>();

    for(Affiliates a : record.values()){
      String sortedAffiliate = a.sorter();
      outOfOrder.add(sortedAffiliate);
    }

    for(String b : outOfOrder){
      if(b.contains("Assistant")){
        inOrder.add(b);
      }
    }

    for(String c : outOfOrder){
      if(c.contains("Associate")){
        inOrder.add(c);
      }
    }

    for(String d : outOfOrder){
      if(d.contains("Full Time Professor")){
        inOrder.add(d);
      }
    }

    for(String c : outOfOrder){
      if(c.contains("Graduate")){
        inOrder.add(c);
      }
    }

    for(String d : outOfOrder){
      if(d.contains("Undergraduate")){
        inOrder.add(d);
      }
    }

    for(String e : outOfOrder){
      if(e.contains("Full Time Staff")){
        inOrder.add(e);
      }
    }

    for(String f : outOfOrder){
      if(f.contains("Part Time Staff")){
        inOrder.add(f);
      }
    }

    for(String s : inOrder){
      pw.println(s);
    }
  }

}
