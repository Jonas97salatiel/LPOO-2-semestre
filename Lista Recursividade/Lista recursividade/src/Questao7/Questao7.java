/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

/**
 *
 * @author Jonas
 */
public class Questao7 {
    
    public static void main(String[] args) {
        System.out.println(questao7(123431, 3, 0));
    }
    
    
    
    
     static int questao7(int n, int a, int i) {
	if(n % 10 == a) {
		i++;
	}
	if(n % 10 == n) {
		return i;
	}
	return questao7(n / 10, a, i);
}
}
