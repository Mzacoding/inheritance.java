//SUB CLASS
package assingmentquestion;

/**
 *
 * @author My girlFriend(Gift)
 */
public class Engineer extends Employee{
     
    private int age;
    private String SurName;
    private String CompanyName;

    public Engineer(String name, double salary) {
        super(name, salary);
    }

    public Engineer(int age, String SurName, String CompanyName, String name, double salary) {
        super(name, salary);
        this.age = age;
        this.SurName = SurName;
        this.CompanyName = CompanyName;
    }

     @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.print("Engineer{" + "age=" + age + ", SurName=" + SurName + ", CompanyName=" + CompanyName + '}' + '}');
        System.out.println();
    }

    
}
