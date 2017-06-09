/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedaconta;
/**
 *
 * @author vitor.furini
 */
public class TesteConta {
    public static void main(String[] args){
     Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
}
}