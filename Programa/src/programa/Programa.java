/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author vitor.furini
 */
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.dono = "Vitor";
        minhaConta.saldo = 1000;
        
        if(minhaConta.saca(2000)){
            System.out.println("Consegui sacar");
        }else{
            System.out.println("Não consegui sacar");
        }
        
    }
    
}
