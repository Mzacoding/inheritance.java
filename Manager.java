//SUB CLASS
package assingmentquestion;

/**
 *
 * @author My girlFriend(Gift)
 */
public class Manager extends Employee {
    
    
  private int age;
  private String SurName;
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(int age, String SurName, String name, double salary) {
        super(name, salary);
        this.age = age;
        this.SurName = SurName;
    }

    @Override
    public void displayDetails() {
         super.displayDetails();
         System.out.print("Manager{" + "age=" + age + ", SurName=" + SurName + '}' + '}');
         System.out.println();
    }
  
}
