package de.hhu.propra16;

import com.sun.org.apache.xml.internal.security.Init;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController implements Initializable {

    @FXML GridPane gridPane;

    Button alertButton = new Button("ALERT!");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gridPane.add(alertButton, 0,1);
        alertButton.setOnAction( e -> {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("YOU HAVE TOO MANI ");
            alert.setContentText("TOO MANY BUTTONS");
            alert.showAndWait();
        });
    }
}
