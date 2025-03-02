package org.example;
import java.util.Scanner; //Importamos la clase Scanner para poder leer la entrada del usuario
import java.util.Random;// Importamos la clase Ramdon para que se generen numeros aleatorios

public class Ejercicio_3 { // se define la clase principal

    public static void main(String[] args) { //Metodo principal donde se inicia la ejecución del programa
        Scanner entrada = new Scanner(System.in); //Creamos un objeto escaner para leer la entrada del usuario
        Random  aleatorio = new Random();// creamos un objeto ramdon  para generar los números aleatorios

        int numeroSecreto = aleatorio.nextInt(100) + 1; // Generamos un número aleatorio de 1 a 100
        int intento; // variable para almacenar el número que ingresa el usuario
        int intentosMaximos = 10; // Definimos un número límite de intentos


        System.out.println("Bienvenid@ Este es un juego de adivinanza");
        System.out.println("He pensado en un número de 1 a 100. ¿puedes adivinar cuál es?"); // mensaje para el usuario
        System.out.println(" Tienes solo  " +  intentosMaximos + " intentos.");

        for (int intentos =1; intentos <= intentosMaximos; intentos++) { //Bucle for para limitar los intentos
            System.out.println("Intento #" + intentos + ": Ingresa un número:");// pedimos al usuario ingresar un número
             intento = entrada.nextInt(); // Leemos el número ingresado por el usuario


             if ( intento == numeroSecreto) { // Si el número ingresado es menor que el número secreto
                 System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");// Mensaje de éxito
                 return; //Finaliza el programa si acierta

             } else if ( intento > numeroSecreto) {// Si el número ingresado es mayor que el número secreto
                 System.out.println("Estas fri@, el número es menor.  Intenta nuevamente.");//Le damos una pista al usuario

             } else {// Si el número ingresado es igual  que el número secreto
                 System.out.println( " Estas fri@, el número es mayor. Intentalo nuevamente");//Le damos una pista al usuario

             }
        }
        //Si se agotan los intentos y no adivino
        System.out.println("Lo sentimos, has agotado todos tus intentos.El número era: ");

        entrada.close(); // ceramos la entrada.

        }
    }
