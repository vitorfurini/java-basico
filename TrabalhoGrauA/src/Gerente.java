public class Gerente extends Funcionario implements Autenticavel{
	
	private double bonus;
	private String senha;
	
	public Gerente(String nome, String cracha, double salario, double dissidio, double bonus) {
		super(nome, cracha, salario, dissidio);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getSalarioMensal() {
		double salarioMensal = super.getSalarioMensal();
		return salarioMensal + ((100 * bonus) / salarioMensal);
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	@Override
	public String getSenha() {
		return senha;
	}
	
}
