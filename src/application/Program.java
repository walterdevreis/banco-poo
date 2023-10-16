package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Cliente;
import model.entities.Conta;
import model.entities.ContaCorrente;
import model.entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente;
		
		System.out.print("Digite o nome do novo cliente: ");
		String nome = sc.nextLine();
		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Digite o email: ");
		String email = sc.nextLine();
		System.out.print("Digite o telefone: ");
		String telefone = sc.nextLine();
		cliente = new Cliente(nome, cpf, email, telefone);		
		
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		System.out.println();
		System.out.print("Digite o valor para depositar na poupança: ");		
		double valor = sc.nextDouble();
		contaCorrente.depositar(valor);
		
		System.out.println();
		System.out.print("Digite o valor e conta do destinatario para transferir o valor: ");
		valor = sc.nextDouble();
		
		contaCorrente.transferir(valor, contaPoupanca);
		
		System.out.println();
		contaCorrente.imprimirExtrato();
		System.out.println();
		contaPoupanca.imprimirExtrato();
		
		sc.close();
	}
}
