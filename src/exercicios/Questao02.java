package exercicios;

import static java.lang.String.valueOf;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {

		String input;

		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		System.out.println(passValidator(input));
	}

	/**
	 * @param input: entrada do user
	 * @return pending: número de caracteres que faltam para a senha ser segura
	 */
	public static int passValidator(String input) {

		String especialChar = "!@#$%^&*()-+";
		boolean isEspecialChar = false;
		boolean isUpper = false;
		boolean isLower = false;
		boolean isNumber = false;
		int pending = 0;

		for (char c : input.toCharArray()) {
			if (especialChar.contains(valueOf(c))) {
				isEspecialChar = true;
			}
			if (Character.isUpperCase(c)) {
				isUpper = true;
			}
			if (Character.isLowerCase(c)) {
				isLower = true;
			}
			if (Character.isDigit(c)) {
				isNumber = true;
			}
		}

		if (!isNumber) {
			pending++;
		}
		if (!isLower) {
			pending++;
		}
		if (!isUpper) {
			pending++;
		}
		if (!isEspecialChar) {
			pending++;
		}

		/**
		 * pode haver casos onde a entrada possua as restrições, com exceção do tamanho
		 * da senha, nessa situação, 'pending' estaria com valor zero, por isso o
		 * retorno considera sempre o maior
		 */
		return (Math.max(pending, 6 - input.length()));

	}

}
