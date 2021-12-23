/*
Write a java program to exchange the values of two variables of integer type A and B
without using third temporary variable
 */
public class Q8_Assaignment_1 {
    public static void main(String[] args){
        int A = 5;
        int B = 8;
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println(A);
        System.out.println(B);

    }
}
