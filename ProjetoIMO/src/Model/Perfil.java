/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jonas
 */
public abstract class Perfil {
    
    protected String nome;
    protected int id;
    protected double ticket;
    

    public Perfil(){
        
    }   

    public Perfil(String nome, int id, double ticket) {
        this.nome = nome;
        this.id = id;
        this.ticket = ticket;
    }
    
    public abstract Perfil cadastrarPerfil();
    public abstract void consultarPerfil();
       
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
