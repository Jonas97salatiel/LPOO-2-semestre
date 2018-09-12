/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonas
 */
public class Principal {
    public static void main(String [] Args){
        
        String n1 = JOptionPane.showInputDialog("Informe seu nome:"+"nome");
        String n2 = JOptionPane.showInputDialog("Informe seu perido");
        double n = 0;
        
        Disciplina p = new DisciplinaTrimestre(n1,n2,n);
        
        
        
    }
    
}
