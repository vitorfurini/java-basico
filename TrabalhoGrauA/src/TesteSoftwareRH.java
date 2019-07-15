public class TesteSoftwareRH {

	public static void main(String[] args) {
		
		RelatorioSalarial relatorioSalarial = new RelatorioSalarial();
		
		//Testador com o nome Jo�o, crach� 3434, sal�rio: 2000, 
		//diss�dio de 100
		Testador testador = new Testador("Jo�o", "3434", 2000L, 100L);
		relatorioSalarial.registrarSalario(testador);
		System.out.println("Sal�rio do testador � " + testador.getSalarioMensal());
		
		//Desenvolvedor com o nome Patricia, crach� 988, sal�rio: 6000,
		//diss�dio de 300;
		Desenvolvedor desenvolvedor = new Desenvolvedor("Patr�cia", "988", 6000, 300);
		relatorioSalarial.registrarSalario(desenvolvedor);
		
		System.out.println("Sal�rio do desenvolvedor � " + desenvolvedor.getSalarioMensal());
		
		//Gerente com o nome Felipe, crach� 3434, sal�rio: 10000, 
		//diss�dio de 500 e b�nus de 50%;
		Gerente gerente = new Gerente("Felipe", "3434", 10000, 500, 50);
		relatorioSalarial.registrarSalario(gerente);
		System.out.println("Sal�rio do gerente � " + gerente.getSalarioMensal());
		
		//Secretaria com o nome Marcelo, cracha 10000, sal�rio: 1500,
		//diss�dio de 90;
		Secretaria secretaria = new Secretaria("Marcelo", "1500", 1500, 90);
		relatorioSalarial.registrarSalario(secretaria);
		System.out.println("Sal�rio da secretaria � " + secretaria.getSalarioMensal());
		
		//Tesoureiro com o nome Diogo, cracha 499, sal�rio: 5000,
		//diss�dio de 50;
		Tesoureiro tesoureiro = new Tesoureiro("Diogo", "499", 5000, 50);
		relatorioSalarial.registrarSalario(tesoureiro);
		System.out.println("Sal�rio do tesoureiro � " + tesoureiro.getSalarioMensal());
		
		System.out.println("Valor total de sal�rios � " + relatorioSalarial.getSomatorioSalario() );
		
	}
	
}
