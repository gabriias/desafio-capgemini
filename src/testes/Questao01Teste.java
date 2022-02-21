package testes;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import exercicios.Questao01;

public class Questao01Teste {

	@Test
	public void passwordValidation() {

		List<String> output;
		List<String> expected = Arrays.asList(" *", "**");

		output = Questao01.stairsGenerator(2);
		Assert.assertEquals(expected, output);

	}

}
