package com.company;

import java.util.Comparator;

public  class Comparators{
    public static Comparator<Integer> comp=new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    };
}
