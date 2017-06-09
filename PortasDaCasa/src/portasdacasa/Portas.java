package portasdacasa;

/**
 *
 * @author vitor.furini
 */
public class Portas {
    
    
    boolean portaAberta = true;
    int quantasPortasEstaoAbertas = 0;
    
    
    //true para aberta e false para fechada.
    
    void p1Abre(){
        if(portaAberta == true){ 
            System.out.println("A porta 1 foi aberta");
        }
    }
    void p1Fecha(){
        if(portaAberta == false){
            System.out.println("A porta 1 foi fechada");
        }
    }
    void p1EstaAberta(){
        if(portaAberta == true){
            this.quantasPortasEstaoAbertas = this.quantasPortasEstaoAbertas + 1;
            System.out.println("A porta 1 está aberta");
        }else{
            System.out.println("A porta 1 está fechada");
        }
    }
    void p2Abre(){
        if(portaAberta == true){
            System.out.println("A porta 2 foi aberta");
        }
    }
    void p2Fecha(){
        if(portaAberta == false){
            System.out.println("A porta 2 foi fechada");
        }
    }
    void p2EstaAberta(){
        if(portaAberta == true){
            quantasPortasEstaoAbertas = quantasPortasEstaoAbertas + 1;
            System.out.println("A porta 2 está aberta");
                        
        }else{
            System.out.println("A porta 2 está fechada");
        }   
    }
    void p3Abre(){
        if(portaAberta == true){
            System.out.println("A porta 3 foi aberta");
        }
    }
    void p3Fecha(){
        if(portaAberta == false){
            System.out.println("A porta 3 foi fechada");
        }
    }
    void p3EstaAberta(){
        if(portaAberta == true){
            quantasPortasEstaoAbertas = quantasPortasEstaoAbertas + 1;
            System.out.println("A porta 3 está aberta");
                        
        }else{
            System.out.println("A porta 3 está fechada");
        }   
    }
    void p4Abre(){
        if(portaAberta == false){
            System.out.println("A porta 4 foi aberta");
        }
   }
    void p4Fecha(){
        if(portaAberta == true){
            System.out.println("A porta 4 foi fechada");
        }
    }
    void p4EstaAberta(){
        if(portaAberta == false){
            this.quantasPortasEstaoAbertas = this.quantasPortasEstaoAbertas + 1;
            System.out.println("A porta 4 está aberta");
        }else{
            System.out.println("A porta 4 está fechada");
        }
    }
    void portasAbertas(){
        
        System.out.println("Portas abertas: " + this.quantasPortasEstaoAbertas);
    }
}       
    

