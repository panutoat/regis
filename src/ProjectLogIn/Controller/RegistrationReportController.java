package ProjectLogIn.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationReportController {
    @FXML
    protected Button back;
    @FXML
    public void handlBackBtn(ActionEvent event) throws IOException {
        back= (Button) event.getSource();
        Stage stage = (Stage)back.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Main.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }

}
