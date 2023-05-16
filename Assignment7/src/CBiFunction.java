import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
public interface CBiFunction<T,U,V> extends Function<T,Function<U,V>> {

    default BiFunction<T,U,V> toBiFunction(CBiFunction<T,U,V> cBiFunction)

    {
        return (t,u)->cBiFunction.apply(t).apply(u);
    }


}