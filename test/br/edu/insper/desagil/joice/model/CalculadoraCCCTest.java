package br.edu.insper.desagil.joice.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraCCCTest {
	
	private double DELTA = 0.05;
	private Calculadora calculadora;

	@Test
	public void testNiobio() {
		calculadora = new CalculadoraCCC("Niobio");
		assertEquals(8.57, calculadora.calcula(92.91, 0.143), DELTA);
	}

	@Test
	public void testTungstenio() {
		calculadora = new CalculadoraCCC("Tungstenio");
		assertEquals(19.28, calculadora.calcula(183.84, 0.137), DELTA);
	}

	@Test
	public void testLitio() {
		calculadora = new CalculadoraCCC("Litio");
		assertEquals(0.53, calculadora.calcula(6.94, 0.152), DELTA);
	}

	
}
