# Estructura_java
INTEGRANTES: 
Jhon Sebastian Murcia Romero 

Angie Katherine Robayo Angel


DESCRIPCIÓN DEL PROYECTO 

El presente proyecto se desarrolló utilizando dos ramas ( main y develop ), con el propósito de generar cambios y mantener un flujo de trabajo estructurado. Este consta de dos fases principales:
    En la primera fase, se desarrolló un ejercicio interactivo en la clase principal ( Main ), donde se utilizaron tipos de datos primitivos en Java. Además, se implementaron tres ejercicios adicionales en archivos separados ( Ejercicio_2, Ejercicio_3 y Ejercicio_4 ). En el Ejercicio_2 , se trabajó con operadores aritméticos, lógicos y relacionales, mientras que en los Ejercicios 3 y 4 , se implementaron estructuras de control para la toma de decisiones y la ejecución de bucles.
    En la segunda fase, se desarrolló una calculadora que permite al usuario realizar seis operaciones básicas y conversiones de unidades. Este programa interactivo facilita la realización de cálculos sencillos, brindando una experiencia intuitiva para el usuario.

FUNCIONALIDAD 


Ejercicio de Datos primitivos

Este programa interactivo solicita información al usuario y realiza diversas operaciones utilizando distintos tipos de datos primitivos en Java. A través de preguntas y cálculos, el usuario experimenta cómo se manejan valores numéricos, caracteres y booleanos en un programa.

Pasos para el funcionamiento

1. Se muestra un mensaje de bienvenida donde se explica el propósito del programa.
2. Se importa y se inicializa un objeto Scannerpara permitir la entrada de datos por parte del usuario.
3. Se solicita información básica al usuario, incluyendo:
   Nombre (tipo String)
   Edad (tipo byte)
   Año actual (tipo short)
   Población aproximada de su municipio (tipo int)
   Cantidad aproximada de pasos en un año (tipo long)
   Precio de un producto (tipo float)
   Valor de π con cuatro decimales (tipo double)
   Si es mayor de edad o no (tipo boolean)
   Inicial de su nombre (tipo char)
4. Se realizan diversas operaciones con los datos ingresados:
   Cálculo de la edad en cinco años.
   Doble de los pasos anuales.
   Cálculo del 10% de descuento sobre el precio del producto y el precio final con descuento.
   Cálculo del área de un círculo con radio 10.
   Verificación de si el año ingresado es bisiesto.
   Obtención de la siguiente letra en el alfabeto después de la inicial ingresada.
   Construcción de un mensaje personalizado con la inicial del usuario.
5. Se formatean los números para que los valores monetarios tengan separadores de millas.
6. Se muestran en pantalla los resultados de cada operación.
7.  Finalmente, el programa imprime un mensaje de despedida y cierra el Scannerpara liberar recursos.


EJERCICIO CON OPERADORES ARITMÉTICOS, LÓGICOS Y RACIONALES 

Este programa simula el acceso a una cuenta bancaria, permitiendo al usuario consultar su saldo, retirar dinero y salir del sistema. Para ello, hace uso de estructuras de control condicional ( if-elsey switch) y un ciclowhile que mantiene el menú activo hasta que el usuario decida salir.

Pasos para el funcionamiento

1. Se muestra un mensaje de bienvenida explicando el propósito del programa.
2. Se importa y se inicializa un objeto Scannerpara permitir la entrada de datos por parte del usuario.
3. Se declaran variables esenciales como la edad mínima para acceder (18 años), el PIN de seguridad (1234) y un saldo inicial de $20,000.
4. Se solicita la edad del usuario para verificar si cumple con el requisito mínimo de 18 años. Si es menor, se muestra un mensaje de acceso denegado y el programa termina.
5. Si la edad es válida, se solicita el ingreso del PIN.
6. Si el PIN es incorrecto, se muestra un mensaje de error y el acceso es denegado. Si el PIN es correcto, el usuario accede al sistema bancario.
7. Dentro del sistema bancario, se muestra un menú de opciones con tres alternativas:
   Consultar saldo: Muestra el saldo disponible en la cuenta.
   Retirar dinero: Solicita el monto a retirar y verifica si hay fondos suficientes. Si es posible, se descuenta del saldo y se muestra el nuevo total; Si no, se muestra un mensaje de saldo insuficiente.
   Salir: Finaliza el programa con un mensaje de despedida.
8. El programa se mantiene en ejecución gracias a un ciclowhile , permitiendo al usuario realizar múltiples operaciones hasta que seleccione la opción de salir.
9. Cuando el usuario decide salir, el programa muestra un mensaje de despedida y se cierra el Scannerpara liberar recursos.

EJERCICIOS CON ESTRUCTURAS DE CONTROL

EJERCICIO CON IF ,ELSE Y CICLO FOR 

Este ejercicio utiliza Scanner, Randomy un bucle para crear un juego interactivo en el que el usuario debe adivinar un número secreto generado aleatoriamente. El programa limita la cantidad de intentos y brinda pistas para ayudar al usuario a encontrar la respuesta correcta.

Pasos para el funcionamiento 

1.  Se muestra un mensaje de bienvenida y se explica la dinámica del juego.
2. Se importan las clases Scannery Randompara permitir la entrada de datos del usuario y la generación del número aleatorio.
3. Se genera un número aleatorio entre 1 y 100 utilizando Random.nextInt(100) + 1.
4. Se establece un límite de intentos de 10 oportunidades para adivinar el número secreto.
5.  Se inicia un bucle for , que se repetirá hasta que el usuario acierte o se acaben los intentos.
6.  En cada intento, el usuario debe ingresar un número , el cual es leído mediante Scanner.
7. Se realiza una comparación con el número secreto:
   Si el usuario acierta , se muestra un mensaje de felicitación y el programa termina.
   Si el número ingresado es mayor al número secreto, el programa indica que el número es menor.
   Si el número ingresado es menor , el programa informa que el número es mayor.
8. Si el usuario no adivina en los 10 intentos, se muestra un mensaje revelando el número secreto.
9.  Se cierra el Scanner al finalizar el programa para liberar recursos y evitar posibles errores.

EJERCICIO CON SWITCH

Este ejercicio hace uso unicamente de switch para su ejecucion, trata de un juego de ficcion y aventura donde el usuario es un aventurero que se enfrentara a varios peligros en medio de un bosque

Pasos para el funcionamiento

1. Se importa java.util.Scanner para permitir la entrada de datos del usuario desde el teclado, y se crea el objeto Scanner, en este caso se llamara entrada.
2. Se muestra un mensaje con la introducción explicando que el jugador es un aventurero en un bosque encantado y debe tomar decisiones para avanzar en la historia.
3. Selección del camino: Se le presentan dos opciones al jugador:
   Tomar un sendero oscuro y misterioso.
   Elegir un camino soleado y tranquilo.
   Se hace uso de un switch para determinar la ruta elegida.
4. Rama del sendero oscuro: Si el usuario elige el sendero oscuro (case 1), se enfrenta a un lobo gigante y debe decidir entre:
   Correr.
   Enfrentarlo con una antorcha.
   Se usa un switch anidado para manejar esta decisión.
5. Consecuencias del encuentro con el lobo:
   Si elige correr, el lobo lo alcanza y pierde.
   Si usa la antorcha, logra escapar y avanza a una segunda decisión.
6. Elección de comida tras escapar del lobo: Luego de huir, el jugador tiene hambre y debe elegir entre:
   Comer miel de un panal.
   Comer bayas cercanas al río.
   Si elige la miel, las abejas lo atacan y pierde automaticamente
   Si elige las bayas, son comestibles y gana automaticamente
7. Rama del camino soleado: Si el usuario elige el camino soleado (case 2), se encuentra con un puente roto y debe decidir entre:
   Intentar saltarlo.
   Buscar otro camino.
   Se usa otro switch anidado para manejar esta decisión.
8. Consecuencias de la decisión del puente:
   Si intenta saltarlo, lo logra y avanza a la decisión de comida (igual que en la ruta del lobo).
   Si busca otro camino, se pierde en el bosque y pierde la partida.
9. Por ultimo se muestra un mensaje de agradecimiento por jugar y se cierra el objeto Scanner (entrada) para liberar recursos.

EJERCICIO CALCULADORA 

Este ejercicio hace uso un Scanner, Swicth y ciclo while. Es una calculadora interactiva que permite realizar  operaciones matemáticas y conversiones de unidades. Funciona en un bucle continuo, permitiendo al usuario elegir mediante un menú operaciones hasta que decida salir.

Pasos para el funcionamiento

1. Se muestra un mensaje de bienvenida al usuario y se explica el propósito del programa.
2. Se importa y se inicializa un objeto Scanner para permitir la entrada de datos del usuario.
3. En este punto se agrega un ciclo while el cual mantiene el programa en ejecución hasta que el usuario decida salir.
4. Se muestra un mensaje donde se le solicita al usuario la operación que desea realizar, ya sea escribiéndola directamente o mostrando un menú de opciones donde podrá escoger la que desea.
5. En este punto se utiliza otro ciclo switch para asignar un número a cada operación y procesar la entrada del usuario.
6. Una vez escogida la operación por el usuario se solicitan los números necesarios y se realizan los debidos cálculos como: suma, resta, multiplicación, división, potenciación, raíz cuadrada y módulo.
7. Es importante prevenir errores como la división por cero o la raíz cuadrada de un número negativo para lo cual se van mostrando mensajes de advertencia cuando sea necesario.
8. Mediante un segundo switch interno, el usuario puede realizar conversiones entre diferentes unidades, incluyendo temperatura, distancia, peso y volumen. Según la conversión seleccionada y el valor ingresado, el programa realizará la transformación correspondiente y mostrará el resultado.
9. Se agregó una novena opción para permitir al usuario salir. Al seleccionarla, el programa finalizará su ejecución y mostrará un mensaje de despedida.
10. Por último, una vez el usuario decida salir del programa el Scanner se cierra para liberar recursos y para evitar posibles errores en la ejecución del código




 
