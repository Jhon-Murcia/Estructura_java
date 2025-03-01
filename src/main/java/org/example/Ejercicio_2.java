package org.example;

    import java.util.Scanner; //Importacion del Scanner para la entrada de datos por parte del usuario

public class Ejercicio_2 {
    public static void main(String[] args) {

        //Especificacion del sobre el proposito del código
        System.out.println("Este es el ejercicio 2 de tipos de datos");
        System.out.println("Este es un simulador de un banco que hace uso de operadores aritmeticos, logicos y operacionales");

        //Creacion del scanner que se usara para que el usuario pueda ingresar los datos
        Scanner entrada=new Scanner(System.in);

        //Declaracion de las variables principales
        int edad_minima=18; //Edad minima requerida para ingresar con exito a la cuenta bancaria
        int pin=1234; //Pin correcto de acceso a la cuenta
        double saldo=20000; //Saldo inicial de ejemplo para la cuenta bancaria

        //Solicitacion de edad del usuario
        System.out.println("Por favor ingrese su edad");
        int edad=entrada.nextInt(); //Lectura de la edad ingresada por el usuario

        //Verificación de edad para comprobar si el usuario es mayor o menor de edad
        if (edad<edad_minima){
            //Si la edad ingresada por el usuario es menor a 18 arroja el siguiente mensaje
            System.out.println("Acceso denegado, debe ser mayor de edad para poder ingresar");
        } else{
            //Solicita el pin de la cuenta bancaria, en este caso por ser un ejemplo el pin correcto es 1234
            System.out.println("Por favor ingrese su pin de 4 digitos");
            int ingresar_pin= entrada.nextInt(); //Lectura del pin ingresado por el usuario

            //Una vez ingresado el pin se verifica que sea el correcto, y si lo es tendra acceso a la cuenta
            if (ingresar_pin == pin) {
                System.out.println("¡Bienvenido a su cuenta bancaria!");
                boolean continuar = true; //Variable de control para iniciar el ciclo while

                while (continuar) {
                    // A continuacion se muestra el menu de opciones para que el usuario decida que desea realizar
                    System.out.println("\n¿Que deseas hacer hoy?:"); // \n Se agrega para insertar un salto de linea
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Salir");
                    System.out.print("Opción: ");
                    int opcion = entrada.nextInt();

                    //Con este switch dependiendo de la opcion escogida por el usuario de mostrara el mensaje correspodiente
                    switch (opcion) {
                        case 1: //Opcion para consultar el saldo de la cuenta
                            System.out.println("Su saldo actual es: $" + saldo); //Muestra el saldo disponible en la cuenta
                            break; // Break se agrega para que se rompa la ejecucion del codigo y no se ejecuten los demas casos y no se generen conflictos con la ejecucion del codigo
                        case 2: //Opcion para retirar dinero de la cuenta
                            System.out.print("Ingrese el monto a retirar: ");
                            System.out.println("Ten en cuenta que debes ingresar el monto separado por coma (,) o si lo deseas el monto de largo ej: 20000 o 20,000");
                            double monto = entrada.nextDouble(); //Lectura del monto a retirar

                            // Validacion si el monto a retirar es mayor al saldo disponible en la cuenta
                            if (monto > 0 && monto <= saldo) {
                                saldo -= monto; // Descuento del monto al saldo de la cuenta
                                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo); //Mensaje de confirmacion del retiro exitoso
                            } else {
                                System.out.println("Saldo insuficiente, es imposible retirar el monto deseado."); //Mensaje que indica que el saldo es insuficiente
                            }
                            break;
                        case 3: //Opcion para salir del programa
                            System.out.println("Gracias por usar nuestro servicio. ¡Hasta pronto!"); //Mensaje de despedida
                            continuar = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente."); //Mensaje de error en caso de que el usuario inserte una opcion que no se encuentra en el menu
                    }
                }
            } else {
                System.out.println("PIN incorrecto. Acceso denegado."); //Mensaje que indica que el pin que introdujo el usuario es incorrecto
            }
        }

        entrada.close(); //Cierre del Scanner
        }
    }

