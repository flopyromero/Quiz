package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> respuestas1 = new ArrayList<String>();
        respuestas1.add("Atlántico");
        respuestas1.add("Índico");
        respuestas1.add("Ártico");
        respuestas1.add("Pacífico");
        Pregunta pregunta1 = new Pregunta("¿Cuál es el océano más grande?", respuestas1, 4);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostrarPregunta();
    }
}