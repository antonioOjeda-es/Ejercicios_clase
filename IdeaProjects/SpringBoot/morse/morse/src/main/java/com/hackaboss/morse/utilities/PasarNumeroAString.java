package com.hackaboss.morse.utilities;

public class PasarNumeroAString {

    public static String pasarNumeroAchar(char numeroChar) {

        return switch (numeroChar) {
            case '0' -> "Cero";
            case '1' -> "Uno";
            case '2' -> "Dos";
            case '3' -> "Tres";
            case '4' -> "Cuatro";
            case '5' -> "Cinco";
            case '6' -> "Seis";
            case '7' -> "Siete";
            case '8' -> "Ocho";
            case '9' -> "Nueve";
            default -> "Número inválido";
        };

    }
}
