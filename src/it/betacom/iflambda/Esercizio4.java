package it.betacom.iflambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Esercizio4 {

	public static void main(String[] args) { 		
		List<Integer> listaInput = new ArrayList<>();  		
		listaInput.add(1); 		
		listaInput.add(2); 		
		listaInput.add(3); 		
		listaInput.add(4); 		
		listaInput.add(5);  		
		List<Integer> listaOutput = transformList(listaInput, x -> x * 3);  		
		System.out.println("Lista di input: " + listaInput); 		
		System.out.println("Lista di output: " + listaOutput); 	}  	
	public static List<Integer> transformList(List<Integer> inputList, Function<Integer, Integer> transformation) { 		
		return inputList.stream() 				
				.map(transformation) 				
				.collect(Collectors.toList()); 	}

	}

