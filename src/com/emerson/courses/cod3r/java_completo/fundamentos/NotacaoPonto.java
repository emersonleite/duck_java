package com.emerson.courses.cod3r.java_completo.fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        // Tipos pritivos não tem o operador '.'

        String s = "Bom dia X";

        s = s.toUpperCase();

        System.out.println(s);

        System.out.println("Emerson".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Emerson")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

    }

}