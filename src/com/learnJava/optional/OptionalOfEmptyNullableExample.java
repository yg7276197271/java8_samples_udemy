package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){

       //return  Optional.ofNullable("Hello");
    	//Returns an Optional describing the specified value, if non-null,otherwise returns an empty Optional.
       return  Optional.ofNullable(null);

    }

    public static Optional<String> of(){

        //return  Optional.of("Hello");
        return  Optional.of(null);
       //Returns an Optional with the specified present non-null value.

    }

    public static Optional<String> empty(){

        return  Optional.empty();
        // return  Optional.of(null);

    }
    public static void main(String[] args) {

        System.out.println("ofNullable "+ofNullable());
        System.out.println("empty "+empty());
        System.out.println("of "+of());
    }
}
