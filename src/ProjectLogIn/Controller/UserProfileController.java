package ProjectLogIn.Controller;

import ProjectLogIn.Model.TableStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class UserProfileController {

    @FXML
    protected Button back;
    @FXML
    protected Label name;

    TableStudent ts = new TableStudent();
    @FXML
    public void handlBackBtn(ActionEvent event) throws IOException {
        back= (Button) event.getSource();
        Stage stage = (Stage)back.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Main.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }

    /*public void initialize(){
        name.setText(ts.getName(0) + " , );
    }
    */
}
