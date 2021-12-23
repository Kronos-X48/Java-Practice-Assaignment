import java.util.Scanner;

/*
Write a java program that reads in the radius and length of a cylinder and computes the area
and volume using the following formulas:
area = radius * radius * π

volume = area * length
 */
public class Q2_Assaignment_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of Cylinder ; ");
        double r = sc.nextDouble();
        System.out.print("Length of Cylinder ; ");
        double l = sc.nextDouble();
        double pi = 22.0/7 ;
        double area = r*r*pi ;
        double volume = area * l ;
        System.out.println("area of the Cylinder ; "+ area);
        System.out.println("volume of the Cylinder ; "+volume);

    }
}
