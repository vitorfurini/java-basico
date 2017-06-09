
package remote;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = true;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(" ---- MENU ---- ");
        if(this.getLigado() == true){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        }
    }
    
    @Override
    public void fecharMenu() {
        if(this.getLigado() == false){
        System.out.println("Volume atual: " + this.getVolume());
        }
        System.out.println(" --- Fechando menu ---");
    }
    
    @Override
    public void maisVolume() {
        if(this.getLigado() == true && this.getVolume() <= 0){
            this.setVolume(this.getVolume() + 5);
            //System.out.println("Volume atual " + this.getVolume());
        }
        else if(this.getVolume() == 0 ){
            System.out.println("Impossivel aumentar volume, mudo ativado");
        }
        else if(this.getVolume() == 100){
            System.out.println("Impossivel aumentar volume, já está no máximo!");
        }
        else{
            System.out.println("Impossivel aumentar volume, tv DESLIGADA");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }if (this.getLigado() == true && this.getVolume() <= 0){
            System.out.println("Impossivel diminuir volume, já está no mínimo!");
        }else{
            System.out.println("Impossivel diminuir volume, tv DESLIGADA");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0 ){
            this.setVolume(0);
            System.out.println("Mudo ativado");
            
        }
    }

    @Override
    public void desligadMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(10);
            System.out.println("Mudo desativado! ");
           
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando() == false)){
            this.setTocando(true);
        }
    } 

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() == true){
            this.setTocando(false);
        }
    }
       
        
}
