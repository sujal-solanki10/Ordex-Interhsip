
import java.time.LocalDate;
import java.time.Period;

class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hirDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hirDate;
    }

    public int getYearOfservice() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);

        System.out.println("Salary: " + salary);

        System.out.println("Hire Date: " + hireDate);
    }

}

public class EmployeeTime {

    public static void main(String[] args) {
        Employee em1 = new Employee("sujal", 4000, LocalDate.parse("2011-01-08"));
        Employee em2 = new Employee("Nabin", 4000, LocalDate.parse("2015-01-08"));
        Employee em3 = new Employee("sumit", 4000, LocalDate.parse("2018-01-08"));

        System.out.println("Years of Service: " + em1.getYearOfservice());
        System.out.println("Years of Service: " + em2.getYearOfservice());
        System.out.println("Years of Service: " + em3.getYearOfservice());
        em1.printEmployeeDetails();
        em2.printEmployeeDetails();
        em3.printEmployeeDetails();
    }
}
