public class TesteSoftwareRH {

	public static void main(String[] args) {
		
		RelatorioSalarial relatorioSalarial = new RelatorioSalarial();
		
		//Testador com o nome João, crachá 3434, salário: 2000, 
		//dissídio de 100
		Testador testador = new Testador("João", "3434", 2000L, 100L);
		relatorioSalarial.registrarSalario(testador);
		System.out.println("Salário do testador é " + testador.getSalarioMensal());
		
		//Desenvolvedor com o nome Patricia, crachá 988, salário: 6000,
		//dissídio de 300;
		Desenvolvedor desenvolvedor = new Desenvolvedor("Patrícia", "988", 6000, 300);
		relatorioSalarial.registrarSalario(desenvolvedor);
		
		System.out.println("Salário do desenvolvedor é " + desenvolvedor.getSalarioMensal());
		
		//Gerente com o nome Felipe, crachá 3434, salário: 10000, 
		//dissídio de 500 e bônus de 50%;
		Gerente gerente = new Gerente("Felipe", "3434", 10000, 500, 50);
		relatorioSalarial.registrarSalario(gerente);
		System.out.println("Salário do gerente é " + gerente.getSalarioMensal());
		
		//Secretaria com o nome Marcelo, cracha 10000, salário: 1500,
		//dissídio de 90;
		Secretaria secretaria = new Secretaria("Marcelo", "1500", 1500, 90);
		relatorioSalarial.registrarSalario(secretaria);
		System.out.println("Salário da secretaria é " + secretaria.getSalarioMensal());
		
		//Tesoureiro com o nome Diogo, cracha 499, salário: 5000,
		//dissídio de 50;
		Tesoureiro tesoureiro = new Tesoureiro("Diogo", "499", 5000, 50);
		relatorioSalarial.registrarSalario(tesoureiro);
		System.out.println("Salário do tesoureiro é " + tesoureiro.getSalarioMensal());
		
		System.out.println("Valor total de salários é " + relatorioSalarial.getSomatorioSalario() );
		
	}
	
}
