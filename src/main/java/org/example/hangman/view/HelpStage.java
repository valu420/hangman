package org.example.hangman.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.hangman.controller.HelpController;

import java.io.IOException;

public class HelpStage extends Stage {

    //private HelpController helpController;

    public HelpStage() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/hangman/howtoplay-view.fxml"));
        Parent root = loader.load();
        //helpController = loader.getController();
        Scene scene = new Scene(root);
        setTitle("¡How to play!");
        setResizable(false);
        setScene(scene);
        show();

    }

    public static HelpStage getInstance() throws IOException{
        return HelpStageHolder.INSTANCE = new HelpStage();
    }


    public static void deleteInstance() {
        HelpStage.HelpStageHolder.INSTANCE.close();
        HelpStage.HelpStageHolder.INSTANCE = null;
    }


    private static class HelpStageHolder {
        private static HelpStage INSTANCE;
    }

    /*
    public HelpController getHelpController(){
        return helpController;
    }
    *
        */
}
