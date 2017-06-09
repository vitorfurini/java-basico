/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearrays;

import java.util.Scanner;

/**
 *
 * @author vitor.furini
 */
public class TesteArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos];
        
        for(int i = 0; i < numAlunos; i++){
            System.out.println("Insira a nota do "+ (i+1) + "º" + "aluno.");
            notaAlunos[i] = input.nextDouble();
        }
        for(int i = 0; i < numAlunos; i++){
            System.out.println("->" + notaAlunos[i]);
        }
    }
    
}
