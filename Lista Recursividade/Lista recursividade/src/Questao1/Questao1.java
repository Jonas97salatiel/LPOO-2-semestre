
package Questao1;


public class Questao1 {
    public static void main(String[]Args){
     
        System.out.println(fatorial(5));
        
        
    }
    public static int fatorial(int n){
        if(n == 0){
            return  1;
        }else{
            System.out.println(n);
            return n*fatorial(n- 1);
            
        }
            
    }
        
    
    
    
}
