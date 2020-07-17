/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertertiposparastring;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class ConverterTiposParaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade); // Converte o tipo inteiro idade para string, e salva em valor
        System.out.println(valor);
    }
    
}
