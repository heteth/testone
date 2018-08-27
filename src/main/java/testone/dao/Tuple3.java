package testone.dao;

import java.util.Arrays;
import java.util.List;

public class Tuple3<T1, T2, T3> extends Tuple {
    public Tuple3(Object... values) {
        super(values);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> create(T1 _1, T2 _2, T3 _3) {
        return new Tuple3<T1, T2, T3>(_1,_2, _3);
    }

    public T1 get_1(){
        return (T1) values.get(0);
    }

    public T2 get_2(){
        return (T2) values.get(1);
    }

    public T3 get_3(){
        return (T3) values.get(2);
    }

    @Override
    public Tuple3<T1, T2, T3> clone() {
        return new Tuple3<>(values.toArray());
    }
}
