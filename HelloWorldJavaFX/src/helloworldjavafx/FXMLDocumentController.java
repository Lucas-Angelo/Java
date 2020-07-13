package helloworldjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable { // Implementa na classe os gráficos
    
    @FXML
    private Label lblMensagem; // Adiciona o label de texto criado
    private Button btnClique; // Adiciona o botão criado
    
    @FXML
    private void clicouBotao(ActionEvent event) { // Quando clicar no botão
        lblMensagem.setText("Hello World!"); //Trocar o texto do label
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
