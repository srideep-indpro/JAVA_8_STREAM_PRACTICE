package com.test;

import java.util.function.Supplier;

public class LambdaExpTest {

    public static void main(String[] args) {
        Supplier<Double> randomNumber = ()->Math.random();
        Supplier<Supplier<Double>> randomNumber1 = ()->Math::random;
        System.out.printf(String.valueOf(randomNumber1.get().get()));
    }
}
