import java.util.Scanner;
public class Q6_Assignment_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Weight in Pounds "); //inputting weight in pounds 
		double weight_pnds = sc.nextDouble();
		
		System.out.print("Enter your Height in Inches "); //inputting height in inches
		double height_inches = sc.nextDouble();
		
		double weight_kgs ;
		double height_mtr ;
		
		weight_kgs = weight_pnds*0.45359237 ;
		height_mtr = height_inches*0.0254 ;
		
		double B_M_I ;
		
		B_M_I = weight_kgs/(Math.pow(height_mtr , 2));
		
		System.out.println("your BMI (Body Mass Index) is "+B_M_I);
		
		
	}

}
