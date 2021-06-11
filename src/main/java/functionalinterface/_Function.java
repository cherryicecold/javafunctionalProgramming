package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));
        System.out.println(incrementByOne.apply(1));
        int multiply = multiplyBy10.apply(2);
        System.out.println(multiply);
        //using andThen for Function chaining
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 = incrementByOne.andThen(multiplyBy10);
        System.out.println(addByOneAndThenMultiplyBy10.apply(4));
        System.out.println(incBy1AndMultiplyBy10.apply(4,100));
    }

    static Function<Integer,Integer> incrementByOne = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment (int number){
        return number + 1;
    }

    //Bi-Function: accepts two inputs as arguments and returns one.

    static BiFunction<Integer,Integer,Integer> incBy1AndMultiplyBy10 = (number1, number2) -> (number1 + 1) * number2;

}
