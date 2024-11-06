package br.com.alura.screenmatch.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediária");
        List<Integer> tamanhos = palavras.stream()
                .map(s-> s.length())
                .collect(Collectors.toList());
        System.out.println(tamanhos);
    }
}
