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

        /*Operadores lógicos

        AND &&
        OR ||
        NOT

         */



        boolean resultado3 = numero1 > 5 && numero1 < 30;

        System.out.println("es " + resultado3);

        int edad = 17;
        int edad2 = 27;

        Boolean carnetJoven = numero1 > 15 && numero1 <= 26;


        System.out.println("es Joven " + carnetJoven);




    }
}
