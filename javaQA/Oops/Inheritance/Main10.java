
class Employee {

    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public String generatePerformanceReport() {
            return "No performance report available.";
    }

}


class Developer extends Employee{
    private  String programingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programingLanguage) {

        super(name,address,salary,jobTitle);
        this.programingLanguage = programingLanguage;
    }

    public String getProgramingL(){
        return programingLanguage;
    }

    public double calculateBonus(){
        return getSalary() * 0.10;
    }

    

}

public class Main10 {

    public static void main(String[] args) {

    }
}
