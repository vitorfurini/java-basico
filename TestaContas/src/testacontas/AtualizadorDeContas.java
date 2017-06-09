package testacontas;

/**
 *
 * @author vitor.furini
 */
public class AtualizadorDeContas extends Conta {

    protected double saldoTotal = 0;
    private double selic;

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    // aqui você imprime o saldo anterior, atualiza a conta,
    // e depois imprime o saldo final
    // lembrando de somar o saldo final ao atributo saldoTotal

    public void roda(Conta c) {
        saldoTotal = selic + c.getSaldo();
    }

    // outros métodos, colocar o getter para saldoTotal!

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
