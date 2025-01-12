package operators;

public class Operators {

    public static void main(String[] args){

        // operator is a sysybol which will perform an operation.

        // Example:-

        int a = 20;
        int b = 10;
        int result = a + b;
        // +, = (operators)
        // a, b are operands

    /* Types of operators in Java are give below

    1) Arithmetic operators --> + - * / %
    2) Relational/comparisons operators => > >= < <= != ==
    3) Logical operators && || !
    4) Increment & Decrement operators ++ --
    5) Assignment = += -= *= /= %=
    6) conditional/ternary operator ?:

     */

        // 2) Relational/comparisons operators => > >= < <= != == always return boolean value

        System.out.println(a>b); //True
        System.out.println(a<b); // False
        System.out.println(a>=b); //True
        System.out.println(a<=b); // False
        System.out.println(a!=b); // True
        System.out.println(a==b); // False

        int c = 20;
        int d = 20;
        System.out.println(c==d); // True


        // 3) Logical operators && || ! always return boolean value and works between 2 boolean values.

        boolean x = true;
        boolean y = false;
        System.out.println(x&&y); // False
        System.out.println(x || y); // True
        System.out.println(!x); // False
        System.out.println(!y); // True

        boolean b1 = 10>20;
        boolean b2 = 20>10;
        System.out.println("This is a boolean value check of b1:"+b1); // False
        System.out.println("This is a boolean value check of b2:"+b2); // True

        System.out.println(b1 && b2); // false
        System.out.println(b1 || b2); // True
























    }


















}
