package com.vitorfurini.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

	public void Exercicio2() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int z;

		System.out.print("N�mero 1: ");
		x = sc.nextInt();

		System.out.print("N�mero 2: ");
		y = sc.nextInt();

		System.out.print("N�mero de c�lculos: ");
		z = sc.nextInt();

		sc.close();

		for (int a = x, b = y, i = 0; i < z; b += a, a = b - a, i++) {
			System.out.print(a + " ");
		}
		System.exit(0);

	}
}
