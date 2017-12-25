package sample.Systems;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Events implements Initializable{
    final ToggleGroup group = new ToggleGroup();
    @FXML private RadioButton mandatory = new RadioButton();
    @FXML private RadioButton voluntary = new RadioButton();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mandatory.fire();
    }
}
