//backend class SUPPER CLASS
package assingmentquestion;

/**
 *
 * Create a base class Employee with fields for name and salary, and a method to display details. 
 * Create derived classes Manager and Engineer, each with additional fields and overridden methods.
 */
public class Employee {
  private String name;
  private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        
       System.out.print( "Employee{" + "name=" + name + ", salary=R" + salary +", Position :");
        
    }

  
 
}
