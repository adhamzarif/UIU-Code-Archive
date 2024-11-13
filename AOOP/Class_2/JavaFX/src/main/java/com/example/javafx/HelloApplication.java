package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

        Group parent1 = new Group();
        Scene scene1 = new Scene(parent1, Color.BLUEVIOLET);

        stage.setHeight(500);
        stage.setWidth(600);
        stage.setX(100);
        stage.setY(100);

        //Text
        Text text = new Text();
        text.setText("Hello Zarif!!");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Times New Roman", 25));
        text.setFill(Color.valueOf("#4e99a6"));  //color picker
        parent1.getChildren().add(text);

        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(150);
        rect.setWidth(50);
        rect.setHeight(100);
        rect.setFill(Color.AZURE);
        rect.setStrokeWidth(5);
        rect.setStroke(Color.AQUAMARINE);
        parent1.getChildren().add(rect);

        Circle circle = new Circle(250,200,50);
        circle.setFill(Color.CADETBLUE);
        circle.setStroke(Color.BLUE);
        parent1.getChildren().add(circle);

        //Button
        Button button = new Button();
        button.setText("click me");
        button.setLayoutX(100);
        button.setLayoutY(300);
        parent1.getChildren().add(button);
        button.setOnAction( e ->
        {
            Text text1 = new Text();
            text1.setText("Meawwwwwww");
            text1.setX(250);
            text1.setY(300);
            parent1.getChildren().add(text1);
        });

        Group parent2 = new Group();
        Scene scene2 = new Scene(parent2, Color.BLUEVIOLET);

// Button to switch to the next scene
        Button button2 = new Button("Next Scene");
        button2.setLayoutX(200);
        button2.setLayoutY(300);
        parent2.getChildren().add(button2);

// Action to switch back to scene1 when clicked
        button2.setOnAction(e -> {
            // Switch to scene1
            stage.setScene(scene1);
        });

// Set scene1 initially
        stage.setScene(scene1);
        stage.show();

        //image add
        Image cat = new Image(new FileInputStream("D:\\AZ\\Class_2\\JavaFX\\src\\picture.jpg"));
        stage.getIcons().add(cat);
        ImageView image = new ImageView(cat);
        image.setX(350);
        image.setY(150);
        image.setFitHeight(150);
        image.setFitWidth(150);
        stage.setTitle("Cat");
        parent1.getChildren().add(image);


        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}