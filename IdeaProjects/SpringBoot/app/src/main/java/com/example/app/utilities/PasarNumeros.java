package com.example.app.utilities;

import java.text.NumberFormat;
import java.util.Locale;

public class PasarNumeros {

    public static String pasarANumeroRomano(int numero){

        final int MAX = 1000;
        final int MIN = 1;


        if(numero < MIN || numero > MAX){
            return "El número " + numero + " debe ser mayor o igual a 1 y menor o igual a 1000.";
        }

        NumberFormat formatter = NumberFormat.getIntegerInstance(Locale.forLanguageTag("la"));

        return formatter.format(numero);
    }
}
