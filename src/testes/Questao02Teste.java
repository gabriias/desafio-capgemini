package testes;

import org.junit.Assert;
import org.junit.Test;

import exercicios.Questao02;

public class Questao02Teste {

	@Test
	public void passwordValidation() {

		int output;

		output = Questao02.passValidator("aA@4aA");
		Assert.assertEquals(0, output);

		output = Questao02.passValidator("Ya3");
		Assert.assertEquals(3, output);

	}

}
