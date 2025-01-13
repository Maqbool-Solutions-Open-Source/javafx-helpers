package org.example.signup;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button loginButton;

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField confirmPasswordField;

    @FXML
    private Button registerButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void handleLoginButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sing-in.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            System.out.println("Error loading login screen: " + e.getMessage());
        }
    }
    @FXML
    private void handleRegisterButtonAction() {
        System.out.println("Email: " + emailField.getText());
        System.out.println("Password: " + passwordField.getText());
        System.out.println("Confirm Password: " + confirmPasswordField.getText());
    }
}