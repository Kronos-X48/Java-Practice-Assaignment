import java.util.Scanner;
/*
Average acceleration is defined as the change of velocity divided by the time taken to make
the change, as shown in the following formula:

𝑎 = (𝑣1−𝑣0)/𝑡

Write a java program that prompts the user to enter the starting velocity v0 in meters/second,
the ending velocity v1 in meters/second, and the time span t in seconds, and displays the
average acceleration.

Here is a sample run:
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
 */
public class Q5_Assaignment_2 {
    public static void main(String[] args){
        System.out.println("Note : This program is created to calculate the Acceleration after taking the data as input form use");
        System.out.println("donot enter the units of the data asked");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Initial Velocity : ");
        double v0 = sc.nextDouble();
        System.out.print("Enter the final Velocity : ");
        double v1 = sc.nextDouble();
        System.out.print("Enter the time Span or t : ");
        double t = sc.nextDouble();
        double a  = (v1 - v0)/t;
        System.out.println("The average acceleration "+a);
    }
}
