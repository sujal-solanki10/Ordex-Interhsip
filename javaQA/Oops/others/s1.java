class Dog{
	String name;
	void bark(){
		System.out.println(name+" says Woof!");
	}
}


class s1{
	public static void main(String arg[]){
		
		Dog ob1 = new Dog();
		ob1.name = "Sheru";
		ob1.bark();
		
	}
}