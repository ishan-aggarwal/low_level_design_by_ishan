package composite.example2;

public class Main {

    public static void main(String args[]) {

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArithmeticExpression two = new Number(2);

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression rightChildExpression = new Expression(one, seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two, rightChildExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());
    }
}

