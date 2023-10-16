package model.entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Agencia: " + super.agencia);
		System.out.println("Conta Corrente: " + super.numero);
		System.out.println("Nome: " + super.cliente.getNome());
		System.out.println("CPF: " + super.cliente.getCpf());
		System.out.println("Saldo: " + super.getSaldo());
	}
}
