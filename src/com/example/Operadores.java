package com.example;

public class Operadores {

    public static void main(String[] args) {

        // Operadores Aritméticos

        int numero1 = 10;
        int numero2 = 20;

        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(numero1 + numero2 +  5.77);

        try {
            System.out.println(numero1 + numero2 +  5.77);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("cierre");
        }

        int resultadoResta = numero1 - numero2;

        System.out.println(resultadoResta);


        //Comparación

        /*

        > mayor que
        < menos que
        >= mayor igual que
        <= menor o igual que
       */

        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1); //boolean


        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

    }
}
