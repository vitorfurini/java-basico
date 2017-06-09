/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaduascontas;

/**
 *
 * @author vitor.furini
 */
public class Teste {
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
        
        minhaConta.titular.nome = "Vitor";
        
                
    }            
            
}
