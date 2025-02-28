package org.example;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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
        Random aleatorio = new Random();

        //se pide el nombre del jugador o jugadora
        System.out.println("Ingresa tu nombre: ");
        String nombreJugador = entrada.nextLine();


        // Intentos por pregunta
        int intentosMaximos = 2;
        short puntos = 0;

        // Datos correctos
        int patasdearana = 8;
        long edadTierra = 4500000000L;
        float aguadelCuerpoH = 60.5f;
        double pi = 3.1416;
        char letraAleatoria = (char) (aleatorio.nextInt(26) + 'A');

        // Lista de preguntas con respuestas y tipos de datos
        List<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(new Pregunta("¿Cuántas patas tiene una araña?", patasdearana));
        preguntas.add(new Pregunta("¿Qué edad aproximadamente tiene la Tierra?", edadTierra));
        preguntas.add(new Pregunta("¿Cuánto porcentaje del cuerpo humano es agua?", aguadelCuerpoH));
        preguntas.add(new Pregunta("¿Cuál es el valor de π (pi) con 4 decimales?", pi));
        preguntas.add(new Pregunta("Pregunta Sorpresa: ¿Qué letra apareció aleatoriamente?", letraAleatoria));

        // Barajar el orden de las preguntas
        Collections.shuffle(preguntas);

        System.out.println("\n🎮 ¡Bienvenido, " + nombreJugador + "! Las preguntas aparecerán en orden aleatorio.");
        System.out.println("Tienes " + intentosMaximos + " intentos por cada pregunta. ¡Buena suerte!\n");

        // Iterar sobre las preguntas en el orden barajado
        for (Pregunta pregunta : preguntas) {
            int intentos = intentosMaximos;
            while (intentos > 0) {
                System.out.println("\n" + pregunta.texto);
                System.out.print(" Respuesta: ");

                if (pregunta.respuesta instanceof Integer && entrada.hasNextInt()) {
                    int respuestaUsuario = entrada.nextInt();
                    entrada.nextLine(); // Limpiar buffer

                    if (respuestaUsuario == (int) pregunta.respuesta) {
                        puntos += 10;
                        System.out.println(" ¡Correcto! Obtienes 10 puntos.");
                        break;
                    }

                } else if (pregunta.respuesta instanceof Long && entrada.hasNextLong()) {
                    long respuestaUsuario = entrada.nextLong();
                    entrada.nextLine();

                    if (Math.abs(respuestaUsuario - (long) pregunta.respuesta) < 500000000) {
                        puntos += 10;
                        System.out.println("¡Correcto! Obtienes 10 puntos.");
                        break;
                    }

                } else if (pregunta.respuesta instanceof Float && entrada.hasNextFloat()) {
                    float respuestaUsuario = entrada.nextFloat();
                    entrada.nextLine();

                    if (Math.abs(respuestaUsuario - (float) pregunta.respuesta) < 5) {
                        puntos += 10;
                        System.out.println(" ¡Correcto! Obtienes 10 puntos.");
                        break;
                    }

                } else if (pregunta.respuesta instanceof Double && entrada.hasNextDouble()) {
                    double respuestaUsuario = entrada.nextDouble();
                    entrada.nextLine();

                    if (Math.abs(respuestaUsuario - (double) pregunta.respuesta) < 0.01) {
                        puntos += 10;
                        System.out.println("¡Correcto! Obtienes 10 puntos.");
                        break;
                    }

                } else if (pregunta.respuesta instanceof Character) {
                    char respuestaUsuario = entrada.next().charAt(0);
                    entrada.nextLine();

                    if (Character.toUpperCase(respuestaUsuario) == (char) pregunta.respuesta) {
                        puntos += 10;
                        System.out.println(" ¡Correcto! Obtienes 10 puntos.");
                        break;
                    }
                } else {
                    System.out.println(" Entrada inválida. Intenta de nuevo.");
                    entrada.next(); // Limpiar entrada incorrecta
                    continue;
                }

                intentos--;
                if (intentos > 0) {
                    System.out.println(" Incorrecto. Intentos restantes: " + intentos);
                } else {
                    System.out.println(" Incorrecto. La respuesta correcta era: " + pregunta.respuesta);
                }
            }
        }

        // Mostrar puntuación final
        System.out.println("\n Puntuación final: " + puntos);
        if (puntos >= 30) {
            System.out.println(" ¡Felicidades, " + nombreJugador + "! Obtuviste " + puntos + " puntos.");
        } else {
            System.out.println(" Lo siento, " + nombreJugador + ". Solo conseguiste " + puntos + " puntos.");
            System.out.println("Inténtalo nuevamente y mejora tu puntuación.");
        }

        System.out.println("\n🎮 ¡Gracias por jugar!");
        entrada.close();
    }

    // Clase para manejar preguntas de distintos tipos de datos
    static class Pregunta {
        String texto;
        Object respuesta;

        public Pregunta(String texto, Object respuesta) {
            this.texto = texto;
            this.respuesta = respuesta;


        }
    }
}