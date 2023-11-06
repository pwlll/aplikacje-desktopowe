module com.example.ksztalty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ksztalty to javafx.fxml;
    exports com.example.ksztalty;
}