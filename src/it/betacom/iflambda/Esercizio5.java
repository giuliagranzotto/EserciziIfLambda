package it.betacom.iflambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio5 {

	public static void main(String[] args) {
		System.out.println("Esercizio 5");         
		List <Integer> lista = Arrays.asList(1, 2, 3, 4, 5);         
		List<Integer> listapari = lista.stream().filter((s)-> s % 2 == 0).collect(Collectors.toList());                  
		System.out.println(listapari);

	}

}
