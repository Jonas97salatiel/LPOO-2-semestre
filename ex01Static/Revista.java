package ex01Static;

public class Revista implements ItemDeBiblioteca{
	
private int estoque;
	

	public Revista(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public boolean disponivel() {
		if(estoque <= 0) {
			System.out.println("Livro est� emprestado");
		return false;
		}else {
			System.out.println("Livro est� dispon�vel");
		return true;
		}
	}

	@Override
	public boolean emprestado() {
		if(estoque <= 0) {
			System.out.println("Livro est� dispon�vel");
			return false;
			}else {
				System.out.println("Livro est� emprestado");
			return true;
			}
	}
	
	@Override
	public boolean emAtraso() {
		System.out.println(true);
		return true;
	}

	@Override
	public boolean reservado() {
		System.out.println(true);
		return true;
	}
	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
