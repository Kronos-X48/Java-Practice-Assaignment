import java.util.Scanner;

public class Q7_Assignment_2 {
	public static void main(String[] args) {
		System.out.print("Enter the Side of Hexagon ");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area;
		area = (5.196152423/2)*side*side ;
		System.out.println("Area of Hexagon with side "+side+"is "+area);
		sc.close();
	}
}
