
import javax.swing.ProgressMonitor;


abstract class Employee{

    protected  String name;
    protected  double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public abstract  void getInfo();

}

class Manager extends  Employee{
    private double bonus;
    public Manager(String name, double baseSalary,double bonus){
        super(name,baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary(){

        return bonus + baseSalary;
    }

    public void getInfo(){

        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());

    }
}

class Programmer extends Employee{
    private int OverTime;
    private double OvertimeRate;

    public Programmer(String name, double baseSalary, int OverTime, double OvertimeRate){
        super(name, baseSalary);
        this.OverTime = OverTime;
        this.OvertimeRate = OvertimeRate;
    }

    public double calculateSalary(){
        return baseSalary + (OverTime * OvertimeRate);
    }

    public void getInfo(){
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + OverTime);
        System.out.println("Hourly Rate: $" + OvertimeRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
public class Main2 {
  
    public static void main(String[] args) {
        Manager manager = new Manager("Sujal", 4000,1500);
        manager.calculateSalary();
        manager.getInfo();

        Programmer p1 = new Programmer("sujal", 4000, 4, 551);
        p1.calculateSalary();
        p1.getInfo();
    }
    

}
