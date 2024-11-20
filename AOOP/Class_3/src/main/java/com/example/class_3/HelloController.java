//package com.example.class_3;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//
//public class HelloController {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//
//}


package com.example.class_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public Circle c;

    @FXML
    public void moveUp(ActionEvent e) {
        System.out.println("UP");
        c.setCenterY(c.getCenterY() - 10);
    }

    @FXML
    public void moveDown(ActionEvent e) {
        System.out.println("DOWN");
        c.setCenterY(c.getCenterY() + 10);
    }

    @FXML
    public void moveLEFT(ActionEvent e) {
        System.out.println("LEFT");
        c.setCenterX(c.getCenterX() - 10);
    }

    @FXML
    public void moveRIGHT(ActionEvent e) {
        System.out.println("RIGHT");
        c.setCenterX(c.getCenterX() + 10);
    }

    @FXML
    public void zoomIN(ActionEvent e) {
        System.out.println("ZOOM IN");
        c.setRadius(c.getRadius() + 10);
    }

    @FXML
    public void zoomOUT(ActionEvent e) {
        System.out.println("ZOOM OUT");
        c.setRadius(c.getRadius() - 10);
    }

    public Scene scene2;
    public Stage stage;

    @FXML
    public void sceneChange(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        scene2 = new Scene(fxmlLoader.load());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene2);
        stage.show();
    }
}
