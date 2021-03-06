package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.println("Quantos funcionarios deseja cadastrar?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salario: ");
			double salary = sc.nextDouble();
			
			if(list.stream().filter(x -> x.getId() == id).findFirst().orElse(null) == null) {
				list.add(new Funcionario(id, name, salary));
			}
			else {
				System.out.println("Id repetido! Informe outro id");
				i--;
			}
		}
		System.out.println();
		System.out.println("funcionarios adicionados: ");
		for(Funcionario obj : list) {
			System.out.println(obj);
		}
	}
}
