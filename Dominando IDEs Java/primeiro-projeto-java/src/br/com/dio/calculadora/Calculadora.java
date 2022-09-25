package br.com.dio.calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		
		//Scanner scan = new Scanner(System.in);
		
		double a, b;
		String aA, bB;
		
		aA = JOptionPane.showInputDialog(null, "1º Valor");
		a = Double.parseDouble(aA);
		//System.out.println("Digite o 1� valor");
		//a = scan.nextInt();
		bB = JOptionPane.showInputDialog(null, "2º Valor");
		b = Double.parseDouble(bB);
		//System.out.println("Digite o 2� valor");
		//b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println(a + " + " + b + " = " + soma);
		System.out.println(a + " - " + b + " = " + subtracao);
		System.out.println(a + " * " + b + " = " + multiplicacao);
		System.out.println(a + " / " + b + " = " + divisao);

	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}
