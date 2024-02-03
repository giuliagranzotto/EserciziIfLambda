package it.betacom.iflambda;

import java.util.Arrays;
import java.util.List;

public class Esercizio6 {

	public static void main(String[] args) {
		System.out.println("Es6"); 		
		List <Integer> lista = Arrays.asList(1, 2, 3, 4, 5); 		
		int sommaLista = lista.stream() 				
				.reduce(0, (num1, num2) -> num1+ num2); 		 		
		System.out.println(lista.toString()); 		
		System.out.println("somma lista: " +sommaLista); 	}

	}

