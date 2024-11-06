package br.com.alura.screenmatch.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemploStream4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> numerosPares = numeros.stream()
                .filter(n-> n % 2==0)
                .collect(Collectors.toSet());
        System.out.println(numerosPares);
    }
}
