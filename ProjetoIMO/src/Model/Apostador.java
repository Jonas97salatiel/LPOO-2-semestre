/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class Apostador extends Perfil{

    public Apostador(String nome, int id, double ticket) {
        super(nome, id, ticket);
        
    }

    public Apostador() {
    }
    
    
    

    @Override
    public Perfil cadastrarPerfil() {
        String s = JOptionPane.showInputDialog("Digite o nome: ");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: "));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Ticket: "));
        
        Perfil y = new Apostador(s,n,d);
        
        
        return y;
    }

    @Override
    public void consultarPerfil() {
        
    }
    
    
   
    
    
    
}
