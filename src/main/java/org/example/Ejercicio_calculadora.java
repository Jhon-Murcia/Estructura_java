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
                //Parte 2 de la calculadora.
                case 2:
                    System.out.println("Ingresa el primer numero");
                    double num3= entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num4= entrada.nextDouble();
                    System.out.println("Resultado: "+(num3-num4));
                    break;
                case 3:
                    System.out.println("Ingresa el primer numero");
                    double num5= entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num6= entrada.nextDouble();
                    System.out.println("Resultado: "+(num5*num6));
                    break;

                case 4:
                    System.out.println("Ingresa el primer numero");
                    double num7= entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num8= entrada.nextDouble();
                    System.out.println("Resultado: "+(num7/num8));
                    break;

                case 5:
                    System.out.println("Ingresa el primer numero");
                    double num9= entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num10= entrada.nextDouble();
                    System.out.println("Resultado: "+Math.pow(num9, num10));
                    break;

                case 6:
                    System.out.println("Ingresa el primer numero");
                    double num11= entrada.nextDouble();
                    if (num11 >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num11));
                    } else {   System.out.println(" Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 % num2));
                    break;
                case 8:
                    System.out.print("Ingrese la temperatura en grados Celsius: ");
                    num1 = entrada.nextDouble();
                    double fahrenheit = (num1 * 9/5) + 32;
                    System.out.println("Temperatura en Fahrenheit: " + fahrenheit + "°F");
                    break;
                case 9:
                    System.out.println(" Saliendo de la calculadora. ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
            }
        }

        entrada.close();
    }
}

