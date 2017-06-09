/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author vitor.furini
 */
public class Banco {

    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = f1;
        
        Data dataDeEntrada;
        
        
        
        f1.nome = "Vitor";
        f1.salario = 1000;
        f1.recebeAumento (500);
        
        
        f2.nome = "Vitor";
        f2.salario = 1000;
        f2.recebeAumento (500);
        
        if(f1 == f2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
       
        /*System.out.println("Salario atual: " + f1.salario);
        System.out.println("Ganho atual: " + f1.calculaGanhoAnual());
        System.out.println("Nome: " + f1.nome);*/
       
        
      }
    
}
    
