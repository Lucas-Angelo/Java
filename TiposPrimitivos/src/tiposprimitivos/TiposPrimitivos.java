/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in); // Criando entrada de dados
        
        float nota = 8.5f; // Ou: float nota = (float) 8.5; Ou: Float nota = new Float(8.5)
        
        System.out.format("Digite o nome: ");
        String nome = entrada.nextLine(); //Receber o nome por entrada de dado string. Para int é .nextInt(), float .nextFloat()... etc
        
        System.out.println("A nota e: " + nota); // Padrão usando sout + TAB
        System.out.printf("A nota formatada e: %.2f \n", nota); // printf, o f significa formatado. .2f significa 2 casas decimais para o tipo float
        System.out.format("A nota usando formart e: %.2f \n", nota); // Mesmo coisa que o printf
        
        System.out.printf("A nota de %s é: %.2f \n", nome, nota);
        
    }
    
}
