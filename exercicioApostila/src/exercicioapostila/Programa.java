/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioapostila;

/**
 *
 * @author vitor.furini
 */
    class Programa {
        public static void main(String[] args) {
        Conta minhaConta;
         minhaConta = new Conta();
     
           minhaConta.dono = "Duke";
           minhaConta.saldo = 910;
           
           
           System.out.println("Saldo atual: " + minhaConta.saldo);
    }
     
}

