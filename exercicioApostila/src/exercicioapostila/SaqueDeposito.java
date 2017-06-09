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
public class SaqueDeposito {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.dono = "Duke";
        minhaConta.saldo = 9000;
        
        minhaConta.saca(200);
        
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
}
