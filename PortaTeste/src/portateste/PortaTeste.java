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
public class PortaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       testeDaPorta porta = new testeDaPorta();
       
       porta.abre();
       porta.fecha();
       porta.estaAberta();
       
    }
    
}
