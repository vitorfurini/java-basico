package aula12;

/**
 *
 * @author vitor.furini
 */
public class Cachorro extends Mamifero {

    public void reagir(String frase) {
        if (frase.equals("Ola") || frase.equals("Toma comida")) {
            System.out.println("Abanando o rabo e latindo");
        } else {
            System.out.println("rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10 ) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    public void enterrarOsso() {
        System.out.println("Enterrando Osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo ");
    }

}
