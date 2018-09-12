
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex;

/**
 *
 * @author Jonas
 */
public class AssistenteAdministrativo extends Funcionario{
    private String matricula;
    private boolean turno;
    private double adicional;
    public AssistenteAdministrativo(String nome,int idade,double altura,
            String sexo,double salario,String matricula,String turno,double adicional){
                super(nome, idade, altura, sexo, salario);
                this.adicional = adicional;
                this.adicional = adicional;
                
    }
    
    
    
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
