package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC() {
		super("CFC - Cúbica de Face Centrada");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcula(double peso, double raio){
		double avogadro = 6.022 * Math.pow(10, 23);
		double raioCm = raio/Math.pow(10, 7);
		double arestaCubo = (Math.pow(2, 1.5) * raioCm);
		double numeroAtomos = 4;
		double volumeCubo = Math.pow(arestaCubo, 3);
		return (numeroAtomos*peso/avogadro)/volumeCubo;
	}
}