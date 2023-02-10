package com.example.codev2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.sql.Statement;



import java.io.IOException;
import java.util.InputMismatchException;





public class SignUpController{

    private static String username;
    public static void SQLTest() {
        //This gets the directory for this project, appends the name of the database file to it and sets it as the database location
        String DatabaseLocation = System.getProperty("user.dir") + "\\AccessDB.accdb";
        try {
            //sets up a connection to the database using the database location
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            //forms a statement which is used to format the results from your SQL
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //This bit is the SQL, if using strings to search, put quote marks around the strings - 'julie' not "julie"
            //No other fields need quote marks, only string fields
            String sql = "SELECT * FROM CustomerTable";
            String sql2 = "INSERT " + username + " INTO CustomerTable";
            //executes the SQL query and returns the results as a ResultSet, which is like an arraylist of results
            //If using an INSERT, UPDATE, DELETE use stmt.executeUpdate(query) instead
            ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs1 = stmt.executeQuery(sql2);
            while (rs.next()){
                System.out.println( "First name: " + rs.getString("First Name") + " Surname: " + rs.getString("Surname"));
            }
            rs.close();

            con.close();

        } catch (Exception e) {

            System.out.println("Error in the SQL class: " + e);

        }

    }

    @FXML
    public TextField unField;
    @FXML
    private PasswordField pwField;
    public String un;
    public String pw;

    @FXML
    protected void SignInButton(ActionEvent event){
        SQLTest();
        try{
            un = unField.getText();
            pw = pwField.getText();
            System.out.println(un + " "+ pw);

        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
    @FXML
    protected void goBack(ActionEvent event) {

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
