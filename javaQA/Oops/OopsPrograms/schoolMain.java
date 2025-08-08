import com.sun.source.util.TreePathScanner;
import java.util.ArrayList;
class School{
    private ArrayList<Student> student;
    private ArrayList<Teacher> teacher;
    private ArrayList<SchoolClass> schoolClass;

    public School(){
        this.student = new ArrayList<>();
        this.teacher = new ArrayList<>();
        this.schoolClass = new ArrayList<>();
    }

    public void addStudent(Student s){
        student.add(s);
    }

    public void addTeacher(Teacher t){
        teacher.add(t);
    }

    public void addSchoolClass(SchoolClass s){
        schoolClass.add(s);
    }

    public void removeStudent(Student s){
        student.remove(s);
        
    }
    
    public void removeTeacher(Teacher s){
        teacher.remove(s);
    }
    public void removeSchoolClass(SchoolClass sc){
        schoolClass.remove(sc);
    }


    public ArrayList<Student>  getStudents(){
        return student;
    }
    public ArrayList<Teacher>  getTeachers(){
        return teacher;
    }
    public ArrayList<SchoolClass>  getSchoolClass(){
        return schoolClass;
    }

}

class Teacher{
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.subject = subject;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSub() {
        return subject;
    }



    

}
class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name= name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
class SchoolClass{
    private  String className;
    private Teacher teacher;
    private ArrayList<Student> students;

    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new  ArrayList<>();
    }

    public String getClassName(){
        return className;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void removeStudent(Student s) {
        students.remove(s);

    }

    public void addStudent(Student s) {
        students.add(s);
    }



    


}
public class schoolMain {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Mats Yatzil", 15);
        Student student2 = new Student("Karolina Ralf", 16);
        Student student3 = new Student("Felicie Anuschka", 16);
        Student student4 = new Student("Norbert Micha", 15);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens Amalia", "Math");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        SchoolClass mathClass = new SchoolClass("Mathematics", teacher1);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        SchoolClass englishClass = new SchoolClass("English", teacher2);
        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        SchoolClass scienceClass = new SchoolClass("Science", teacher3);
        scienceClass.addStudent(student1);
        scienceClass.addStudent(student2);
        scienceClass.addStudent(student3);
        scienceClass.addStudent(student4);

        school.addSchoolClass(mathClass);
        school.addSchoolClass(englishClass);
        school.addSchoolClass(scienceClass);

        // Print general school information
        System.out.println("School information:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getSchoolClass().size());
        System.out.println();
        System.out.println("Math class information:");
        System.out.println("Class name: " + mathClass.getClassName());
        System.out.println("Teacher: " + mathClass.getTeacher().getName());
        System.out.println("Number of students: " + mathClass.getStudents().size());
        System.out.println();

        // Print English class information
        System.out.println("English class information:");
        System.out.println("Class name: " + englishClass.getClassName());
        System.out.println("Teacher: " + englishClass.getTeacher().getName());
        System.out.println("Number of students: " + englishClass.getStudents().size());
        System.out.println();

        // Print Science class information
        System.out.println("Science class information:");
        System.out.println("Class name: " + scienceClass.getClassName());
        System.out.println("Teacher: " + scienceClass.getTeacher().getName());
        System.out.println("Number of students: " + scienceClass.getStudents().size());
        System.out.println();
    }   
}
