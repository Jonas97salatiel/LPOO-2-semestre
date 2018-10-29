/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao8;

/**
 *
 * @author Jonas
 */
public class Questao8 {
    public static void main(String[] args) {
        System.out.println(mult(8,6));
    }
    
    static int mult(int n, int m){
        
        if (n == 0 || m == 0) {
            return 0;
        }if (m == 1){
            return n;   
        }else{
            
        return n + mult(n,m -1);
    }
    }
    
    
    
    
}
