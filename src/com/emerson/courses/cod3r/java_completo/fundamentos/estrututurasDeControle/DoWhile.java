package com.emerson.courses.cod3r.java_completo.fundamentos.estrututurasDeControle;

import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Vocês precisa falar as palavras mágica");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();

        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");

        entrada.close();
    }
}