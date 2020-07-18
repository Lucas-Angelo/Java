/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.printf("A media é igual a %.2f \n", m);
        
        int soma = 5;
        soma++;
        System.out.printf("A soma é %d \n", soma);
        
        //Pré incremento
        int numPre = 5;
        int somatorioPre = 10 + ++numPre;
        System.out.printf("O somatório pre é %d. E numPre e: %d \n", somatorioPre, numPre);
        
        //Pós incremento, só faz após efetuar o cálculo
        int numPos = 5;
        int somatorioPos = 10 + numPos++;
        System.out.printf("O somatório pos é %d. E numPos e: %d \n", somatorioPos, numPos);
        
        float f = 8.3f;
        int arF = (int) Math.floor(f); // Arredonda pra baixo
        System.out.printf("Floor: %d \n", arF);
        
        float c = 8.3f;
        int arC = (int) Math.ceil(c); // Arredonda pra cima
        System.out.printf("Ceil: %d\n", arC);
        
        float x = 8.3f;
        int ar = (int) Math.round(x); // Arredonda aritmeticamente
        System.out.printf("Aritmetic: %d\n", ar);
        
        double randomico = Math.random(); // Gera um numero aleatório entre 0 e 1
        System.out.printf("Número aleatório: %.2f\n", randomico);
        
        int randomicoMax = (int) (5 + randomico * (10-5)); // Número aleatório entre 5 e 10
        System.out.printf("Aleatório entre 5 e 10: %d\n", randomicoMax);
    }
    
}
