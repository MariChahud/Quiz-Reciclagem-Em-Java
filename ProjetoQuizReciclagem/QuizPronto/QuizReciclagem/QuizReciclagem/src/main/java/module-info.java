module mycompanny.quizreciclagem {
    requires javafx.controls;
    requires javafx.fxml;

    opens mycompanny.quizreciclagem to javafx.fxml;
    exports mycompanny.quizreciclagem;
}
