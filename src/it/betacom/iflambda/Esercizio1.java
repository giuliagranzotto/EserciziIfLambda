/*String nome =”Andrea” 
Voglio verificare tramite 2 oggetti di tipo predicate 
se la stringa nome  contiene la lettera A o ha lunghezza > 10
*/

package it.betacom.iflambda;

import java.util.function.Predicate;

public class Esercizio1 {

	public static void main(String[] args) {
		String name = "Andrea";  		
		Predicate<String> lengthGreaterThan10 = l -> l.length() > 10; 		
		Predicate<String> containLetterA = c -> c.contains("A");  		
		boolean result = lengthGreaterThan10.or(containLetterA).test(name); 		
		System.out.println("Result: " + result);

	}

}
