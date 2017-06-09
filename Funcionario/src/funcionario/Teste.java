package funcionario;

/**
 *
 * @author vitor.furini
 */
public class Teste {

    private String nome;
    private String departamento;
    private String dataEntrada;
    private String RG;
    double salario;
    private double aumento;
    private double ganhoAnual;
    private double bonus;
    private boolean naEmpresa;

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isNaEmpresa() {
        return naEmpresa;
    }

    public void setNaEmpresa(boolean naEmpresa) {
        this.naEmpresa = naEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
        RG = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setRecebeAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getRecebeAumento() {
        return aumento;
    }

    double ganhoAnual() {
        this.ganhoAnual = ((salario * 12) + aumento + bonus);
        return ganhoAnual;
    }
}
