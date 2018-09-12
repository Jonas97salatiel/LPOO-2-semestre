/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

/**
 *
 * @author Jonas
 */
public class DisciplinaSemestral extends Disciplina{
    private double nota3;
    
    public DisciplinaSemestral(String nome,int periodo,double nota1,double nota2,double nota3,double n){
      this.nota3 = nota3;          
                
    }
    
    public void avaliarDisciplina(double nota1,double nota2,double nota3,double n){
        n = (nota1+nota2+nota3)/3;
    }
    
    public double getNota3(){
        return nota3;
    }
    
    public void setNota3(double nota3){
        this.nota3=nota3;
    }
        
}
