package com.dungeon.boolean_trainer.oop;

import com.dungeon.boolean_trainer.Constants;

public class ABEntry<T> {
    protected final T a;
    protected final T b;

    public ABEntry(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    @Override
    public String toString() {
        return String.format(Constants.A_B_PRINT_TEMPLATE,a,b);
    }
}
