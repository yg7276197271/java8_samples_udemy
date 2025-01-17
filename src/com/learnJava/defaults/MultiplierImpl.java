package com.learnJava.defaults;

import java.util.List;

public class MultiplierImpl implements  Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        System.out.println("multiply method Inside Implementation class");

        return integerList
                .stream()
                .reduce(1, (x,y) -> x*y);
    }

    @Override
     public int size(List<Integer> integerList){
         System.out.println("size method Inside Implementation class");
        return integerList.size();
    }
    
    static boolean isEmpty(List<Integer> integerList){
        System.out.println("isEmpty method Inside Implementation class");

        return integerList!=null && integerList.size()==0;
    }

}
