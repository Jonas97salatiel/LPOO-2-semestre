package ex02Static;

public class CDPlayer implements AparelhoDeSom{
	
private int volume;
	
	public CDPlayer(int volume) {
		
		this.volume = volume;
		
	};

	@Override
	public boolean liga() {
		
		System.out.println("Aparelho está ligado");
		return true;
	}

	@Override
	public boolean desliga() {
		
		System.out.println("Aparelho está desligado");
		return false;
	}

	@Override
	public void aumentaVolume(int valor) {
		
		this.volume = this.volume + valor;
		System.out.printf("Volume: ", this.volume);
		return;
	}

	@Override
	public void diminuiVolume(int valor) {

		
		this.volume = this.volume - valor;
		
		if(this.volume < 0) {
			this.volume = 0;
			System.out.println("Volume no minimo");
		}
		
		System.out.printf("Volume: ", this.volume);
		return;

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
