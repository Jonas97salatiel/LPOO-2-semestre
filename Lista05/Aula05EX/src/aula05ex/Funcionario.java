/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex;
import javax.swing.JOptionPane;
/**
 *
 * @author Jonas
 */
public abstract class Funcionario {
    private String nome;
    private int idade;
    private double altura;
    private String sexo;
    private double salario;
    
    public Funcionario(){
        
    }
        public Funcionario(String nome,int idade,double altura,String sexo,double salario){
        this.nome  = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.salario = salario;
    }
        public void exibirDados(){
            JOptionPane.showMessageDialog(null,"Dados"+"\nnome: "+getNome()+"\nidade: "+getIdade()+
                    "\naltura: "+getAltura()+"\nsexo"+getSexo()+"\nsalario"+getSalario());
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
