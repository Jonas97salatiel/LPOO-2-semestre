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
public abstract class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome,int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
    
}
