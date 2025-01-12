package operators;
// Unary operators.Operators => ++ -- += -+ *= /= %= = ! (The operators which can applied on only single variables are called Unary Operator)

// Binary operators.Operators => To use binary operator we should have two variables ( + - * / % > >= <= < != == && ||)

// Ternary operators.Operators => Three variables are required ( ?: )

public class TernaryOperator {

    public static void main(String[] args){

        // Conditional/Ternary operator => ?:

        // Example: 1

        int a = 100, b = 200;

        int x = (a>b) ? a : b;
        System.out.println(x);

        // Ex: 2
        int person_age = 10;
        String result = (person_age>=18)? "Eligible" : "Not Eligible";
        System.out.println(result);



    }
}
