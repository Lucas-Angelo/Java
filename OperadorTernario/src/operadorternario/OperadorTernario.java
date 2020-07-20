/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1; // CONDIÇÃO ? r recebe 0 se condição for V : r = 1 se for falsa
        System.out.println(r);
        
        int num1=10, num2=8, maior;
        maior = (num1>num2)?n1:n2;
        System.out.printf("O maior e %d\n", maior);
    }
    
}
