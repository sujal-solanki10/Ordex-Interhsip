//Inheritance
class Vehicle{
	void start(){
		System.out.println("Vehicle is Starting !!");
	}
	void Stop(){
		System.out.println("Vehicle is Stoping !!");
	}
}

class car extends Vehicle{
	void honk(){
		System.out.println("Car is Honking!");
	}
	
}

class s2{
	public static void main(String arg[]){
		car Mycar = new car();
		
		Mycar.start();
		Mycar.honk();
		Mycar.Stop();
	}
}