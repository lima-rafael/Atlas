package principal;

import java.util.Scanner;

import util.Cadastro;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro;
		
		System.out.println("Industrias Atlas");
		System.out.println("Tela de Cadastro");
		System.out.println("----------------------------------------------------------------");
		System.out.println("| Preencher os dados do cliente abaixo: ");
		System.out.print("| Nome: ");
		String name = sc.nextLine();
		System.out.print("| Email: ");
		String email = sc.nextLine();
		System.out.print("| Fone: ");
		double number = sc.nextInt();
		sc.nextLine();
		System.out.print("| Endereço: ");
		String end = sc.nextLine();
		System.out.print("| CEP: ");
		double cep = sc.nextInt();
		System.out.println("----------------------------------------------------------------");
		
		cadastro = new Cadastro(name, email, end, number, cep);
		
		System.out.println(cadastro);

		
		sc.close();
	}

}
