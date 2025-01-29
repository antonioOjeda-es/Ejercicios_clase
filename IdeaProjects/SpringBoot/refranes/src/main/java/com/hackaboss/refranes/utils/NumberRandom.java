package com.hackaboss.refranes.utils;

import java.util.Random;

public class NumberRandom {

    public static Integer crearRandom(int numero){

        Random random = new Random();
        return random.nextInt(numero);

    }
}
