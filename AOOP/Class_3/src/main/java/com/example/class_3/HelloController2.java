package com.example.class_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController2 {

    @FXML
    public void func(ActionEvent e) {
        System.out.println("New Scene");
    }

    public Scene scene3;
    public Stage stage1;

    @FXML
    public void sceneChange(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view2.fxml"));
        scene3 = new Scene(fxmlLoader.load());
        stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage1.setScene(scene3);
        stage1.show();
    }
}
