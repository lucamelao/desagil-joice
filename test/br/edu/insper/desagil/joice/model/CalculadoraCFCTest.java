package br.edu.insper.desagil.joice.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.Calculadora;
import br.edu.insper.desagil.joice.model.CalculadoraCFC;

public class CalculadoraCFCTest {
	
	private double DELTA = 0.05;
	private Calculadora calculadora;

	@Test
	public void testCobre() {
		calculadora = new CalculadoraCFC("Cobre");
		assertEquals(8.89, calculadora.calcula(63.55, 0.128), DELTA);
	}

	@Test
	public void testOuro() {
		calculadora = new CalculadoraCFC("Ouro");
		assertEquals(19.36, calculadora.calcula(196.97, 0.144), DELTA);
	}

	@Test
	public void testPrata() {
		calculadora = new CalculadoraCFC("Prata");
		assertEquals(10.60, calculadora.calcula(107.87, 0.144), DELTA);
	}

	
}
