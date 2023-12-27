package com.example.javafx_ltm_minhtuan;

import javafx.scene.control.Alert;
import javafx.stage.Window;

public class AlertHelper {
    public static void showAlert(Alert.AlertType type, Window window, String title, String message) {
        Alert alert = new Alert(type);
        alert.initOwner(window);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
