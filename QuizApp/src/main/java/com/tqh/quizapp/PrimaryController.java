package com.tqh.quizapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.MyAlert;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    public void handleQuestionManagement() {
        MyAlert.getInstance().showMsg("Coming soon ...");
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon ...");
    }

    public void handleAttempt(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon ...");
    }

    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon ...");
    }

    public void handleLog(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon ...");
    }
}
