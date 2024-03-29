package org.example.hangman;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.hangman.view.GameStage;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        GameStage.getInstance();

    }
}
