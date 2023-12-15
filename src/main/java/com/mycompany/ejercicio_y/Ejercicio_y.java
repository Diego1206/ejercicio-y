/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_y;

import java.util.Scanner;

/**
 *
 * @author ITP
 */
public class Ejercicio_y {

    
 private static String[][] preguntasRespuestas = {
            {"¿Cuál es la capital de Francia?", "Paris"},
            {"¿En qué año fue la independencia de Estados Unidos?", "1776"},
            {"¿Cuál es el color del cielo en un día despejado?", "Azul"},
            {"¿Cuál es el mejor equipo del mundo?", "Sevilla FC"},
            {"¿Cuál es el maximo ganador de la Champions?", "Real Madrid"},
            {"¿Cuántas Guerras Mundiales a vivido la Reina Isabel II?", "2"},
            {"¿Cuál es la mejor seleccion de fútbol del mundo?", "Brasil"},
            {"¿Quién descubrió America?", "Cristobal Colón"},
            {"¿En qué año sucedio el descubrimiento de America?", "1492"},
            {"¿Cuántos Balones de Oro tiene Lionel Andrés Messi?", "7"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Preguntas y Respuestas!");
        System.out.println("Las Respuestas deben de contener tildes si la palabra la lleva!");

        int puntajeTotal = 0;

        // Itera sobre cada pregunta y obtiene las respuestas del usuario
        for (int i = 0; i < preguntasRespuestas.length; i++) {
            String pregunta = preguntasRespuestas[i][0];
            String respuestaCorrecta = preguntasRespuestas[i][1];

            System.out.println("\nPregunta " + (i + 1) + ": " + pregunta);
            System.out.print("Tu respuesta: ");
            String respuestaUsuario = scanner.nextLine();

            // Compara la respuesta del usuario con la respuesta correcta
            if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
                System.out.println("¡Correcto! Ganaste 10 puntos.");
                puntajeTotal += 10;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + respuestaCorrecta);
            }
        }

        // Muestra el puntaje total al final del juego
        System.out.println("\n¡Fin del juego!");
        System.out.println("Tu puntaje total es: " + puntajeTotal);

        // Cierra el scanner al final del juego
        scanner.close();
    }
}
    

