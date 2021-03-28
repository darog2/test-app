package com.dungeon.task14.dao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Figure {
    protected int edgesCount;

    protected List<Double>edges = new LinkedList<>();

    public abstract double calculateArea();
    public double calculatePerimeter() {

//        double triangleArea = p;           //p
//        //for(){
//        triangleArea *= p-edges.get(i);    //p*(p-a)
//                                           //p*(p-a)*(p-b)
                                           //p*(p-a)*(p-b)*(p-c)
        //triangleArea *= p-edges.get(i);  is the same to triangleArea = triangleArea * (p-edges.get(i));
//    }
//        triangleArea = Math.sqrt(triangleArea);




return 0;
    }

}
