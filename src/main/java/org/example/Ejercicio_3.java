package org.example;
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
            System.out.println("Hello World!");
            Scanner scanner = new Scanner(System.in);

            int numero;
            boolean esPrimo = true;

            System.out.println("Ingrese un numero entero");
            numero = scanner.nextInt();

            if(numero<=1){
                esPrimo = false;

            } else {
                for(int i = 2; i <= numero/2;i++){
                    if(numero % i ==0){
                        esPrimo = false;
                        break;
                    }
                }

            }

            //estructura de control con if-else
            if(esPrimo){
                System.out.println(numero+ "es numero primo");

            } else {
                System.out.println(numero + "no es numero primo");
            }

            scanner.close();
        }
    }
