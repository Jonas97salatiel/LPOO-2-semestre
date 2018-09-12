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
public class DisciplinaAnual extends Disciplina{
    private double nota3;
    private double nota4;
    private double nota5;
    private double nota6;
    public DisciplinaAnual(String nome,int periodo,double nota1,double nota2,
            double nota3,double nota4,double nota5,double nota6,double n){
        
    }
    
    public void avaliarDisciplina(double nota1,double nota2,double nota3,double nota4,double nota5,
            double nota6,double n,double n1,double n2){
        n = ((nota1+nota2+nota3+nota4+nota5)/5*0.6)+(nota6 * 0.4);
    }
    public double getNota3(){
        return nota3;
    }
    
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    
    public double getNota4(){
        return nota4;
    }
    
    public void setNota4(double nota4){
        this.nota4 = nota4;
    }
    
    public double getNota5(){
        return nota5;
    }    
    
    public void setNota5(double nota5){
        this.nota5 = nota5;
    }
    
    public double getNota6(){
        return nota6;
    }
    
    public void setNota6(double nota6){
        this.nota6 = nota6;
    }
    
   
    
    
}
