package com.vitorfurini.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioUm {

	public void Exercicio1() {

		Scanner sc = new Scanner(System.in);
		// Constrói um Array com 3 posições
		Integer[] listaDeNumeros = new Integer[3];
		// Aqui irá preencher o array
		for (int i = 0; i < listaDeNumeros.length; i++) {
			System.out.print("Informe um numero: ");
			listaDeNumeros[i] = (sc.nextInt());
		}
		
		sc.close();
		// Utilizando a collection reverOrder, o array será ordenado em forma decrescente.
		Arrays.sort(listaDeNumeros, Collections.reverseOrder());
		
		System.out.println("Ordem decrescente:    ");
		for (int j = 0; j < listaDeNumeros.length; j++) {
			System.out.print(listaDeNumeros[j] + "  ");
		}
	}
}
