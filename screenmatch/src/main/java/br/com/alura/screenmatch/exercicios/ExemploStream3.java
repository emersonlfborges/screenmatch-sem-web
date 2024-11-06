package br.com.alura.screenmatch.exercicios;

import java.util.Arrays;
import java.util.List;

public class ExemploStream3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana");
                    nomes.stream()
                            .forEach(nome-> System.out.println("Olá, "+nome+"!"));
    }
}
