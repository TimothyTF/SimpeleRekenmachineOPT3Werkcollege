package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    static final int PLUS = 1;
    static final int MAAL = 2;
    static final int DELING = 3;

    @FXML private TextField txtGetal1;
    @FXML private TextField txtGetal2;
    @FXML private TextField txtResultaat;

    private void ButtonClicked (int operatie) {
        int getal1 = Integer.parseInt(txtGetal1.getText());
        int getal2 = Integer.parseInt(txtGetal2.getText());
        int resultaat = 0;

        if (operatie == PLUS) {
            resultaat = getal1 + getal2;
        }
        else if (operatie == MAAL) {
            resultaat = getal1 * getal2;
        }
        else if (operatie == DELING) {
            resultaat = getal1 / getal2;
        }

        txtResultaat.setText (String.valueOf(resultaat));
    }

    @FXML
    private void deelButtonClicked (ActionEvent event) {
        ButtonClicked(DELING);
    }

    @FXML
    private void plusButtonClicked (ActionEvent event) {
        ButtonClicked(PLUS);
    }

    @FXML
    private void maalButtonClicked (ActionEvent event) {
        ButtonClicked(MAAL);
    }
}
