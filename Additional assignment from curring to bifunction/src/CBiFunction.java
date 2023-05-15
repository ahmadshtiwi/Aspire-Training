import java.util.function.BiFunction;

@FunctionalInterface
public interface CBiFunction<T,U,V> extends MyFunction<T,MyFunction<U,V>> {

    default BiFunction<T,U,V> toBiFunction(CBiFunction<T,U,V> cBiFunction)

    {
        return (t,u)->cBiFunction.apply(t).apply(u);
    }


}