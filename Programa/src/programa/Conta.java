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
class Conta {
    String dono;
    double saldo;
    double salario;

    public Conta() {
    }
    /*void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }*/
    
   /* void deposita(double quantidade){
        this.saldo += quantidade;
    }*/
    
    boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }
}

