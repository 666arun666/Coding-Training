abstract class Employee {
    private String name;
    private int id;
    protected int basicSalary = 10000; 

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    abstract void calculateSalary();
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }
    
    @Override
    void calculateSalary() {
        int salary = basicSalary + 5000; 
        System.out.println("Developer " + getName() + "'s Salary: " + salary);
    } 
}

class Tester extends Employee {
    Tester(String name, int id) {
        super(name, id);
    }
    
    @Override
    void calculateSalary() {
        int salary = basicSalary + 10000; 
        System.out.println("Tester " + getName() + "'s Salary: " + salary);
    } 
}
    
public class EMPLOYEESALARY {
    public static void main(String[] args) {
        Employee dev = new Developer("John", 1);
        dev.calculateSalary();

        Employee test = new Tester("Jane", 2);
        test.calculateSalary();
    }
}