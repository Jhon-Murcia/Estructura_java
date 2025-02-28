package org.example;// define el paquete del proyecto

import java.util.Scanner;//importa la clase scanner para leer los datos del usuario

public class Ejercicio_4 {//definicion de la clase principal

    public static void main(String[] args) {//metodo principal donde inicia la ejecucion principal
        System.out.println("Hello World!");//mensaje inicial
        //se usa un bloque try-whit-resources para manejar el scanner automaticamente
        try (Scanner entrada = new Scanner(System.in)) {
            int PreguntaCorrecta = 0;//contador de respuestas correctas
            // La evaluciacion generada sera sobre cultura general
            // Preguntas y respuestas
            // se inicia un siclo for para hacer 10 preguntas
            for (int i = 1; i <= 10; i++) {
                System.out.println("Pregunta" + i + ":");

                switch (i) {
                    case 1 -> {// pregunta 1
                        System.out.println(" Cual es el pais mas grande del mundo?");
                        System.out.println("A. Rusia");
                        System.out.println("B. Canadá");
                        System.out.println("C. China");
                        System.out.print("Respuesta: ");
                        int Pregunta1 = entrada.nextInt();
                        if (Pregunta1 == A)// respuesta correcta: Rusia
                            PreguntaCorrecta++;
                    }

                    case 2 -> {//Pregunta 2
                        System.out.println(" Cuantos planetas tiene el sistema solar?");
                        System.out.println("A. 7");
                        System.out.println("B. 8");
                        System.out.println("C. 9");
                        System.out.print("Respuesta: ");
                        int pregunta2 = entrada.nextInt();
                        if (pregunta2 == B)//respuesta correcta: 8
                            PreguntaCorrecta++;
                    }

                    case 3 -> {//Pregunta 3
                        System.out.println(" Cual es el río mas largo del mundo?");
                        System.out.println("A. Amazonas");
                        System.out.println("B. Nilo");
                        System.out.println("C. Bogota xd");
                        System.out.print("Respuesta: ");
                        int pregunta3 = entrada.nextInt();
                        if (pregunta3 == A)//respuesta correcta: Amazonas
                            PreguntaCorrecta++;
                    }

                    case 4 -> {//pregunta 4
                        System.out.println(" Quien pinto la Mona Lisa?");
                        System.out.println("A. Miguel Angel");
                        System.out.println("B. Leonardo da Vinci");
                        System.out.println("C. Vincent van Gogh");
                        System.out.print("Respuesta: ");
                        int pregunta4 = entrada.nextInt();
                        if (pregunta4 == B)//respuesta correcta Leonardo da Vinci
                            PreguntaCorrecta++;
                    }

                    case 5 -> {//pregunta 5
                        System.out.println(" Que gas respiramos?");
                        System.out.println("A. Dioxido de carbono");
                        System.out.println("B. Oxigeno");
                        System.out.println("C. Nitrogeno");
                        System.out.print("Respuesta: ");
                        int pregunta5 = entrada.nextInt();
                        if (pregunta5 == B)//respuesta correcta: Oxigeno
                            PreguntaCorrecta++;
                    }

                    case 6 -> {//pregunta 6
                        System.out.println(" Cual es el animal terrestre mas rapido?");
                        System.out.println("A. Guepardo");
                        System.out.println("B. Leon");
                        System.out.println("C. Tigre");
                        System.out.print("Respuesta: ");
                        int pregunta6 = entrada.nextInt();
                        if (pregunta6 == A)//respuesta correcta: Guepardo
                            PreguntaCorrecta++;
                    }

                    case 7 -> {//pregunta 7
                        System.out.println(" Cual es el oceano mas grande?");
                        System.out.println("A. Atlantico");
                        System.out.println("B. Indico");
                        System.out.println("C. Pacifico");
                        System.out.print("Respuesta: ");
                        int pregunta7 = entrada.nextInt();
                        if (pregunta7 == C)//respuesta correcta: Pacifico
                            PreguntaCorrecta++;
                    }

                    case 8 -> {//pregunta 8
                        System.out.println("En que pais se encuentran las piramides de Giza?");
                        System.out.println("A. Peru");
                        System.out.println("B. Egipto");
                        System.out.println("C. Mexico");
                        System.out.print("Respuesta: ");
                        int pregunta8 = entrada.nextInt();
                        if (pregunta8 == B)//respuesta correcta: Egipto
                            PreguntaCorrecta++;
                    }

                    case 9 -> {//pregunta 9
                        System.out.println("Cual es el idioma mas hablado en el mundo?");
                        System.out.println("A. Ingles");
                        System.out.println("B. Español");
                        System.out.println("C. Chino mandarín");
                        System.out.print("Respuesta: ");
                        int pregunta9 = entrada.nextInt();
                        if (pregunta9 == C)//respuesta correcta: Chino Mandarin
                            PreguntaCorrecta++;
                    }

                    case 10 -> {//pregunta 10
                        System.out.println("Cual es la capital de Francia?");
                        System.out.println("A. Paris");
                        System.out.println("B. Londres");
                        System.out.println("C. Roma");
                        System.out.print("Respuesta: ");
                        int pregunta10 = entrada.nextInt();
                        if (pregunta10 == A)// respuesta correcta: paris
                            PreguntaCorrecta++;
                    }
                }
            }

            // Resultado del quiz
            System.out.println("\nRespuestas correctas: " + PreguntaCorrecta);
            //evaluacion de los resultados
            if (PreguntaCorrecta <= 5) {
                System.out.println("Quiz Reprobado.");
            } else if (PreguntaCorrecta >= 6 && PreguntaCorrecta <= 9) {
                System.out.println(" Quiz Aprobado.");
            } else if (PreguntaCorrecta == 10) {
                System.out.println("¡Felicidades! Eres un genio.");
            }
        }// el scanner se cierra automaticamente gracias a try-with-resources
    }
}

