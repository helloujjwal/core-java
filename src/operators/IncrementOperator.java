package operators;

public class IncrementOperator {

    public static void main(String[] args){

       // 4)Increment ++

        // Case 1
        int a = 10;
        System.out.println(a); // 10

        a++;
        System.out.println(a); // 11

        // Case 2 -- Post increment operator

        int b = 20;
        int result = b++;
        System.out.println(result); // 10

        // Case 3 -- Preincrement operator

        int c = 30;
        int res = ++c;
        System.out.println(res); // 11





    }
}
