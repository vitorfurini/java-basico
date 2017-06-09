/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedearray;

/**
 *
 * @author vitor.furini
 */
public class TesteDeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    int[] idades = new int[10];
    for(int i = 0; i < 10; i++){
        idades[i] = i * 10;
    }
    for(int i = 0; i < 10; i++){
        System.out.println(idades[i]);
    }    
}
}

