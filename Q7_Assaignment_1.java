/*
Write a java program to exchange the values of two variables of integer type A and B using
third temporary variable C.
 */
public class Q7_Assaignment_1 {
    public static void main(String[] args){
        int A = 5;
        int B = 6;
        int C = 0;
        System.out.println(A);
        System.out.println(B);
        C = A;
        A = B;
        B = C;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


    }
}
