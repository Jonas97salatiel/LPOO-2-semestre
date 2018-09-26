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
public class Registrador extends Perfil {

    public Registrador() {
    }

    public Registrador(String nome, int id, double ticket) {
        super(nome, id, ticket);
        
        
       }  

    public Perfil cadastrarPerfil(){
       
        String s = JOptionPane.showInputDialog("Digite o nome: ");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: "));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Ticket: "));
        
        Perfil x = new Registrador(s, n, d);
        
        return x;
    }

    public  void consultarPerfil(){
        JOptionPane.showMessageDialog(null,"Nome: "+this.nome+
                             "\nID: "+this.id+
                              "\nSeus ticket´s: "+this.ticket  );
    }



}
