import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {



        /*convert from curring to Bi function */

        CBiFunction<Integer,Integer,Integer> addTwo=t->u->t+u;
        BiFunction<Integer,Integer,Integer> biFunction=addTwo.toBiFunction(addTwo);
        Integer result = biFunction.apply(10, 2);

        System.out.println("result = " + result);



    }
}
