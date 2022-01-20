package Contas;

import Clientes.Cliente;

public class ContaCorrente extends Conta {
	
	private static final String CONTA_TIPO ="Corrente"; 	

	
	public ContaCorrente(Cliente cliente) {
		super(cliente, CONTA_TIPO);
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);			
		
	}
	
	@Override
	public void transferir(double valor, Conta conta) {
		
		if(valor>0 && valor <= super.getSaldo()) {
			super.sacar(valor);
			conta.depositar(valor);
		}
				
	}

	@Override
	public void depositar(double valor) {
		if(valor>0)
		super.depositar(valor);
		
	}

	@Override
	public String tipoDeConta() {
		return CONTA_TIPO;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(this.toString());
		
	}
}
