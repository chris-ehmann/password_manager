package com.example.password_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.util.Objects;

public class PasswordApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PasswordApplication.class.getResource("fxml/loginview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Password Manager");
        stage.getIcons().add(new Image(String.valueOf(PasswordApplication.class.getResource("img/lock-icon.png"))));
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("Closing application...");
    }

    public static void main(String[] args) {
        launch();
    }
}