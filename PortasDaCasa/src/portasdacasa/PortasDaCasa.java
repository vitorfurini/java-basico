/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portasdacasa;

/**
 *
 * @author vitor.furini
 */
public class PortasDaCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aqui está definido um único objeto do tipo porta
        Portas portas = new Portas();

        portas.p1Abre();
        portas.p1Fecha();
        portas.p1EstaAberta();
        portas.p2Abre();
        portas.p2Fecha();
        portas.p2EstaAberta();
        portas.p3Abre();
        portas.p3Fecha();
        portas.p3EstaAberta();
        portas.p4Abre();
        portas.p4Fecha();
        portas.p4EstaAberta();
        portas.portasAbertas();
    }
}
