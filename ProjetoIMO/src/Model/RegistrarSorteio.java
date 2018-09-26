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
public class RegistrarSorteio extends Sorteio{
    
    protected Perfil objperf;
    //protected String id;

    public RegistrarSorteio() {
    }

    
    public RegistrarSorteio(Perfil objperf, String desc_sorteio, String desc_prod, double valor_prod, double valor_ticket, String data_reg, String vencimento, int cod_sorteio, boolean Status) {
        super(desc_sorteio, desc_prod, valor_prod, valor_ticket, data_reg, vencimento, cod_sorteio, Status);
        this.objperf = objperf;
       
    }

    public Sorteio cadastrarSorteio(Perfil r){
        
        
        String desc_sorteio = JOptionPane.showInputDialog("Descrição do sorteio","Sorteio"); 
        String desc_prod = JOptionPane.showInputDialog("Descrição do produto","sua id"); 
        double valor_prod = Double.parseDouble(JOptionPane.showInputDialog("Valor","0.00")); 
        double valor_ticket = Double.parseDouble(JOptionPane.showInputDialog("Valor do ticket","0.00")); 
        String data_reg = JOptionPane.showInputDialog("Descrição do sorteio","Sorteio");  
        String vencimento = JOptionPane.showInputDialog("Descrição do sorteio","Sorteio"); 
        int cod_sorteio = Integer.parseInt(JOptionPane.showInputDialog("Descrição do sorteio","Sorteio"));  
        boolean Status = true; 
        
        Sorteio x = new RegistrarSorteio(r, desc_sorteio, desc_prod, valor_prod, valor_ticket, data_reg, vencimento, cod_sorteio, Status);
       return x; 
    }

    
    



    
    
    
    
    
}
