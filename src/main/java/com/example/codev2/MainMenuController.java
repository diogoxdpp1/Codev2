package com.example.codev2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    @FXML
    protected void SignInButton(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainMenuApplication.class.getResource("SignInPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 570, 348);
            Stage stage = new Stage();
            stage.setTitle("Sign In!");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide(); //This hides the screen which is the same as deleting the elements
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void RegisterButtton(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainMenuApplication.class.getResource("RegisterPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 570, 348);
            Stage stage = new Stage();
            stage.setTitle("Register!");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide(); //This hides the screen which is the same as deleting the elements
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }