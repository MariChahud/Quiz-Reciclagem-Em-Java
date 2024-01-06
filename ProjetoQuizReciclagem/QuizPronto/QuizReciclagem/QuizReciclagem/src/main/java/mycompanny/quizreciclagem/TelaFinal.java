/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanny.quizreciclagem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import static mycompanny.quizreciclagem.Controladores.pontuacao;


public class TelaFinal implements Initializable{
    
    @FXML
    private Text Resultado;
    
     @FXML
    private void mudarParaTelaInicial() throws IOException {
        App.setRoot("telainicial");
        pontuacao = 0;        
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(pontuacao > 0){
            String resu = Integer.toString(pontuacao);
            this.Resultado.setText(resu);
        }else{
            this.Resultado.setText("0");
        }
    }
    
}
