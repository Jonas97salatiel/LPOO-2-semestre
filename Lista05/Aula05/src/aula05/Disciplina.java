/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonas
 */
public abstract class  Disciplina {
    private String nome;
    private String periodo;
    private double nota1;
    private double nota2;
    private double n;
        
    public Disciplina(){
        
    }
    
    public Disciplina(String nome,String periodo,double nota1,double nota2){
        this.nome = nome;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;    
    }
    
    public void avaliarDisciplina(String nome,String periodo){
        nome = JOptionPane.showInputDialog("Informe seu nome:","nome");
        periodo = JOptionPane.showInputDialog("Informe seu periodo:","periodo");
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
     public double getN(){
        return n;
    }
    
    public void setN(double n){
        this.n = n;
    }
    
    
}
