import java.util.Scanner;


public class Q8_Assignment_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number ");
		double a = sc.nextDouble();
		
		
		System.out.print("Enter its power u want to be calculated ");
		double b = sc.nextDouble();
		
		int c ;
		int d ;
		
		c = (int)a;
		d = (int)b;
		
		int rise = (int)Math.pow(a,b);
		
		System.out.println(c+" to the power "+d+" is "+rise);
		
	}
		
}
