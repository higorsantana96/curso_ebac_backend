package com.br.hsantana.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNomes {

    /**
      * @author h.santana
     */

    public static void main(String args[]) {
        listaNomesExercicioEBAC();
    }

    public static void listaNomesExercicioEBAC() {
        System.out.println("**** LIsta De Nomes Exercicio EBAC ****");

        List<String> lista = new ArrayList<String>();
        lista.add("Raul Santana");
        lista.add("Higor Santana");
        lista.add("Valdevino Santana");
        lista.add("Matheus Santana");
        lista.add("Marcia Santana");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}