/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author Jonas
 */
public class Questao4 {
    
    
    public static void main(String[] args) {
        int []v = {1,2,3,4};
        int r = somar(v,0);
        System.out.println(r);
    }
 
    private static int somar(int[] v, int n){
        if(n< v.length){
            return v[n] + somar(v, n +1);
        }else{
            return 0;
    }
        
    
}    
}    
    

