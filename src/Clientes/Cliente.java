package Clientes;

public class Cliente {
	
	private static Integer codigo_Cliente=0;
	private String nome;
	private Integer idade;
	private String endereco;
	
	public Cliente(String nome, Integer idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		++codigo_Cliente; 
	}

	public static Integer getCodigo_Cliente() {
		return codigo_Cliente;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	

}
