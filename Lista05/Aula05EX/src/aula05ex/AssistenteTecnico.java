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
public class AssistenteTecnico extends Funcionario{
    private String matricula;
    public AssistenteTecnico(String nome,int idade,double altura,String sexo,double salario,String matricula){
        super(nome, idade, altura, sexo, salario);
        this.matricula = matricula;
    }
    
    
    
    @Override
   public void exibirDados(){
            JOptionPane.showMessageDialog(null,"Dados"+"\nnome: "+getNome()+"\nidade: "+getIdade()+
             "\naltura: "+getAltura()+"\nsexo"+getSexo()+"\nsalario"+getSalario()+
             "\nmatricula: "+getMatricula());
    }
    
    
    
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
