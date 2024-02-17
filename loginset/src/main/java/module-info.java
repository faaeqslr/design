module com.example.loginset {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginset to javafx.fxml;
    exports com.example.loginset;
}