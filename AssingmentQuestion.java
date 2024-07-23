//Question 8
package assingmentquestion;

/**
 *
 * Create a base class Employee with fields for name and salary, and a method to display details. 
 * Create derived classes Manager and Engineer, each with additional fields and overridden methods.
 */
public class AssingmentQuestion {

   
    public static void main(String[] args) {
       
       Engineer theEngineer=new Engineer(30,"Khoza","Sasol","Nyiko" ,15000);
       theEngineer.displayDetails();
       
     
       Manager theManager=new Manager(25,"Mkansi","Gift",30000);
       theManager.displayDetails();
       
       
    }
    
}
