/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex2b;

/**
 *
 * @author Jonas
 */
public class Rica extends Pessoa{
    private double dinheiro;
    public Rica(String nome,int idade,double dinheiro){
        this.dinheiro = dinheiro;
    }
    
    public void fazCompra(){
        
     
    }
    
    public double getDinheiro(){
        return dinheiro;
    }
    
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
                
    }
    
    
    
    
}
