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
public class ApostarSorteio extends Sorteio{
    
    protected Date dat_aposta;
    protected String nome;
    protected String  ticket; 

    public ApostarSorteio(Date dat_aposta, String nome, String ticket, String desc_sorteio, String desc_prod, double valor_prod, double valor_ticket, String data_reg, String vencimento, int cod_sorteio, boolean Status) {
        super(desc_sorteio, desc_prod, valor_prod, valor_ticket, data_reg, vencimento, cod_sorteio, Status);
        this.dat_aposta = dat_aposta;
        this.nome = nome;
        this.ticket = ticket;
    }
    
    
    
    
    public Date getDat_aposta() {
        return dat_aposta;
    }

    public void setDat_aposta(Date dat_aposta) {
        this.dat_aposta = dat_aposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public Sorteio cadastrarSorteio(Perfil r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
    }

    
    
    
    


   
    
    
    

