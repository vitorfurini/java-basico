package aula12;

/**
 *
 * @author vitor.furini
 */
public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
