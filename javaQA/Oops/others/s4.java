//Abstraction

abstract class Animal{
	abstract void makesound();
	
	void breathe(){
		System.out.println("Animal is Breathing !!");
	}
}

class Dog extends Animal{
	
	@Override
	void makesound(){
		System.out.println("Dog is barking");
	}
}

class s4{
	public static void main(String arg[]){
		Animal myDog = new Dog();
		Dog d = new Dog();
		
		myDog.makesound();
		myDog.breathe();
		
		
	}
}