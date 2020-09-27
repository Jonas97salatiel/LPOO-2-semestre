package ex1and2and3and4;

public class Main {

	
	public static void main(String[] args) {
		
	System.out.println("EX02");
		
	Pedido ped1 = new Pedido(1);
	System.out.println(ped1.getNomeCliente());
	System.out.println(ped1.getDescPedido());
	ped1.setNomeCliente("Joana");
	ped1.setDescPedido("1 café com leite");
	System.out.println(ped1.getNomeCliente());
	System.out.println(ped1.getDescPedido());
	
	Pedido ped2 = new Pedido(2);
	System.out.println(ped2.getNomeCliente());
	System.out.println(ped2.getDescPedido());
	ped2.setNomeCliente("Tina");
	ped2.setDescPedido("1 suco de goiaba");
	System.out.println(ped2.getNomeCliente());
	System.out.println(ped2.getDescPedido());
	
	System.out.println("EX04");
	Cliente cliente1 = new Cliente(1);
	
	System.out.println(cliente1.getNomeCompleto());
	cliente1.setNomeCompleto("Lilia Chagas");
	System.out.println(cliente1.getNomeCompleto());
	
	Cliente cliente2 = new Cliente(1);
	
	System.out.println(cliente2.getNomeCompleto());
	cliente2.setNomeCompleto("Lilia Chagas");
	System.out.println(cliente2.getNomeCompleto());

	
	}

}
