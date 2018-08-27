package testone.dao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tuple {
    protected final List values;

    protected Tuple(Object... values) {
        this.values = Collections.unmodifiableList(Arrays.asList(values));
    }

    @Override
    public int hashCode() {
        return values.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tuple && this.values.equals(((Tuple) obj).values);
    }
}
