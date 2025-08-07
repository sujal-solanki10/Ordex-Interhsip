//polimorphisam

class  Animal{
		// //compile time polymorphisome

	void sound(){
		System.out.println("Animal makes a sound");
	}
	void sound(String type){
		System.out.println("Animal Sound :"+type);
	}
}

class Dog extends Animal{
	@Override
	void sound(String type){
		System.out.println("Dog Sound :"+type);
	}
}

class s3{
	public static void main(String arg[]){
		Animal a = new Animal();
		Dog b = new Dog();
		Animal poly = new Dog();// = b;
		
		//Overloding
		a.sound();
		a.sound("Generic !");
		
		//Overring
		b.sound("Loud !");
		
        // Performing the Polymorphism   		
		poly.sound("soft");
		
	}
}