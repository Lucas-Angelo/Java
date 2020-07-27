/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodocomretorno;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MetodoComRetorno {

    /**
     * @param args the command line arguments
     */
    
    static int somar(int A, int B) {
        int s = A + B;
        return s;
    }
    
    static void mostrar(int num){
        System.out.println(num);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int res = somar(2,3);
        mostrar(res);
        
        System.out.println(Operacoes.contador(1,5)); //Em outra classe
        
    }
    
    
    
}
