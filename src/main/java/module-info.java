module org.example.signup {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.signup to javafx.fxml;
    exports org.example.signup;
}