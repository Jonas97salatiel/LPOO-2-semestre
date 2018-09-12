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
public class Novo extends Imovel{
    private double advalor;
    public Novo(String endereço, double preco,double advalor) {
        super(endereço, preco);
    
    }
    
    public void imprimirValor(double n){
        n = this.getPreco() + this.advalor;
        JOptionPane.showMessageDialog(null, "valor total: "+n);
    }    
    
    

    public double getAdvalor() {
        return advalor;
    }

    public void setAdvalor(double advalor) {
        this.advalor = advalor;
    }
    
    
}
