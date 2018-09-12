/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class Usado extends Imovel{
    private double desc;
    public Usado(String endereço, double preco,double desc) {
        super(endereço, preco);
        this.desc = desc;
    }
    
     public void imprimirValor(double n){
        n = this.getPreco()-getDesc();
        JOptionPane.showMessageDialog(null, "valor total: "+n);
    }    
    

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }
    
    
    
    
}
