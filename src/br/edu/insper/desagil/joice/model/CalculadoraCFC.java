package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcula(double peso, double raio){
		return (4*peso)/(Math.pow(2*raio*(Math.pow(2, 0.5)), 3)/(Math.pow(Math.pow(3, 0.5), 3))*6.022*100);
	}
}

