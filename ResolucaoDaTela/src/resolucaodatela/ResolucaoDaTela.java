package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.print("A resolução da tela é: ");
        System.out.println(tamanhoDaTela.width + " x " + tamanhoDaTela.height);
    }
    
}
