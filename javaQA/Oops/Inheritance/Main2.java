
class Employee{
    private int salary;

    public Employee(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void work(){
        System.out.println("Employee Working. ");
    }
}

class HRManager extends Employee{

    public HRManager(int salary) {
        super(salary);
    }
    
    public void work(){
        System.out.println("\n Managing employee ");
    }

    public void addEmployee(){
        System.out.println("\nAdding new employee!");
    }

}

public class Main2 {
    public static void main(String[] args) {

        HRManager hr = new HRManager(4000);
        Employee em = new Employee(6000);

        em.work();
        System.out.println("Employee salaray : "+em.getSalary());
        hr.work();
        System.out.println("HR Manager salary : "+hr.getSalary());
    }
}
