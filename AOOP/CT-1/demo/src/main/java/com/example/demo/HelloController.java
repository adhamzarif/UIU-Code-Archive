package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    Arc c = new Arc();
    @FXML
    public  void UpButton(ActionEvent e)
    {
        System.out.println("UP Button");
        c.setLayoutY(c.getLayoutY() - 10);
        c.setRotate(c.getRotate() - 10);
    }
    @FXML
    public  void DownButton(ActionEvent e)
    {
        System.out.println("Down Button");
        c.setLayoutY(c.getLayoutY() + 10);
        c.setRotate(c.getRotate() + 10);
    }
    @FXML
    public  void RightButton(ActionEvent e)
    {
        System.out.println("Right Button");
        c.setLayoutX(c.getLayoutX() + 10);
        c.setRotate(c.getRotate() + 10);
    }
    @FXML
    public  void LeftButton(ActionEvent e)
    {
        System.out.println("Left Button");
        c.setLayoutX(c.getLayoutX() - 10);
        c.setRotate(c.getRotate() - 10);
    }
}