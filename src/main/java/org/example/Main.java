package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Integrantes
        //System.out.println("Jhon Murcia");
        //System.out.println("Katherine Robayo");
        //System.out.println("Oscar Gomes");

        //Ejemplo practico utilizando los tipos de datos primitivos

        Scanner entrada = new Scanner(System.in);


        //se pide el nombre del usuario
        System.out.println("Ingresa tu nombre: ");
        String nombreUsuario = entrada.nextLine();


        // Mensaje de Bienvenida y explicación de lo que se va a realizar
        System.out.println("\nBienvenid@, " + nombreUsuario  + "Vamos a trabajar algunas operaciones con diferentes tipos de datos primitivos en java, en donde responderas algunas preguntas. \n");

        System.out.println("Ingresa tu edad en numeros : ");
        byte edad = entrada.nextByte();

        System.out.println("Ingresa el año actual sin puntos ni signos:");
        short year = entrada.nextShort();

        System.out.println("Ingresa el número aproximado de la cantidad de población de tu municipio: ");
        int poblacionCiudad = entrada.nextInt();

        System.out.println("Ingresa el número aproximado de pasos que das en un año");
        long pasos_en_un_anio = entrada.nextLong();

        System.out.println("Ingresa el precio de un producto: ");
        float precioProducto = entrada.nextFloat();


        System.out.println("Ingresa el valor de π con solo 4 decimales");
        String piInput = entrada.next();
        piInput = piInput.replace(",", ".");
        double pi = Double.parseDouble(piInput);

        System.out.print("¿Eres mayor de edad? Escribe (true, Si/false, No): ");
        boolean esMayorDeEdad =entrada.nextBoolean();

        System.out.print("Ingresa la inicial de tu nombre: ");
        char inicial = entrada.next().charAt(0);


        String mensaje = "Gracias por participar en este ejercicio!";


        // Operaciones con las variables ingresadaa

        int nuevaEdad = edad + 5;
        long doblePasos = pasos_en_un_anio * 2;
        float descuento = precioProducto * 0.10f;
        float precioFinal = precioProducto - descuento;
        double areaCirculo = pi * Math.pow(10, 2);
        boolean anioBisiesto = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
        char siguienteLetra = (char) (inicial + 1);
        String mensaje1 = mensaje + "Tu inicial es: " + inicial;

        DecimalFormat formato = new DecimalFormat(" #,###");

        // Mostrar o imprimir los resultados
        System.out.println("\nRespuestas obtenidas:");
        System.out.println("Edad en 5 años:" + nuevaEdad);
        System.out.println("Doble de los pasos dados en un año:" + doblePasos +  "pasos");
        System.out.println(" Descuento del 10%  es : " + formato.format((descuento)));
        System.out.println("El precio final con el descuento es de: "+formato.format(precioFinal));
        System.out.println("Area de un círculo de radio 10 : " + areaCirculo);
        System.out.println("¿El año es bisiesto?" + anioBisiesto);
        System.out.println(" la siguiente letra después de '" + inicial + "' es: " + siguienteLetra);
        System.out.println(mensaje1);

        //cerramos el scanner
        entrada.close();

    }
}