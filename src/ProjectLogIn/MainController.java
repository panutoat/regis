package ProjectLogIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    protected Button curriculum,registrationReport,studentInfo,logout,search;
    @FXML
    public void handlCurriculumBtn(ActionEvent event) throws IOException {
            curriculum = (Button) event.getSource();
            Stage stage = (Stage) curriculum.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Curriculum.fxml"));
            stage.setScene(new Scene(loader.load()));
            stage.show();

    }
    @FXML
    public void handlStudentInfoBtn(ActionEvent event) throws IOException {
        studentInfo = (Button) event.getSource();
        Stage stage = (Stage) studentInfo.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NisitInfo.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlLogOutBtn(ActionEvent event) throws IOException {
       logout = (Button) event.getSource();
        Stage stage = (Stage) logout.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlsearchBtn(ActionEvent event) throws IOException {
        search = (Button) event.getSource();
        Stage stage = (Stage) search.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searchSubject.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
}

