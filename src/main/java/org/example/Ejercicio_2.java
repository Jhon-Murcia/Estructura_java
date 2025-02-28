package org.example;

    import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        //Especificacion del código
        System.out.println("Este es el ejercicio 2 de tipos de datos");
        System.out.println("Este es un simulador de un banco que hace uso de operadores aritmeticos, logicos y operacionales");

        //Declaracion del scanner que se usara para que el usuario pueda ingresar datos
        Scanner entrada=new Scanner(System.in);

        //Declaracion de las variables principales
        int edad_minima=18;
        int pin=1234;
        double saldo=20000;

        //Solicitacion de edad del usuario
        System.out.println("Por favor ingrese su edad");
        int edad=entrada.nextInt();

        //Verificación de edad para comprobar si el usuario es mayor o menor de edad
        if (edad<edad_minima){
            //Si la edad ingresada por el usuario es menor a 18 arroja el siguiente mensaje
            System.out.println("Acceso denegado, debe ser mayor de edad para poder ingresar");
        } else{
            //Solicita el pin de la cuenta bancaria, en este caso por ser un ejemplo el pin correcto es 1234
            System.out.println("Por favor ingrese su pin de 4 digitos");
            int ingresar_pin= entrada.nextInt();

            //Una vez ingresado el pin se verifica que sea el correcto, y si lo es tendra acceso a la cuenta
            if (ingresar_pin == pin) {
                System.out.println("¡Bienvenido a su cuenta bancaria!");
                boolean continuar = true;

                while (continuar) {
                    // Menu de opciones
                    System.out.println("\n¿Que deseas hacer hoy?:");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Salir");
                    System.out.print("Opción: ");
                    int opcion = entrada.nextInt();

                    //Con este switch dependiendo de la opcion escogida por el usuario de mostrara el mensaje correspodiente
                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo actual es: $" + saldo);
                            break;
                        case 2:
                            System.out.print("Ingrese el monto a retirar: ");
                            System.out.println("Ten en cuenta que debes ingresar el monto separado por coma (,) o si lo deseas el monto de largo ej: 20000 o 20,000");
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

