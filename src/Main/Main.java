package Main;

import Clientes.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Jose da Silva",55,"R. da flores");
				
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		System.out.println("Conta criada e antes da transferencia\n");
		cc.imprimirExtrato();
		System.out.println("\n------------\n");
		poupanca.imprimirExtrato();

		cc.depositar(-100);
		System.out.println("\nEXTRATO APOS DEPOSITO\n");
		cc.imprimirExtrato();
		
		cc.transferir(100, poupanca);
		
		System.out.println("\nDEPOIS DA TRANSFEERENCIA\n");
		
		
		
		cc.imprimirExtrato();
		System.out.println("\n------------\n");
		poupanca.imprimirExtrato();

	}

}
