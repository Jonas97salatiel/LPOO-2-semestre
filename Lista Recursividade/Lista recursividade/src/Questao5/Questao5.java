/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

/**
 *
 * @author Jonas
 */
public class Questao5 {
    
    public static void main(String[] args) {
        System.out.print(somar(100) + " ");
    }
    
    
    static int somar(int n){
        
        if (n==1) {
            return 1;
        }
        return n +somar(n -1);
    }
    
}
