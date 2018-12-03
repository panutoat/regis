package ProjectLogIn.Controller;

import ProjectLogIn.Model.Subject;
import ProjectLogIn.Model.TableSubject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchSubjectController {
    @FXML
    protected Button searchID,searchName,main;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Subject.fxml"));
            stage.setScene(new Scene(loader.load()));
           SubjectController sc=loader.getController();
           sc.setSubject(ts.getSubject(textID.getText()));

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void handlMainBtn(ActionEvent event) throws IOException {
        main = (Button) event.getSource();
        Stage stage = (Stage) main.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Main.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
}
