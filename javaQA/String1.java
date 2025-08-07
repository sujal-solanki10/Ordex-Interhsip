import java.util.Scanner;

class String1{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello ");
		sb.append("World");
		
		// sb.delete(3,5);
		sb.replace(4,5," sujal qwddsadasdjk sdsdhfjshdjkfhjashfjksdhfkjh");
		
		System.out.print(sb.length());
		
	}
}