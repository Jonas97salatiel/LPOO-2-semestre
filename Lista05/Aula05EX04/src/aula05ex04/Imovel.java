/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex04;

/**
 *
 * @author Jonas
 */
public abstract class Imovel {
    private String endereco;
    private double preco;
    
    public Imovel(){
        
    }
    
    public Imovel(String endereço,double preco){
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
