package org.example;

import java.util.Scanner; //Se importa la clase Scanner que permite la entrada de datos por parte del usuario

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);

        //Introduccion al juego
        System.out.println("¡HISTORIA!");
        System.out.println("Eres un aventurero que llega a un bosque encantado. Tienes que elegir entre dos caminos, y luego decidir cómo enfrentar el peligro que encuentras en tu elección.");
        System.out.println("¡Bienvenido al bosque encantado aventurero!");
        System.out.println("A continuacion tienes dos caminos por elegir"); //Primera variante del juego
        System.out.println("1. Sendero oscuro y misterioso");
        System.out.println("2. Un camino soleado y tranquilo");
        System.out.println("Elige una opcion (1 o 2): ");
        int camino =entrada.nextInt();

        switch (camino) { //Este switch se usa para mostrar y ejecutar los posibles resultados segun las opcines que escoja el usuario
            case 1: //Primer caso, el usuario escoge el sendero oscuro
                System.out.println("Has elegido el sendero oscuro, pero un momento se escuchan ruidos extraños... ¿Que podra ser?");
                System.out.println("¡Oh no! es un lobo gigantesco, dedide rapido, ¿Que haras?");
                System.out.println("1. Correr");
                System.out.println("2. Enfrentarlo con una antorcha");
                System.out.println("Elige una opcion: (1 o 2)");
                int decision1= entrada.nextInt();

                switch (decision1) { //switch anidado para analizar los posibles resultados en base a la opcion escogida por el usuario
                    case 1:
                        System.out.println("Intentas correr, pero el lobo es mas rapido ¡Has perdido!"); //Esta respuesta del usuario no fue la mejor, asi que automatucamente pierda y se finaliza la ejecucion del juego
                        break; //Se usa el break para romper la ejecucion del codigo
                    case 2:
                        System.out.println("Usas la antorcha para asustar el lobo y logras escapar");
                        System.out.println("Ahora vas caminando pero sientes una intensa hambre y necesitas comer algo urgente");
                        System.out.println("1. Miel de un panal que se encuentra en un arbol");
                        System.out.println("2. Bayas cercanas a un rio que se ven algo raras");
                        int decision3= entrada.nextInt();

                        switch (decision3){ //En base a que el usuario escogio el sendero oscuro y la antorcha se crea otra variable con 2 posibles finales, la muerte o la victoria
                            case 1:
                                System.out.println("Intentaste comer la miel, pero las abejas defendieron su panal y te atacaron ¡Has perdido!"); //Una mala eleccion muy cerca del final lleva al usuario a perder el juego
                                break;
                            case 2:
                                System.out.println("Afortunadamente las bayas eran comestibles, las consumes y logras llegar a tu destino aventurero ¡Has ganado!"); //Primer final alterno, el usuario gano el juego
                                break;
                            default:
                                System.out.println("Dudas mucho aventurero has muerto de hambre ¡Has perdido!"); //En caso de que el usuario inserte una opcion no valida automaticamente pierde el juego
                        }
                        break;
                    default:
                        System.out.println("Dudas demasiado... el lobo ataca ¡Has perdido!");
                        break;
                }
                break;
            case 2: //En caso de que al inicio el jugador escoja el camino soleado se presenta la siguiente variante
                System.out.println("Has elegido el camino soleado, todo es tranquilo, pero depronto...");
                System.out.println("¡Oh no! Un puente roto bloquea el paso, ¿Que haras?"); //Primera vairante de la 2 opcion
                System.out.println("1. Intertar saltarlo");
                System.out.println("2. Buscar otro camino");
                System.out.println("Elige una opcion: (1 o 2)");
                int decision2= entrada.nextInt(); //Esta variable guarda la opcion escogida por el usuario para ejecutar los posibles resultados de su eleccion

                switch (decision2){
                    case 1:
                        System.out.println("Saltas con todas tus fuerzas... ¡Y lo logras! ¡Has ganado!");
                        System.out.println("Ahora vas caminando pero sientes una intensa hambre y necesitas comer algo urgente"); //Tercera variante de la segunda opcion inicial
                        System.out.println("1. Miel de un panal que se encuentra en un arbol"); //Al escoger la opcion correcta se activa esta tercera variante que genera el segundo final del juego, ganar o morir
                        System.out.println("2. Bayas cercanas a un rio que se ven algo raras");
                        int decision4= entrada.nextInt();

                        switch (decision4){ //Este switch anidado se usa para
                            case 1:
                                System.out.println("Intentaste comer la miel, pero las abejas defendieron su panal y te atacaron ¡Has perdido!"); //Si el usuario escoge la opcion equivocada automaticamente pierde
                                break;
                            case 2:
                                System.out.println("Afortunadamente las bayas eran comestibles, las consumes y logras llegar a tu destino aventurero ¡Has ganado!"); //Segun final alterno del juego
                                break;
                            default:
                                System.out.println("Dudas mucho aventurero has muerto de hambre ¡Has perdido!"); //En caso de que se inserte una opcion no valida el usuario pierde automaticamente
                        }

                        break;
                    case 2:
                        System.out.println("Buscas otro camino, pero te pierdes en el bosque ¡Has perdido!");
                        break;
                    default:
                        System.out.println("Te quedas indeciso muhco tiempo... oscurece y te pierdes. ¡Has perdido!");
                }
                break;
            default:
                System.out.println("No has elegido ningun camino, te quedaste atrapado en la entrada del bosque ¡Has perdido!");
        }
        System.out.println("¡Gracias por jugar!"); //Mensaje de agradecimiento por la ejecucion del juego independientemente del final que tuvo el usuario
        entrada.close(); //Se cierra el objeto Scanner


    }
}

