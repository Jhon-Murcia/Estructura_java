package org.example;

import java.util.Scanner;

public class Ejercicio_calculadora {
    public static void main(String[] args) {

        System.out.println("Bienvenid@ a la calculadora");
        System.out.println("Este programa te permitira realizar 8 operaciones, incluyendo conversion de unidades.");

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println(" \n ¿Ya sabes qué operación quieres hacer? Escribe el nombre  de la operación o 'n' para ver el menú):");
            String respuesta = entrada.nextLine().trim().toLowerCase();

            int opcion = -1;
            switch (respuesta) {
                case "suma":opcion =1; break;
                case "resta": opcion = 2; break;
                case "multiplicacion":
                case "multiplicación": opcion = 3; break;
                case "division":
                case "división": opcion = 4; break;
                case "potenciacion":
                case "potenciación": opcion = 5; break;
                case "raíz cuadrada":
                case "raiz cuadrada": opcion = 6; break;
                case "modulo":
                case "módulo": opcion = 7; break;
                case"conversion":
                case "conversiones": opcion = 8; break;
                case "n":
                    System.out.println("\n Menú de operaciones:");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.println("5. Potenciación");
                    System.out.println("6. Raíz cuadrada");
                    System.out.println("7. Módulo");
                    System.out.println("8. Conversiones de unidades");
                    System.out.println("9. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine(); // Limpiar buffer
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
            }


            double num1, num2;
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer número");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo número");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Ingresa el primer número");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo número");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Ingresa el primer número");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo número");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Ingresa el primer número");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo número");
                    num2 = entrada.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Ingresa la base: ");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el exponente:");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.println("Ingresa el número:");
                    num1 = entrada.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 % num2));
                    break;
                case 8:
                    System.out.println("Selecciona el tipo de conversión que deseas hacer:");
                    System.out.println("1.Celsius a Fahrenheit");
                    System.out.println("2.Fahrenheit a Celsius");
                    System.out.println("3. Kilómetros a Millas");
                    System.out.println("4. Metros a Pies");
                    System.out.println("5. Gramos a libras");
                    System.out.println("6. Litros a Galones");
                    int conversion = entrada.nextInt();
                    System.out.print("Ingresa el valor que deseas convertir: ");
                    num1 = entrada.nextDouble();

                    switch (conversion) {
                        case 1:
                            System.out.println("Resultado: "+ ((num1 * 9 /5)+ 32)+ "°F");
                            break;
                        case 2:
                            System.out.println("Resultado: " + ((num1 -32 ) * 5 / 9) + " °C");
                            break;
                        case 3:
                            System.out.println("Resultado: " + (num1 * 0.621371) + " millas");
                            break;
                        case 4:
                            System.out.println("Resultado: " + (num1 * 3.28084) + " pies");
                            break;
                        case 5:
                            System.out.println("Resultado: " + (num1 * 0.00220462) + " libras");
                            break;
                        case 6:
                            System.out.println("Resultado: " + (num1 * 0.264172) + " galones");
                            break;

                        default:
                            System.out.println("Conversión no válida.");
                    }
                    break;

                case 9:
                    System.out.println("Saliendo de la calculadora. ¡Hasta pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }


        }
        entrada.close(); // Cerrar Scanner después de salir del bucle
    }
}