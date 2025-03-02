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

Ejercicio con if, else y ciclo for
Pasos del funcionamiento
1. Se inicia importando el Scanner que va a recibir los datos ingresados por el usuario
2. Se imprimen dos mensajes de bienvenida los cuales indican el funcionamiento del programa y especifican que tipos de datos abstractos se usaron en el codigo
3. Como tercer paso se declara la variable "int numero" la cual va a almacenar el numero ingresado por el usuario
4. Se imprime un mensaje el cual solicita al usuario que ingrese un numero y se llama al Scnner para que lea el numero ingresado para verificar si es primo o no
5. Haciendo uso de un if se verifica que el numero ingresado no sea 1 o sea menor a 0 ya que estos no son primos y en caso de que el numero no cumpla con la condicion automaticamente se clasifica como no primo
6. Por medio del condicional else se verifica si el numero ingresado es divisible por 1 y por el mismo ya que esta es la propiedad de los numeros primos, y en base a esto se clasifica 
7. Haciendo uso de otro if donde se cumpla la condicion de que el numero ingresado es primo se imprime un mensaje que indica que el numero fue clasificado como numero primo, de lo contrario se va a imprimir un mensaje que indica que el numero no es primo

Ejercicio switch
Pasos para el funcionamiento
1. Como es costumbre se importa el Scanner para la entrada de datos y se le asigna un nombre, en este caso entrada, tambien se imprimen dos mensajes de bienvenida, el primero indica la funcionalidad del programa y el segundo indica los ejemplos de tipos de control que se usaron en el codigo
2. Ahora se declara la variable "PreguntaCorrecta" la cual va a servir como contador para almacenar el numero de preguntas correctas
3. Haciendo uso de un cilo for que va desde i=1 hasta i=10 se imprime un mensaje con el numero de la pregunta, Ejemplo: Pregunta 1, Pregunta 2, etc
4. Se hace uso de un Switch en base i el cual tiene 10 caso, en este caso 10 preguntas de cultura general y sus 3 posibles respuestas, al final de cada caso se llama al Scanner para leer la respuesta del usuario y se agrega un if para almcenar la respuesta correcta en el contador
5. Una vez se repondan las 10 preguntas se van a imprimir los posibles resultados haciendo uso de un if y else if, en este caso, si el usuario tuvo igual o menos de 5 respuestas correctas habra perdidoel quiz, si tuvo entre 6 y 9 correctas aprobo el quiz y si paso con 10 correctas aprobo con meritos


 
