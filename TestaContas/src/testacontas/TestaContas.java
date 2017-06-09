/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacontas;

/**
 *
 * @author vitor.furini
 */
public class TestaContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println("Saldo Total: " + adc.getSaldoTotal() );
       /* System.out.println("Saldo Total " + c.getSaldo());
        System.out.println("Saldo anterior " + cc.getSaldo());
        System.out.println("Saldo conta poupança " + cp.getSaldo());
        System.out.println("Saldo atualizado " + adc.getSaldoTotal());*/
    }
    
}
