package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {

		int input;

		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		for (String step : stairsGenerator(input)) {
			System.out.println(step);
		}
	}

	/**
	 * @param input: entrada do user
	 * @return steps: lista com a saída esperada
	 */
	public static List<String> stairsGenerator(int input) {
		List<String> steps = new ArrayList<>();

		/**
		 * formata cada "degrau" e adiciona na lista para ser exibida posteriormente
		 */
		for (int i = 0; i < input; i++) {
			steps.add(" ".repeat((input - 1) - i) + "*".repeat(i + 1));
		}

		return steps;
	}

}
