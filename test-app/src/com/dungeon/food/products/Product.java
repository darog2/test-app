package com.dungeon.food.products;

import com.dungeon.food.NotEnoughProductsException;

public abstract class Product {
    protected String name;
    protected int count;

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    protected Product(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public void takeSome( int take) throws NotEnoughProductsException {
        if(take>count){
            throw new NotEnoughProductsException(name,count,take);
        }
     this.count-=take;
    }
}
