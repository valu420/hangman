module org.example.hangman {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.hangman to javafx.fxml;
    exports org.example.hangman;
    exports org.example.hangman.controller;
    opens org.example.hangman.controller to javafx.fxml;
    exports org.example.hangman.view;
    opens org.example.hangman.view to javafx.fxml;
}