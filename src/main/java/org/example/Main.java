package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Integrantes
        System.out.println("Jhon Murcia");
        System.out.println("Katherine Robayo");
        System.out.println("Oscar Gomes");

        //Ejemplos practicos

        Scanner entrada=new Scanner(System.in);
        System.out.println("Este es un programa que recoge los datos del usuario y los imprime");
        System.out.println("Ingrese su edad");
        byte edad=entrada.nextByte();

        System.out.println("Ingrese su año de nacimiento");
        short nacimiento=entrada.nextShort();

        System.out.println("Ingrese su saldo de cuenta bancaria");
        int saldo=entrada.nextInt();

        System.out.println("Ingrese su numero de identificacion");
        long id=entrada.nextLong();

        System.out.println("Ingrese su altura (m)");
        float altura=entrada.nextFloat();

        System.out.println("Ingrese su peso (Kg)");
        double peso=entrada.nextDouble();

        System.out.println("Ingrese su tipo sanguineo");
        char tipo_sanguineo=entrada.next().charAt(0);

        System.out.println("¿Su cuenta esta activa?");
        boolean cuenta_activa= entrada.nextBoolean();


        System.out.println("Datos del usuario");
        System.out.println("Edad: "+edad);
        System.out.println("Año de nacimiento: "+nacimiento);
        System.out.println("Saldo de su cuenta bancaria: $"+saldo);
        System.out.println("Numero de identificacion: "+id);
        System.out.println("Altura: "+altura+"m");
        System.out.println("Peso: "+peso+"Kg");
        System.out.println("Tipo sanguineo: "+tipo_sanguineo);
        System.out.println("Cuenta activa: "+cuenta_activa);


        entrada.close();

        }
    }
