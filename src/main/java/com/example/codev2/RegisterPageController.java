package com.example.codev2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterPageController{
    @FXML
    protected void goBack(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainMenuApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 570, 400);
            Stage stage = new Stage();
            stage.setTitle("Diogo's Vet!");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide(); //This hides the screen which is the same as deleting the elements
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
