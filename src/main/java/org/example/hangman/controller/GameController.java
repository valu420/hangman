package org.example.hangman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.example.hangman.view.HelpStage;

import java.io.IOException;

public class GameController {

    @FXML
    private ImageView hangmanStatus;

    @FXML
    private TextField letterField;

    @FXML
    private TextArea resultTextArea;

    @FXML
    void OnHandleButtonHowTo(ActionEvent event) throws IOException {
        try {
            HelpStage.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void onHandleButtonHelp(ActionEvent event) {

    }

}
