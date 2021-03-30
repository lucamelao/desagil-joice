package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {

	public CalculadoraCCC() {
		super("CCC - Cúbica de Corpo Centrado");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcula(double peso, double raio){
		double avogadro = 6.022 * Math.pow(10, 23);
		double raioCm = raio/Math.pow(10, 7);
		double arestaCubo = (4 * raioCm / Math.pow(3, 0.5));
		double numeroAtomos = 2;
		double volumeCubo = Math.pow(arestaCubo, 3);
		return (numeroAtomos*peso/avogadro)/volumeCubo;
	}
}

