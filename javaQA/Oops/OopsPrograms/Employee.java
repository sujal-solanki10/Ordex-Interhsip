
class EmployeeData {

    private String name;
    private String jobTitle;
    private double salary;

    public EmployeeData(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double per) {
        salary = salary + (salary * per / 100);
    }

    public void EmployeeDatas() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

}

public class Employee {

    public static void main(String[] args) {

        EmployeeData em1 = new EmployeeData("Sujal", "HR", 4000);
        EmployeeData em2 = new EmployeeData("Nabin", "Software Enginner", 6000);

        System.out.println("\nEmployee Details:");
        System.out.println();
        em1.EmployeeDatas();
        System.out.println();
        em2.EmployeeDatas();

        em1.raiseSalary(500);
        em2.raiseSalary(100);
        System.out.println("\nEmployee Details:");
        System.out.println();
        em2.EmployeeDatas();
        em1.EmployeeDatas();
    }
}
