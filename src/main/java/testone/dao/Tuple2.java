package testone.dao;

public class Tuple2<T1, T2> extends Tuple {
    private Tuple2(Object... values) {
        super(values);
    }

    public static <T1, T2> Tuple2<T1, T2> create(T1 _1, T2 _2) {
        return new Tuple2<T1, T2>(_1, _2);
    }

    public T1 get_1(){
        return (T1) values.get(0);
    }

    public T2 get_2(){
        return (T2) values.get(1);
    }

    @Override
    public Tuple2<T1, T2> clone() {
        return new Tuple2<>(values.toArray());
    }
}
