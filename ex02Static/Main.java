package ex02Static;

public class Main {

	public static void main(String[] args) {
		
		AparelhoDeSom01 obj01 = new AparelhoDeSom01(5);
		
		
		obj01.liga();
		
		obj01.aumentaVolume(2);
		
		obj01.diminuiVolume(4);
		
		obj01.desliga();
		
		CDPlayer obj02 = new CDPlayer(5);
		
		obj02.liga();
		
		obj02.aumentaVolume(2);
		
		obj02.diminuiVolume(4);
		
		obj02.desliga();
		
		Radio obj03 = new Radio(5);
		
		obj03.liga();
		
		obj03.aumentaVolume(2);
		
		obj03.diminuiVolume(4);
		
		obj03.desliga();

	}

}
