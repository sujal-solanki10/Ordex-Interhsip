class Student{

    private String studentName;
    private int studentId;
    private char grade;

    public Student() {
        this.studentId = 1;
        this.studentName = "Sujal";
        this.grade = 'A';
    }

    public Student(String name, int ID, char grade){
        this.grade = grade;
        this.studentId = ID;
        this.studentName = name;
    }

    public void getInfo(){
        System.out.println("\nStudent Name : "+studentName);
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Grade : "+grade);
    }

    
}


public class ConstructorQ {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sumit",2,'A');

        s1.getInfo();
        s2.getInfo();
    }
}
