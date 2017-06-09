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
public class Pessoa {
    String nome;
    int idade;
    int aniversario;
    int proxIdade;
    
    
    void fazAniversario()
    {
      aniversario = this.idade;
      this.idade = aniversario;
    }
    void proxIdade()
    {
      aniversario = this.idade + 1;
      this.proxIdade = aniversario;
    }
    
    void mostra()
    {
       System.out.println("Nome:" + this.nome); 
       System.out.println("Idade antes do Aniversário:" + this.idade); 
       System.out.println("Próxima idade: " + this.proxIdade);
    }
    
}

