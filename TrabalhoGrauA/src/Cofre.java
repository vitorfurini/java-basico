public class Cofre{
	public void autenticar (Autenticavel a) {
		if (a.autenticar(a.getSenha())) {
			System.out.println("Funcion�rio tem acesso ao cofre");
		} else {
			System.out.println("Funcion�rio n�o tem acesso ao cofre");
		}
	}
}
