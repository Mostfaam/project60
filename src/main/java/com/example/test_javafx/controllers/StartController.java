package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class StartController {

    @FXML
    public AnchorPane rootPane;
    Navigation navigation = new Navigation();

    public void onStudent() {
        navigation.navigateTo(rootPane, navigation.STUDENT_FXML);
    }



    public void onReports(ActionEvent actionEvent) {
    }

    public void onLectuer(ActionEvent actionEvent) {
    }

    public void onPresence(ActionEvent actionEvent) {
    }
    public void logout(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane,navigation.LOGOUT);
    }
}
