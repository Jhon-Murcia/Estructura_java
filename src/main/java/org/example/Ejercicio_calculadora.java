package org.example;

import java.util.Scanner;

public class Ejercicio_calculadora {
    public static void main(String[] args) {

        System.out.println("Este ejercicio ejecuta una calculadora que realiza 8 operaciones");

        Scanner entrada=new Scanner(System.in);
        boolean continuar=true;

        while (continuar) {
            System.out.println("Menu");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Potenciacion");
            System.out.println("6.Raiz cuadrada");
            System.out.println("7.Modulo");
            System.out.println("8.Conversion de grados Celsius a Fahrenheit");
            System.out.println("9.Salir");

            int opcion= entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el primer numero");
                    double num1= entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num2= entrada.nextDouble();
                    System.out.println("Resultado: "+(num1+num2));
                    break;

            }
        }
    }
}
