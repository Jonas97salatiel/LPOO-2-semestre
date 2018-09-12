/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex2;

/**
 *
 * @author Jonas
 */
public abstract class Animal{
    private String nome;
    private String raca;
    private String n = "caminhando..";
    
    public Animal(){
        
    }
    public Animal(String nome){
        
    }
    public String Caminha(){
        return n;
        
    }
        
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome  = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
    
}
