package ex1and2and3and4;

public class Pedido {

	int codPedido;
	String nomeCliente;
	String descPedido;
	
	
	public Pedido(int codPedido, String nomeCliente, String descPedido) {
		
		setCodPedido(codPedido);
		setNomeCliente(nomeCliente);
		setDescPedido(descPedido);
		
	}
	
	public Pedido(int codPedido) {
		
		setCodPedido(codPedido);

	}
	
	


	public int getCodPedido() {
		return codPedido;
	}


	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getDescPedido() {
		return descPedido;
	}


	public void setDescPedido(String descPedido) {
		this.descPedido = descPedido;
	}
	
	
	
	
	
}
