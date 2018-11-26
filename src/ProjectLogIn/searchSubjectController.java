package ProjectLogIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class searchSubjectController {
    @FXML
    protected Button searchID,searchName;
    @FXML
    protected TextField textID,textName;
    private TableSubject ts =new TableSubject();
    private Subject subject;
    private String ID;
    private String Name;

    @FXML
    public void handlSearchIDBtn(ActionEvent event) throws IOException {
        try {
            searchID= (Button) event.getSource();
            Stage stage = (Stage)searchID.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Subject.fxml"));
           SubjectController sc=loader.getController();
           sc.setSubject(ts.getSubject(textID.getText()));
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
}
