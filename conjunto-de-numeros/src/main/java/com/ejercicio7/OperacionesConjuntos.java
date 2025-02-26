package com.ejercicio7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperacionesConjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // 1. Pedir al usuario dos conjuntos de números enteros
        System.out.println("Ingrese los elementos del primer conjunto (escriba 'fin' para terminar):");
        leerConjunto(conjunto1, scanner);

        System.out.println("\nIngrese los elementos del segundo conjunto (escriba 'fin' para terminar):");
        leerConjunto(conjunto2, scanner);

        // 3. Calcular y mostrar la unión, intersección y diferencia de los conjuntos
        System.out.println("\n--- Resultados ---");

        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("Unión: " + union);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("Intersección: " + interseccion);

        // Diferencia (conjunto1 - conjunto2)
        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("Diferencia (Conjunto1 - Conjunto2): " + diferencia);

        scanner.close();
    }

    // Método para leer un conjunto de números enteros
    private static void leerConjunto(HashSet<Integer> conjunto, Scanner scanner) {
        while (true) {
            System.out.print("Número (o 'fin' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                conjunto.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número entero o 'fin' para terminar.");
            }
        }
    }
}