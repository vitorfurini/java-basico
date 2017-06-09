package funcionario;

/**
 *
 * @author vitor.furini
 */
public class Gerente extends Teste {
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }
}
