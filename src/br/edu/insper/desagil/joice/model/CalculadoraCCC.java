package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {

	public CalculadoraCCC() {
		super("CCC - Cúbica de Corpo Centrado");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcula(double peso, double raio){
		return (2*peso)/(Math.pow(4*raio/(Math.pow(3, 0.5)), 3)*6.022*100);
	}
}