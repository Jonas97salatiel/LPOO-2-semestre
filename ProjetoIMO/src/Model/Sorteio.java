/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;


/**
 *
 * @author Jonas
 */
public abstract class Sorteio {
    
    protected String desc_sorteio;
    protected String desc_prod;
    protected double valor_prod;
    protected double valor_ticket;
    protected String data_reg;
    protected String vencimento;
    protected int cod_sorteio;
    protected boolean Status;
   
    
    
    
    
    
    
    
    public Sorteio(){
        
    }

    public Sorteio(String desc_sorteio, String desc_prod, double valor_prod, double valor_ticket, String data_reg, String vencimento, int cod_sorteio, boolean Status) {
        this.desc_sorteio = desc_sorteio;
        this.desc_prod = desc_prod;
        this.valor_prod = valor_prod;
        this.valor_ticket = valor_ticket;
        this.data_reg = data_reg;
        this.vencimento = vencimento;
        this.cod_sorteio = cod_sorteio;
        this.Status = Status;
    }

   public abstract Sorteio cadastrarSorteio(Perfil r);
    
    
    
    
    public double getValor_ticket() {
        return valor_ticket;
    }

    public void setValor_ticket(double valor_ticket) {
        this.valor_ticket = valor_ticket;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public String getData_reg() {
        return data_reg;
    }

    public void setData_reg(String data_reg) {
        this.data_reg = data_reg;
    }

    public double getValor_prod() {
        return valor_prod;
    }

    public void setValor_prod(double valor_prod) {
        this.valor_prod = valor_prod;
    }

    public String getDesc_sorteio() {
        return desc_sorteio;
    }

    public void setDesc_sorteio(String desc_sorteio) {
        this.desc_sorteio = desc_sorteio;
    }

    public int getCod_sorteio() {
        return cod_sorteio;
    }

    public void setCod_sorteio(int cod_sorteio) {
        this.cod_sorteio = cod_sorteio;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    
}
