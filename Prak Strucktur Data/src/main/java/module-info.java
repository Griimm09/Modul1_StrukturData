module com.example.strukturdata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.strukturdata to javafx.fxml;
    exports com.example.strukturdata;
}