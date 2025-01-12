package operators;

public class DecrementOperator {

    public  static void main(String[] args){

        // Decrement operators --


        // Case 1

        int a = 20;
        a--;
        //a = a -1;
        System.out.println(a); // 19

        // Case 2 -- Post-decrement

        int b = 100;
        int res = b--;
        System.out.println(res); // 100
        System.out.println(b); // 99

        // Case 3 -- Pre-decrement

        int c = 50;
        int result = --c;
        System.out.println(result); // 49
        System.out.println(c); // 49




    }
}
