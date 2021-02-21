package com.dungeon.boolean_trainer.oop;

import com.dungeon.boolean_trainer.Constants;

public class ABCEntry<T> extends ABEntry<T>{
    private final T c;
    public ABCEntry(T a, T b, T c) {
        super(a, b);
        this.c  = c;
    }

    public T getC() {
        return c;
    }

    @Override
    public String toString() {
        return String.format(Constants.A_B_C_PRINT_TEMPLATE,a,b,c);
    }
}
