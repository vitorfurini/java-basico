/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portateste;

/**
 *
 * @author vitor.furini
 */
public class testeDaPorta {
    boolean aberta;
    String cor;
    int quantasPortasEstaoAbertas = 0;
    
   void abre(){
        if(aberta == false){
            aberta = true;
            System.out.println("A porta foi aberta");
            quantasPortasEstaoAbertas = quantasPortasEstaoAbertas + 1;
        }
   }
    void fecha(){
        if(aberta == false){
            aberta = true;
            System.out.println("A porta foi fechada");
        }
    }
    void estaAberta(){
        if(aberta == true){
            System.out.println("A porta está aberta");
            
        }else{
            System.out.println("A porta está fechada");
        }   
    System.out.println("Portas abertas: "+ quantasPortasEstaoAbertas);
    }
    
    
}
