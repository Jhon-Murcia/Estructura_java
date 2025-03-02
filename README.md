# Estructura_java
INTEGRANTES: 
Jhon Sebastian Murcia Romero 
Angie Katherine Robayo Angel
Oscar Julian Gomes Chavez

DESCRIPCIÓN DEL PROYECTO 
El presente proyecto consta de dos fases principales: En la primera se desarrollo 4 ejercicios en donde en la clase main osea la clase principal se creo el ejemplo interactivo donde se utilizaron los tipos de datos abstractos primitivos,adicional a esto se crearon cuatro archivos con su respectivo nombre,  con los nombres de Ejercicio_2,_3,_4, en el ejercicio 2 se trabajaron Operadores (aritméticos, lógicos, relacionales) y por ultimo en el ejercicio 3 y 4 se trabajaron las estructuras de control. 

Por otro lado como segunda fase se desarolló una calculadora la cual  realiza  6 operaciones basicas y conversion de unidades permitiendo al usuario interactura con el programa para realizar calculos basicos.

FUNCIONALIDAD 

Programa Ejemplos de tipos de datos y Operadores

Ejercicio de Datos primitivos
Se crea un  programa en donde se solicita al usuario inresar varios datos personales y númericos,luego realiza diferentes operaciones lógicas y matemáticas  con esos datos y finalmente muestra loss resultados en la consola. Mostrando el uso de tipos de datos primitivimos en java mediante ejemplos practicos 

Pasos del funcionamiento 
1. Se usa Scanner para perdirle al usuario información omo su nombre,edad,año actual,población de su municipio,cantidad de pasos anuales,precio de un producto, valor de π, si es mayor de edad, y su inicial del nombre.

2. Se manejan diferentes tipos de datos primitivos, como : byte:edad, short:año actual, int: población, long: caantidad de pasos, float:precio del producto, double: valor de π, boolean: si es mayor de edad, char: inicial del nombre.

3. se calcula las operaciones con los datos ingresados, se imprimen los datos obtenidos en la consola  y se cierra el programa. 

 Ejercicio con Operadores aritméticos, lógicos y racionales  
 Este programa utiliza peradores aritméticos, lógicos y racionales para simular un sistema bancario básico donde el usuario puede consultar su saldo y retirar dinero, siempre y cuando cumpla ciertos requisitos

 Pasos del funcionamiento 
 1. se imprime  un mensaje en la consola el cual indica al usuario que el programa es un simulador de un Banco.
 2.  Se declaran las variales: edad_minima =18 : Edad mínima para ingresar al banco , pin = 1234 : Clave fija de acceso a la cuenta y saldo = 20000 : saldo inicial de la cuenta.
 3.  verifica la edad del usuario solicitandosela y compara si el dato ingresado es menor a 18,  si es menor se niega el acceso con un mensaje, si es mayor a 18 se solicita el pin; si el pin es correcto, se permite el acceso a la cuenta sino se niega el acceso.
 4.  Una vez dentro de la cuenta el usuario tiene tres opciones:Consultar saldo, donde se muestra el saldo actual de la cuenta; retirar dinero en donde se solicita el monto a retirar, si el saldo es suficiente se resta y se muestra su nuevo saldo, si es insuficiente se muestra un mensaje de error  y salir donde se finaliza el programa con un mensaje de despedida y se cierra el programa

Ejercicios con Estructuras de control

Ejercicio con If, Else, y ciclo For
Este ejercicio hace uso de estructuras de control para calcular si un numero es primo, para ello el programa solicita al usuario un numero y este le indicara al usuario si es primo o no es primo.

Pasos del funcionamiento
1. Se imprime un mensaje al usuario en la consola el cual da una pequeña descripcion de lo que hace el programa, en este caso calcular si un numero es o no es primo.
2. Se crea un objeto Scanner para que el usuario pueda ingresar el numero deseado
3. Se declara la variable int=numero la cual almacenara el numero ingresado por el usuario
4. Haciendo uso de un condicional if y else se verifica si el numero es primo o no, el if verifica si el numero es igual o menor a 1, esto ya que estos numeros no son primos y lo marca automaticamente como no primo, el condicional else verifica si el numero ingresado es divisible por algun numero distinto a 1 y de el mismo.
5. Por ultimo se hace uso de un condicional if el cual pone la condicion de que si el numero es primo imprima un mensaje en el que el usuario pueda entender que el numero es primo, de lo contrario el condicional else va a imprimir un mensaje que indique que el numero no es primo

Ejercicio con Switch
Este ejercicio tiene un funcionamiento simple, el cual es una sencilla prueba de conocimiento basada en 10 preguntas de cultura general con 3 opciones de respuesta cada una y al final imprime un mensaje en base a la puntuacion del usuario

Pasos del funcionamiento
1. Se imprimen dos mensajes iniciales donde se explica la funcionalidad del programa y donde es especifica los tipos de estructuras de control que se usaron a lo largo de todo el codigo
2. Como primer paso se importa el Scanner que se usara para que el usuario pueda ingresar sus respuestas y se le asigna un nombre, en este caso "entrada" y se declara la variable "int PreguntaCorrecta=0" la cual va a almacenar las respuestas correctas del usuario
3. Ahora se implementa un ciclo for de i=1 a i=10, esto para que se pueda imprimir un mensaje indicando el numero de la pregunte, Ejemplo: Pregunta 1, Pregunta 2, etc
4. Ahora se hace uso de un Switch en base a i para que se impriman todas las 10 preguntas una por una con sus opciones de respuesta, en este caso como son 10 preguntas se tendran 10 casos para el switch donde cada uno tendra la pregunta y sus 3 opciones de respuesta, por ultimo al final de cada switch se llama al Scanner entrada para que el usuario pueda ingresar su repsuesta y se agrega un if para validad si la respuesta es correcta y se agregue a ul contador usando ++
5. Una vez mostradas y respondidas todas las 10 preguntas se va a imprimir su calificacion, para lo cual se usa in condicional if que indica que si el usuario tuvo =>5 respuestas correctas el quiz fue reprobo, si tuvo <6 aprobo con exito el quiz pero si tuvo ==10 respuestas correctas aprobo con meritos el quiz



 
