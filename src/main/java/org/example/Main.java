package org.example; //Paquete en donde se encuentra la clase
import java.util.Scanner; //Importa la clase Scanner para la entrada de datos
import java.text.DecimalFormat; //Importa DecimalFormat para formatear los números


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { //declaración de la clase principal
    public static void main(String[] args) { //Metodo principal donde se ejecuta el programa

        //Integrantes del Equipo
        //System.out.println("Jhon Murcia");
        //System.out.println("Katherine Robayo");
        //System.out.println("Oscar Gomes");

        //Ejemplo practico utilizando los tipos de datos primitivos

        Scanner entrada = new Scanner(System.in); //Definimos el objeto Scanner para recibir la entrada del usuario


        //se pide el nombre del usuario
        System.out.println("Ingresa tu nombre: ");
        String nombreUsuario = entrada.nextLine(); // Guarda el nombre ingresado en una variable tipo String


        // Muestra un mensaje de Bienvenida que incluye el nombre del usuario  y explicación de lo que se va a realizar
        System.out.println("\nBienvenid@, " + nombreUsuario  + "Vamos a trabajar algunas operaciones con diferentes tipos de datos primitivos en java, en donde responderas algunas preguntas. \n");

        // Se solicita la edad del usuario en forma númerica
        System.out.println("Ingresa tu edad en numeros : ");
        byte edad = entrada.nextByte(); // Guarda la edad ingresada como un tipo de dato byte

        //Solicita al usuario ingresar el año actual sin puntos ni signos
        System.out.println("Ingresa el año actual sin puntos ni signos:");
        short year = entrada.nextShort(); // Guarda el año en una variable de tipo Short

        // Solicita  al usuario la población aproximada de su Municipio
        System.out.println("Ingresa el número aproximado de la cantidad de población de tu municipio: ");
        int poblacionCiudad = entrada.nextInt(); // Guarda la poblacion ingresada en una variable tipo Int

        // Se solicita el número aproximado de pasos que da el usuario en un año
        System.out.println("Ingresa el número aproximado de pasos que das en un año");
        long pasos_en_un_anio = entrada.nextLong(); //Guarda el número de pasos en una variable de tipo long

        // Solicita al usuario un precio de un producto cualquiera
        System.out.println("Ingresa el precio de un producto: ");
        float precioProducto = entrada.nextFloat(); // Guarda el percio ingresado en una variable tipo float

        // Se solicita el valor de π con cuatro decimales y se convierte  en tipo double
        System.out.println("Ingresa el valor de π con solo 4 decimales");
        String piInput = entrada.next(); //Guarda la entrada como String
        piInput = piInput.replace(",", "."); //Remplaza la coma por un punto en caso de que el formato sea incorrecto
        double pi = Double.parseDouble(piInput); // Convierte el String a tipo double

        // Se pregunta al usuario si es mayor de edad con una respuesta  booleana
        System.out.print("¿Eres mayor de edad? Escribe (true, Si/false, No): ");
        boolean esMayorDeEdad =entrada.nextBoolean(); //Guarda la respuesta en una variable booleana

        //Se solicita al usuario la inicial de su nombre
        System.out.print("Ingresa la inicial de tu nombre: ");
        char inicial = entrada.next().charAt(0); // Guarda la primera letra ingresada como tipo char

        // se define un mensaje de agradecimiento
        String mensaje = "Gracias por participar en este ejercicio!";


        // Operaciones con las variables ingresadaa

        int nuevaEdad = edad + 5; //Calcula la edad que tendra en 5 años
        long doblePasos = pasos_en_un_anio * 2; //Calcula el doble de los pasos anuales
        float descuento = precioProducto * 0.10f; //Calcula el 10% de descuento sobre el precio del producto
        float precioFinal = precioProducto - descuento; // Resta el descuento al precio original
        double areaCirculo = pi * Math.pow(10, 2); // Calcula el área de un circulo con radio  10 (A = π * r²)
        boolean anioBisiesto = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0); // Determina si el año ingresado es Bisiesto  con una condición lógica
        char siguienteLetra = (char) (inicial + 1); //Obtiene la siguiente letra en el alfabeto después de la inicial ingresada
        String mensaje1 = mensaje + "Tu inicial es: " + inicial; // agrega al mensaje de agradecimiento  la inial del usuario

        //Se crea un formato para mostrar los números con separadores de miles
        DecimalFormat formato = new DecimalFormat(" #,###");

        // Mostrar o imprimir los resultados en la consola
        System.out.println("\nRespuestas obtenidas:");
        System.out.println("Edad en 5 años:" + nuevaEdad);
        System.out.println("Doble de los pasos dados en un año:" + doblePasos +  "pasos");
        System.out.println(" Descuento del 10%  es : " + formato.format((descuento)));
        System.out.println("El precio final con el descuento es de: "+formato.format(precioFinal));
        System.out.println("Area de un círculo de radio 10 : " + areaCirculo);
        System.out.println("¿El año es bisiesto?" + anioBisiesto);
        System.out.println(" la siguiente letra después de '" + inicial + "' es: " + siguienteLetra);
        System.out.println(mensaje1); //Muestra el mensaje final con la inicial del usuario

        //cerramos el scanner
        entrada.close();

    }
}