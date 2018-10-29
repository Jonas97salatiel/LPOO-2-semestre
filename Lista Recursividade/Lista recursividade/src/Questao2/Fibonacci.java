/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

public class Fibonacci {

    public Fibonacci() {
    }
  
    int fibonacci(int n){
        
        if (n < 2) {
            return 1;
        }else{
        return fibonacci(n -1) + fibonacci(n -2);
    }
    }
    
    
    
    public static void main(String[] Args){
    
        Fibonacci f1 = new Fibonacci();
        for (int i = 0; i < 10; i++) {
        System.out.print(f1.fibonacci(i) + (" "));    
        }
        
       
        
    }
    
}
