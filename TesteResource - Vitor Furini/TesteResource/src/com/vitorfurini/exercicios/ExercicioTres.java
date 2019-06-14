package com.vitorfurini.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {

	public void Exercicio3() {
		int N;
		int cont = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número maior do que zero: ");

		N = sc.nextInt();
		
		sc.close();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cont++;
			}

		}
		if (cont == 2) {
			System.out.println("O numero " + String.valueOf(N) + " é primo");
		} else {
			System.out.println("O numero " + String.valueOf(N) + " não é primo");
		}
	}

}
