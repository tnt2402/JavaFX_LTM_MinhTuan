module com.example.javafx_ltm_minhtuan {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.logging;

    opens com.example.javafx_ltm_minhtuan to javafx.fxml;
    exports com.example.javafx_ltm_minhtuan;
}