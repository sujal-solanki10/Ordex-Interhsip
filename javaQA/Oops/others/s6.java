class Animal{
	private String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void sound(){
		System.out.println("Some sound");
	}
}

class Dog extends Animal{
	
	Dog(String name){
		super(name);
	}
	
	@Override
	public void sound(){
		System.out.println("woof !!");
	}
}

class Cat extends Animal{
	
	Cat(String name){
		super(name);
	}
	
	@Override
	public void sound(){
		System.out.println("Meow !");
	}
}

class s6{
	public static void main(String arg[]){
		Dog ob1 = new Dog("Sheru");
		Cat ob2 = new Cat("Billu");
		
		System.out.println("Dog name : "+ob1.getName());
		ob1.sound();
		
		System.out.println("Cat name : "+ob2.getName());
		ob2.sound();
	}
}