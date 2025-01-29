package com.antonio.utilities;

public class Validaciones extends Exception{

    //tipo de dato, que no esté vacío
    public static void validarString(String palabrqaValidar){
        if(palabrqaValidar== null || palabrqaValidar.isEmpty()){
            throw new RuntimeException("tiene que insertar un valor");
        }
    }

}
