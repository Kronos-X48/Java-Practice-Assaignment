/*
Write a java program that reads a Celsius degree in a double value from the console, then
converts it to Fahrenheit and displays the result. The formula for the conversion is as
follows:

fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8

Here is a sample run:
Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit

 */
import java.util.Scanner ;

public class Q1_Assaignment_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius : ");
        int Celsius = sc.nextInt();                         // input from user
        double fahrenheit = 0;                              // New Variable created with name Fahrenheit
        double c = 9.0/5;                                        // new integer with 9/5 value
        double x = c * Celsius;                                // value of 9/5*Celsius
        System.out.println(x);                              // print value stored
        fahrenheit = x + 32;                                // formulae value stored in the fahrenheit
        System.out.println(fahrenheit);                     // print the value fahrenheit

    }
}
