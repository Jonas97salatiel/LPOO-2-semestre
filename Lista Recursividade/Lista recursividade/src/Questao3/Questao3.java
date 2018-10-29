/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author Jonas
 */
public class Questao3 {
    
    public static void main(String[] args) {
        
        System.out.print(invertendo(12345, 0));
        
        
    }
    
    static int invertendo(int n, int total){
        
        if (n == 0) {
            return total;
        }else{
            return invertendo (n/10, total * 10 + n % 10);
        }
        
        
    }
    
}