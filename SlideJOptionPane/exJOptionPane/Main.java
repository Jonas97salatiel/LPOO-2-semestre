package exJOptionPane;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
		String idade = JOptionPane.showInputDialog("Qual a sua idade ?");
		String menssage1 = String.format("%s, você já pode tirar CNH", nome);
		String menssage2 = String.format("%s, você ainda não pode tirar CNH, você tem apenas %s anos", nome, idade);
		
		
		int idadeInt = Integer.parseInt(idade);
		
		
		
		if(idadeInt > 17) {
			JOptionPane.showMessageDialog(null, menssage1);
		}else {
			JOptionPane.showMessageDialog(null, menssage2);
		}
		

	}

}
