public class Funcionario {
	
	//atríbutos
	private String nome;
	private String cracha;
	private double salario;
	private double dissidio;
	
	public Funcionario(String nome, String cracha, double salario, double dissidio) {
		super();
		this.nome = nome;
		this.cracha = cracha;
		this.salario = salario;
		this.dissidio = dissidio;
	}
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCracha() {
		return cracha;
	}
	public void setCracha(String cracha) {
		this.cracha = cracha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getDissidio() {
		return dissidio;
	}
	public void setDissidio(double dissidio) {
		this.dissidio = dissidio;
	}
	
	public double getSalarioMensal(){
		return salario + dissidio;
	}
}