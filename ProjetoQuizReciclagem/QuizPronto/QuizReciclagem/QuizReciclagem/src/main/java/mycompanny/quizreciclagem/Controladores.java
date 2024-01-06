package mycompanny.quizreciclagem;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

public class Controladores{
    public static int pontuacao = 1;
    
   
    
    @FXML
    private RadioButton Q1Certa;
    @FXML
    private RadioButton Q2Certa;
    @FXML
    private RadioButton Q3Certa;
    @FXML
    private RadioButton Q4Certa;
    @FXML
    private RadioButton Q5Certa;
    @FXML
    private RadioButton Q6Certa;
    @FXML
    private RadioButton Q7Certa;
    @FXML
    private RadioButton Q8Certa;
    @FXML
    private RadioButton Q9Certa;
    @FXML
    private RadioButton Q10Certa;
    
    /*@FXML
    private Text Resultado;*/
    
    
    
    @FXML
    private void mudarParaQ1() throws IOException  {
        App.setRoot("questao1");
        System.out.println("pontuacao = " + pontuacao);
    }
    
    
    
    @FXML
    private void mudarParaQ2() throws IOException {
        App.setRoot("questao2");
        if(this.Q1Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
    @FXML
    private void mudarParaQ3() throws IOException {
        App.setRoot("questao3");
        if(this.Q2Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
   
    
    @FXML
    private void mudarParaQ4() throws IOException {
        App.setRoot("questao4");
        if(this.Q3Certa.isSelected()){
               pontuacao++;               
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
   
    
    @FXML
    private void mudarParaQ5() throws IOException {
        App.setRoot("questao5");
        if(this.Q4Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
    
    
    @FXML
    private void mudarParaQ6() throws IOException {
        App.setRoot("questao6");
        if(this.Q5Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
    
    
    @FXML
    private void mudarParaQ7() throws IOException {
        App.setRoot("questao7");
        if(this.Q6Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
        
    }
    
    
    
    @FXML
    private void mudarParaQ8() throws IOException {
        App.setRoot("questao8");
        
        if(this.Q7Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
    
    
    @FXML
    private void mudarParaQ9() throws IOException {
        App.setRoot("questao9");
        if(this.Q8Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
   
    
    @FXML
    private void mudarParaQ10() throws IOException {
        App.setRoot("questao10");
        if(this.Q9Certa.isSelected()){
               pontuacao++;
        }
        System.out.println("pontuacao = " + pontuacao);
    }
    
   
    
    @FXML
    private void mudarParaTelaFinal() throws IOException {
        App.setRoot("telafinal");
        if(this.Q10Certa.isSelected()){
               pontuacao++;
        }
        
        System.out.println("pontuacao = " + pontuacao);
    }
    
     @FXML
    private void mudarParaTelaInicial() throws IOException {
        App.setRoot("telainicial");
        pontuacao = 0;
            
    }
     /*public void ExibirResultado(){
        
        if(pontuacao > 0){
            String resu = Integer.toString(pontuacao);
            this.Resultado.setText(resu);
        }else{
            this.Resultado.setText("0");
        }
    }*/

}
     