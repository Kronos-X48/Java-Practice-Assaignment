import java.util.Scanner;
/*
Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 932, the sum of all its digits is 14.

Hint: Use the % operator to extract digits, and use the / operator to remove the extracted
digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

int a=Character.getNumericValue(c);

Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27
 */
public class Q4_Assaignment_2 {
    public static void main(String[] args){
        System.out.print("Enter a number between 0 and 1000 : ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String str_num = num+"";
        char x = str_num.charAt(0);
        char y = str_num.charAt(1);
        char z = str_num.charAt(2);
        int a = Character.getNumericValue(x);
        int b = Character.getNumericValue(y);
        int c = Character.getNumericValue(z);
        int n = a+b+c;
        System.out.println("The sum of digits is "+n);


    }
}
