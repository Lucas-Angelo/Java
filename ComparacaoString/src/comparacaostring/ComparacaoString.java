/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Lucas";
        String nome2 = "Lucas";
        String nome3 = new String("Lucas");
        String res;
        //Para objetos, não usar ==, usar equals
        res = (nome1.equals(nome3))?"igual":"diferente"; //Para verficiar se conteúdo é igual, usar equals
        System.out.println(res);
    }
    
}
