
@FunctionalInterface
public interface MyFunction<T,U> {

     U apply(T a);


    default <V>MyFunction<V,U> compose (MyFunction<?super V,?extends T> before)
    {

        return v->apply(before.apply(v));
    }

}

