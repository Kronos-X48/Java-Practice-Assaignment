/*
Assume a string variable ruler1 contains “1” initially i.e.
 String ruler1=”1”
Write a java program to print the following output using string concatenation. (You can
take extra string variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 */
public class Q13_Assaignment_1 {
    public static void main(String[] args){
        String ruler1="1";
        String ruler2="2";
        String ruler3="3";
        String ruler4="4";
        System.out.println(ruler1);
        System.out.println(ruler1+ruler2+ruler1);
        System.out.println(ruler1+ruler2+ruler1+ruler3+ruler1+ruler2+ruler1);
        System.out.println(ruler1+ruler2+ruler1+ruler3+ruler1+ruler2+ruler1+ruler4+ruler1+ruler2+ruler1+ruler3+ruler1+ruler2+ruler1);
    }
}
