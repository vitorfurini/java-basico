/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programateste01;

/**
 *
 * @author vitor.furini
 */
public class ProgramaTeste01 {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Vitor";
        pessoa.idade = 21;
        pessoa.fazAniversario();
        pessoa.proxIdade();
        pessoa.mostra();
        
    }
    
}
