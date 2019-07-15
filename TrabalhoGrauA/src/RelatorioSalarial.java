public class RelatorioSalarial {
	
	private double somatorioSalario = 0;
	
	public void registrarSalario(Funcionario funcionario){
		somatorioSalario += funcionario.getSalarioMensal();
	}
	
	public double getSomatorioSalario(){
		return somatorioSalario;
	}
}
