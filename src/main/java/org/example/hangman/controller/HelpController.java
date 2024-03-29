package org.example.hangman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.hangman.view.HelpStage;

public class HelpController {

    @FXML
    void OnHandleButtonClose(ActionEvent event) {
        HelpStage.deleteInstance();

    }

}

