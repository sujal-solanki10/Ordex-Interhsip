//Encapsulation

class Student{
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

class s5{
	public static void main(String arg[]){
		Student s1 = new Student();
		
		s1.setName("Sujal");
		System.out.println("Student name is "+s1.getName());
	}
}