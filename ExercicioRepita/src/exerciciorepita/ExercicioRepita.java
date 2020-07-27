/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane; //Importar telas prontas do Swing

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hello World!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE); //null é o nome da janela, depois é o texto dentro, após isso é o texto de cima e o tipo
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
        JOptionPane.showMessageDialog(null, "Você digitou valor " + n);
        
        int num, s=0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br><em>(0 para sair)</em></html>"));
            JOptionPane.showMessageDialog(null, "Você digitou valor " + num);
            s += num;
        } while (num != 0);
        
        JOptionPane.showMessageDialog(null, "Soma total: " + s);
    }
    
}
