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
class Conta {
    int numero;
    double salario;
    double saldo;
    String dono;
    double limite;

       
       void saca(double quantidade){
           double novoSaldo = this.saldo - quantidade;
           this.saldo = novoSaldo;
       }
       void deposita(double quantidade){
           this.saldo += quantidade;
       }
}
 


