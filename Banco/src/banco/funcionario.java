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
class Funcionario {
        double salario;
        String dataDeEntrada;
        String rgDoFuncionario;
        String departamento;
        String nome;
        boolean estaNaEmpresa;
        String recebeAumento;
        
        
    
    void recebeAumento(double aumento){
        double novoSalario = this.salario + aumento;
        this.salario = novoSalario;
    }
    
    void demite(){
    }
    
    double calculaGanhoAnual(){
        return 0;
     }
    
   
    
}

class Data{
    int dia = 30;
    int mes = 8;
    int ano = 2017;
}