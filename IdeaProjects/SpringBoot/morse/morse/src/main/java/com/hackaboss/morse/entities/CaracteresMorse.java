package com.hackaboss.morse.entities;

public class CaracteresMorse {

    private String morse;
    private String caracter;

    public CaracteresMorse(String caracter) {

        //recogemos la variable letra para que haga la conversión a morse (si meto la ñ, la he liado)
        this.morse = Morse.valueOf(caracter.toUpperCase()).getCaracterLetra();
        this.caracter = caracter;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    //to

    public enum Morse{

        A(".-"),
        B("-..."),
        C("-.-."),
        D("-.."),
        E("."),
        F("..-."),
        G("--."),
        H("...."),
        I(".."),
        J(".---"),
        K("--.-"),
        L(".-.."),
        M("--"),
        N("-."),
        O("---"),
        P("· - - ·"),
        Q("- - · -"),
        R(". - ·"),
        S("· · ·"),
        T("-"),
        U("· · -"),
        V("· · · -"),
        W("· - -"),
        X("- · · -"),
        Y("- · - -"),
        Z("- - · ·"),
        CERO("- - - - -"),
        UNO(". - - - -"),
        DOS(". - - -"),
        TRES("- - - - -"),
        CUATRO(". . . . -"),
        CINCO(". . · · · -"),
        SEIS(". · · · · ·"),
        SIETE("- - · - -"),
        OCHO("- - - - - -"),
        NUEVE("- - - - - - -"),
        ESPACIO(" ");


        private String caracterLetra;
        private String caracterMorse;

        Morse(String caracterLetra) {
            this.caracterLetra = caracterLetra;

        }

        public String getCaracterLetra() {
            return caracterLetra;
        }

        public void setCaracterLetra(String caracterLetra) {
            this.caracterLetra = caracterLetra;
        }

        public String getCaracterMorse() {
            return caracterMorse;
        }

        public void setCaracterMorse(String caracterMorse) {
            this.caracterMorse = caracterMorse;
        }

        @Override
        public String toString() {
            return "Morse{" +
                    "caracterLetra='" + caracterLetra + '\'' +
                    ", caracterMorse='" + caracterMorse + '\'' +
                    '}';
        }
    }



}

