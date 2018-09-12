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
public class DisciplinaTrimestral extends Disciplina {
  
    public DisciplinaTrimestral(String nome,String periodo,double nota1,double nota2,double n){
         super(nome,periodo,nota1,nota2);
         
         
    }

    DisciplinaTrimestral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
    
    public void avaliarDisciplina(double nota1,double nota2,double n) {
        
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1","0,00"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2","0,00"));
        n = (nota1*0.4)+(nota2*0.6);  
        JOptionPane.showMessageDialog(null, "Resultado do trimestre"+"\nnome: "+getNome()+"\nPeriodo: "+getPeriodo()+
                "sua média é : "+getN());
                                        
    }

    void avaliarDisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
    
    
}
