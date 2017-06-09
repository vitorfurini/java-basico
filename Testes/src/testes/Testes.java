/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author vitor.furini
 */
public class Testes {
    public static void main(String[] args) {
        
        double peso;
        double altura;
        
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o seu peso: ");
         peso = ler.nextDouble();
        System.out.println("Digite sua altura: ");
         altura = ler.nextDouble();
         
         double imc = peso / (altura * altura);
        
        System.out.println("Seu peso é " +imc);
         if (imc < 20)
         System.out.printf(" (abaixo do peso).\n");
      else if ((imc >= 20) && (imc < 25))
              System.out.printf(" (peso normal).\n");
           else if ((imc >= 25) && (imc < 30))
                   System.out.printf(" (acima do peso).\n");
                else if ((imc >= 30) && (imc < 34))
                        System.out.printf(" (obeso).\n");
                     else
                        System.out.printf(" (muito obeso).\n");
    }
    
}
