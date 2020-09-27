package ex1and2and3and4;

public class Cliente {

	int codCliente;
	String nomeCompleto;
	
	public Cliente(int codCliente) {

		this.codCliente = codCliente;
		
	}
	

	public Cliente(int codCliente, String nomeCompleto) {

		this.codCliente = codCliente;
		this.nomeCompleto = nomeCompleto;
	}
	
	
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	
	
	
	
}
