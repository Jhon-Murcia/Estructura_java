package org.example;

    import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        System.out.println("Este es el ejercicio 2 de tipos de datos");
        System.out.println("Este es un simulador de un banco que hace uso de operadores aritmeticos, logicos y opeeracionales");

        Scanner entrada=new Scanner(System.in);

        int edad_minima=18;
        int pin=1234;
        double saldo=20000;

        System.out.println("Por favor ingrese su edad");
        int edad=entrada.nextInt();

        if (edad<edad_minima){
            System.out.println("Acceso denegado, debe ser mayor de edad para poder ingresar");
        } else{
            System.out.println("Por favor ingrese su pin de 4 digitos");
            int ingresar_pin= entrada.nextInt();

            if (ingresar_pin == pin) {
                System.out.println("¡Bienvenido a su cuenta bancaria!");
                boolean continuar = true;

                while (continuar) {
                    // Mostrar menú de opciones
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Salir");
                    System.out.print("Opción: ");
                    int opcion = entrada.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo actual es: $" + saldo);
                            break;
                        case 2:
                            System.out.print("Ingrese el monto a retirar: ");
                            double monto = entrada.nextDouble();

                            // Validar si el usuario tiene suficiente saldo
                            if (monto > 0 && monto <= saldo) {
                                saldo -= monto; // Operador aritmético
                                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
                            } else {
                                System.out.println("Saldo insuficiente, es imposible retirar el monto deseado.");
                            }
                            break;
                        case 3:
                            System.out.println("Gracias por usar nuestro servicio. ¡Hasta pronto!");
                            continuar = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                    }
                }
            } else {
                System.out.println("PIN incorrecto. Acceso denegado.");
            }
        }

        entrada.close();
        }
    }

