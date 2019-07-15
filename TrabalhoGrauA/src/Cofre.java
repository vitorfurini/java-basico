public class Cofre{
	public void autenticar (Autenticavel a) {
		if (a.autenticar(a.getSenha())) {
			System.out.println("Funcionário tem acesso ao cofre");
		} else {
			System.out.println("Funcionário não tem acesso ao cofre");
		}
	}
}
