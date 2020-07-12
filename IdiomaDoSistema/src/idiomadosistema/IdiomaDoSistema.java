package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale localizacao = Locale.getDefault();
        
        System.out.print("Idioma do sistema é: ");
        System.out.println(localizacao.getDisplayLanguage());
    }
    
}
