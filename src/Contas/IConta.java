package Contas;

public interface IConta {
	
	void sacar(double valor);		
	void transferir(double valor, Conta conta);
	void depositar(double valor);
	String tipoDeConta();
	void imprimirExtrato();
		
	

}
