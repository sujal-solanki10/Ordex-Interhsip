class Classroom{
    String className;
    String[] students;

    public Classroom(String Name ,  String[] students){
        this.className = Name;
        this.students = students;

    }

    public void getInfo(){
        System.out.println("Class Room Name : "+className);
        System.out.println("Studnets Name  : ");
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
    }
    public static void msg(){
        System.out.println("Hello");
    }

}

public class ConstructorQ5 {
    
    public static void main(String[] args) {

        String[] student = {"sujal","sumit"};
        
        Classroom c1 = new Classroom("Class 1",student);
        c1.getInfo();

        Classroom.msg();
    }
}
