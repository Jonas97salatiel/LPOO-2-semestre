/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonas
 */
public class Principal {
    public static void main(String[]Args){
        
       AssistenteAdministrativo a1 = new AssistenteAdministrativo
        ("Jonas",20,1.70,"masculino",1.200,"asdasdas","Noturno",200);
        
       AssistenteTecnico a2 = new AssistenteTecnico
        ("Rai",40,1.60,"masculino",1.200,"asdasss");
       
       a2.exibirDados();
        
    }
}
