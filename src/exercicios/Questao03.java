package exercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		System.out.println(anagrams(input, input.length()));
	}

	/**
	 * @param input: entrada do user | inputLength: tamanho da string
	 * @return numberAnagrams: número de pares de substrings que são anagramas
	 */
	public static int anagrams(String input, int inputLength) {

		/**
		 * usando haspMap para armazenar o anagrama e a quantidade de vezes que ele
		 * aparece
		 */
		HashMap<String, Integer> anagrams = new HashMap<String, Integer>();
		int numberAnagrams = 0;
		int repeatAnagrams = 0;

		/**
		 * para cada letra, irá ser necessário percorrer toda a palavra, afim de
		 * identificar as substrings
		 */
		for (int i = 0; i <= inputLength; i++) {
			for (int j = i; j < inputLength; j++) {

				char[] character = input.substring(i, j + 1).toCharArray();
				// para pegar toda variação possível da substring
				Arrays.sort(character);
				String subString = new String(character);

				/**
				 * adiciona a substring ao map caso não exista e, se for repetido, incrementa
				 */
				if (anagrams.containsKey(subString)) {
					anagrams.put(subString, anagrams.get(subString) + 1);
				} else {
					anagrams.put(subString, 1);
				}
			}
		}

		for (String anagram : anagrams.keySet()) {
			/**
			 * verifico a quantidade de vezes que a substring aparece, apenas as que que
			 * tiverem valor maior ou igual a 2 são contabilizadas (divido por 2 ao fim,
			 * pois precisa ser pares de substrings)
			 */
			repeatAnagrams = anagrams.get(anagram);

			/**
			 * algumas substrings podem aparecer mais de 2 vezes, faço o tratamneto caso o
			 * número seja ímpar aqui para não quebrar a divisão
			 */
			numberAnagrams += (repeatAnagrams * (repeatAnagrams - 1)) / 2;
		}
		return numberAnagrams;

	}

}
