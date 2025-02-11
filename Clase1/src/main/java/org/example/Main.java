package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esto es una prueba..");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Mostrar un saludo
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");

        // Cerrar el scanner
        scanner.close();
    }
}

/**
 *       #### SUGERENCIAS Y TAREAS ####
 *       En este apartado hay algunos elementos de sintaxis que te pueden ayudar. Al final de todas las sugerencias
 *       hay un apartado con tareas para desarrollar tú lógica de programación y también para practicar la sintáxis.
 *       Las tareas están separadas en niveles (nivel 1 más facil, nivel 2 moderado, nivel 3 dificil, y nivel 4 desafio :D)
 *
 *
 *
 * Sugerencias:
 *  System.out.println("¡Hola, mundo!") te permite imprimir Strings y enteros por consola
 *  Toda linea debe terminar en un ";", a no ser que termine en un "{" o "}"
 *
 *  Pedir datos por consola:
 *
 *      // Limpiar el buffer antes de leer un String
 *         scanner.nextLine(); // usar siempre después de pedir un dato por consola.
 *
 *      Strings:
 *          // Crear un objeto Scanner para leer la entrada del usuario
 *          Scanner scanner = new Scanner(System.in);
 *          System.out.print("Ingrese su nombre: ");
 *          String nombre = scanner.nextLine(); //En la variable nombre se almacenará el dato ingresado en la consola
 *
 *      Enteros:
 *          // Leer un número entero por consola
 *          Scanner scanner = new Scanner(System.in);
 *          System.out.print("Ingrese un número entero: ");
 *          int numero = scanner.nextInt();
 *
 *
 *
 *  Condicionales:
 *  if:
 *      if (condición){
 *          //lo que quieres que ocurra si esa condicion se cumple
 *      }
 *
 *      ejemplo:
 *      int edad = 18;
 *      if (edad >= 18) { // Si la edad es mayor o igual a 18
 *          System.out.println("Eres mayor de edad.");
 *      }
 *
 *  if-else:
 *      if (condición){
 *          //lo que quieres que ocurra si esa condicion se cumple
 *      } else{
 *          // lo que quieres que ocurra si esa condición no se cumple
 *      }
 *
 *  if-else if-else:
 *  if (condición 1){
 *          //lo que quieres que ocurra si la condicion 1 se cumple
 *      } else if (condición 2) {
 *          // lo que quieres que ocurra si la condición 2 no se cumple
 *      } else{
 *          // lo que quieres que ocurra si no ocurren ninguna de las condiciones anteriores
 *      }
 *
 *
 *
 *  Ciclos:
 *  for:
 *      for (inicialización; condición; actualización) {
 *          // Código que se ejecuta en cada iteración
 *      }
 *
 *      ejemplo:
 *      for (int i = 1; i <= 5; i++) { // i inicia en 1, se ejecuta mientras i <= 5, y se incrementa en cada iteración
 *             System.out.println("Número: " + i);
 *      }
 *  while:
 *      while (condición) {
 *              // Código a ejecutar mientras la condición sea verdadera
 *      }
 *
 *      ejemplo:
 *      int i = 1; // Inicialización
 *      while (i <= 5) { // Mientras i sea menor o igual a 5
 *          System.out.println("Número: " + i);
 *          i++; // Incremento
 *      }
 *
 *
 *
 *  Arreglos:
 *      tipoDeDato[] nombre = new tipoDeDato[tamaño];
 *
 *      ejemplo:
 *      int[] numeros = new int[5]; // Arreglo de tamaño 5
 *
 *      //Asignar un valor a una posición:
 *      numeros[2] = 3; //ahora la posición 2 del arreglo tiene un valor de 3
 *
 *      //mostrar posición de un arreglo:
 *      System.out.println("numero almacenado en el arreglo:" + numeros[2]); //mostrará por pantalla el string junto con el valor almacenado en la posición 2 del arreglo
 *
 *      //Recorrer un arreglo con for:
 *      int[] numeros = {10, 20, 30, 40, 50}; //crear un arreglo cualquiera
 *
 *      for (int i = 0; i < numeros.length; i++) { // `length` devuelve el tamaño del arreglo
 *         System.out.println("Elemento en índice " + i + ": " + numeros[i]);
 *      }
 *
 *
 *
 *  Listas:
 *      ArrayList<Tipo de dato u objeto> nombre = new ArrayList<>(); // Crear una lista vacía
 *
 *      ejemplo:
 *      // crear una lista que contenga perros de la clase Perro
 *      ArrayList<Perro> perrera = new ArrayList<>();
 *
 *      Perro copito = new Perro("copito", 4, "feliz");
 *
 *      //añadir un elemento a la lista:
 *      //lista.add(elemento);
 *      perrera.add(copito);
 *
 *      System.out.println(perrera); // Imprime la lista completa
 *
 *      //(Existen muchos metodos más para trabajar con listas)
 *
 *
 *
 * Tareas para practicar:
 *     nivel 1:
 *     1- Crea un programa que imprima "Hola, mundo!" en la consola.
 *     2- Pide al usuario dos números y muestra la suma, resta, multiplicación y división de estos.
 *     3- Escribe un programa que determine si un número ingresado es par o impar.
 *     4- Imprime los números del 1 al 10 usando for y while.
 *
 *     nivel 2:
 *     5- Crea un arreglo de 5 números y muestra la suma de todos.
 *     6- Crea un arreglo con 10 números al azar, también pide un número al usuario y verifica si el número ingresado se encuentra en el arreglo definido
 *     7- Crea una clase CuentaBancaria con saldo y métodos para depositar, retirar dinero y ver saldo total.
 *     8- Crea una clase Persona con atributos nombre y edad, y un metodo que imprima su información.
 *
 *     nivel 3:
 *     9- Escribe un programa que determine si una palabra es un palíndromo (ejemplo: "radar").
 *     10- Implementa un metodo que reciba tres números y devuelva el mayor.
 *
 *
 *     nivel 4: (Opcional)
 *     11- Implementa una clase Calculadora que permita sumar, restar, multiplicar y dividir dos números según la opción que elija el usuario.
 *         Se solicita crear un menú de usuario utilizando el condicional switch con las siguientes opciones que se deben mostrar por pantalla:
 *
 *         ##Calculadora##
 *         0- Apagar calculadora (finalizar el programa)
 *         1- Sumar
 *         2- Restar
 *         3- Multiplicar
 *         4- Dividir
 *         Valor: 0 (valor que se va actualizando a medida que se van realizando operaciones)
 *         Seleccione una opcción: (acá el usuario ingresa una opción ingresando el número correspondiente)
 *
 *         Tambien deben existir sub menus dependiendo de cada opción:
 *
 *         si se escoge la opción 1 debe aparecer el siguiente sub menú:
 *         ##Sumar##
 *         ingrese el primer número: (acá el usuario ingresa un numero a sumar)
 *         luego de presionar enter...
 *         ingrese el primer número: (acá el usuario ingresa el otro numero a sumar)
 *         luego de presionar enter...
 *         Suma total: (mostrar resultado y volver al menú principal con el valor actualizado)
 *
 *         ##Calculadora##
 *         0- Apagar calculadora (finalizar el programa)
 *         1- Sumar
 *         2- Restar
 *         3- Multiplicar
 *         4- Dividir
 *         Valor: resultado de la suma realizado anteriormente
 *
 *
 *         Realizar lo mismo con las otras opciones....
 */