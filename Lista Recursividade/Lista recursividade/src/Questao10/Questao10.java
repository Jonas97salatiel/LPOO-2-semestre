/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao10;

/**
 *
 * @author Jonas
 */
public class Questao10 {
    
     public static void main(String[] args) {
        System.out.println(cresc(8));
    }
    
    
    
    
    static int cresc(int n){
        
        if (n == -1) {
            return 0;
        }
        
        System.out.print(n);
        return cresc(n -1);
    }
    
}
