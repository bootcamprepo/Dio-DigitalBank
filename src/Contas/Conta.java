package Contas;

import Clientes.Cliente;



public abstract class Conta implements IConta {
	private static int SEQUENCIAL = 99;
	private static final int AG_BANK_DIGITAL = 1;
	private int agencia;
	private int numeroConta;
	private double saldo=0.0;
	private Cliente cliente;
	private String tipoConta;
	
	
	public Conta(Cliente cliente, String tipoconta) {
		agencia = AG_BANK_DIGITAL;
		numeroConta = ++SEQUENCIAL;
		this.cliente = cliente;
		this.tipoConta=tipoconta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {		
		if(valor>0) {
			saldo+=valor;
		}		
	}
	
	public void sacar(double valor) {
		if(valor>0) {
			saldo-=valor;
		}
	}
	
	
	
	
	
	@Override
	public String toString() {
		return  "Nome: " + cliente.getNome() + "\nConta " + tipoConta + "\nagencia: " + agencia + "\nnumero: " + numeroConta + "\nsaldo: " + saldo;
	}
	
	
	
	
	
	
	

}
