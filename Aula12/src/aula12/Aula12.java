package aula12;

/**
 *
 * @author vitor.furini
 */
public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Lobo l = new Lobo();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Goldfish g = new Goldfish();
        
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);
//        c.locomover();
//        k.locomover();
//        c.emitirSom();
//        k.emitirSom();
//        
//        g.alimentar();
    }
}
