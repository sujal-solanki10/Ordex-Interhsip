interface bycycle{
	int speed = 35;
	void breaking(int a);
	void speedUp(int b);
}

class myCycle implements bycycle{
	int a;
	
	// myCycle(int speed){
		// this.a = speed ;
	// }
	public void breaking(int a){
		System.out.println("Appling breaks !! Speed : "+(a = speed-a));
	}
	public void speedUp(int a){
		System.out.println("speed Up !! speed : "+(a = speed+a));
	}
}

class interface1{
	public static void main(String arg[]){
		bycycle myBycycle = new myCycle();
		
		myBycycle.speedUp(10);
		myBycycle.breaking(20);
	}
}