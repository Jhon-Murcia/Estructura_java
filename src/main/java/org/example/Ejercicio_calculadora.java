package org.example;

import java.util.Scanner;

public class Ejercicio_calculadora {
    public static void main(String[] args) {

        System.out.println("Este ejercicio ejecuta una calculadora que realiza 8 operaciones");

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potenciacion");
            System.out.println("6. Raiz cuadrada");
            System.out.println("7. Modulo");
            System.out.println("8. Conversion de grados Celsius a Fahrenheit");
            System.out.println("9. Salir");

            int opcion = entrada.nextInt();
            double num1, num2;

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer numero");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Ingresa el primer numero");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Ingresa el primer numero");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = entrada.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Ingresa el primer numero");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = entrada.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.println("Ingresa el numero");
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
                    System.out.print("Ingrese la temperatura en grados Celsius: ");
                    num1 = entrada.nextDouble();
                    double fahrenheit = (num1 * 9 / 5) + 32;
                    System.out.println("Temperatura en Fahrenheit: " + fahrenheit + "°F");
                    break;
                case 9:
                    System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            if (opcion != 9) {
                entrada.nextLine(); // Limpiar el buffer antes de leer la respuesta del usuario

                String respuesta;
                do {
                    System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                    respuesta = entrada.nextLine().trim();

                    if (respuesta.isEmpty()) {
                        System.out.println("Por favor, ingrese una respuesta válida (s/n).");
                    }
                } while (respuesta.isEmpty());

                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println(" Saliendo de la calculadora. ¡Hasta luego!");
                }
            }
        }

        entrada.close(); // Cerrar Scanner después de salir del bucle
    }
}