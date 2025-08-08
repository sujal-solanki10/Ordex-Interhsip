
import java.lang.reflect.Array;
import java.util.ArrayList;

class Student {

    private String name;
    private int grade;
    private ArrayList courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public ArrayList getCourse() {
        return courses;
    }

    public void getInfo() {
        System.out.println("Name : " + name);
        System.out.println("Grade : " + grade);
    }

}

class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("Sujal Solnaki", 10);
        Student s2 = new Student("Nabin Maity", 5);
        Student s3 = new Student("Sumit Soalnki", 6);

        s1.getInfo();
        System.out.println();
        // s2.getInfo();
        // System.out.println();
        // s3.getInfo();

        s1.addCourse("DSA");
        s1.addCourse("JAVA");
        s1.addCourse("CPP");

        System.out.println(s1.getName() + "'s courses: " + s1.getCourse());

    }
}
