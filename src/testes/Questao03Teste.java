package testes;

import org.junit.Assert;
import org.junit.Test;

import exercicios.Questao03;

public class Questao03Teste {
	
	@Test
	public void passwordValidation() {

		int output;

		output = Questao03.anagrams("ovo", 3);
		Assert.assertEquals(2, output);

		output = Questao03.anagrams("ifailuhkqq", 10);
		Assert.assertEquals(3, output);

	}

}
