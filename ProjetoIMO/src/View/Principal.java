
package View;


import Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

   public static void main(String[] args) {

        ArrayList<Perfil> p = new ArrayList<>();
        
        ArrayList<Sorteio> r = new ArrayList<>();
        int op;
        int op2;
        int op3=0;
        int n3=0;
        String cons;
        //Menu Principal 

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada:"
                    + "\n 1 - Cadastrar Usuario"
                    + "\n 2 - Cadastrar Sorteio"
                    + "\n 3 - Consultar Usuario"));

            switch (op) {
                
                //Cadastrar Perfil
                case 1:
                    
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada:"
                            + "\n 1 - Cadastrar Registrador"
                            + "\n 2 - Cadastrar Apostador"));
                    switch (op2) {
                        case 1:
                            Perfil x = new Registrador();
                            p.add(x.cadastrarPerfil());
                            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso !");

                            break;
                        case 2:
                            Perfil y = new Apostador();
                            p.add(y.cadastrarPerfil());
                            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso !");
                            break;

                    }

                    break;

                //Cadastrar Sorteio
                case 2:
                    
                  op3 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua opção"
                            + "\n1Para  cadastrar um sorteio digite (1) "
                            + "\n Para consultar um sorteio digite (2)"));
                    
                    switch(op3){
                        
                        
                        case   1:
                    Sorteio s = new RegistrarSorteio();
                    
                    cons = JOptionPane.showInputDialog("Digite o nome do Usuario:");
                    for(int i = 0; i < p.size(); i++){
                        if(cons == (p.get(i).getNome())  ){
                           n3 = i;
                        }
                    }
                    r.add(s.cadastrarSorteio(p.get(n3)));
                        case 2:
                    cons = JOptionPane.showInputDialog("Digite o nome do Usuario:");
                        for(int i = 0; i < p.size(); i++){
                            
                        }
                    
                    break;
        }
                // Consultar Perfil
                case 3:
                    
                    
                    
                    cons = JOptionPane.showInputDialog("Digite o nome do Usuario:");
                    for(int i = 0; i < p.size(); i++){
                        if(cons.equals  (p.get(i).getNome())  ){
                           p.get(i).consultarPerfil();
                        }
                    }
                    break;

            }
        } while (op != 4);

    }

}
