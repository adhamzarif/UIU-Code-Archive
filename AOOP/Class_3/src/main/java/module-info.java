module com.example.class_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.class_3 to javafx.fxml;
    exports com.example.class_3;
}