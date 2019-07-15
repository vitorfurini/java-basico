public class Tesoureiro extends Funcionario implements Autenticavel{

	private String senha;

	public Tesoureiro(String nome, String cracha, double salario, double dissidio) {
		super(nome, cracha, salario, dissidio);
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
