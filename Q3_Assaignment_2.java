import java.util.Scanner;
/*
Write a java program that reads a number in feet, converts it to meters, and displays the
result. One foot is 0.305 meter.

Here is a sample run:
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters
 */
public class Q3_Assaignment_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for feet : ");
        double feet = sc.nextDouble();
        double meter = 0.305;
        double converted = feet*meter;
        System.out.println(feet+" feet is "+converted+"meters");

    }
}
