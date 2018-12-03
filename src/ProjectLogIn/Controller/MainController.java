package ProjectLogIn.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    protected Button curriculum,registrationReport,studentInfo,logout,search,registration;
    @FXML
    public void handlCurriculumBtn(ActionEvent event) throws IOException {
            curriculum = (Button) event.getSource();
            Stage stage = (Stage) curriculum.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Curriculum.fxml"));
            stage.setScene(new Scene(loader.load()));
            stage.show();

    }
    @FXML
    public void handlStudentInfoBtn(ActionEvent event) throws IOException {
        studentInfo = (Button) event.getSource();
        Stage stage = (Stage) studentInfo.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/UserProfile.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlLogOutBtn(ActionEvent event) throws IOException {
       logout = (Button) event.getSource();
        Stage stage = (Stage) logout.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlsearchBtn(ActionEvent event) throws IOException {
        search = (Button) event.getSource();
        Stage stage = (Stage) search.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/SearchSubject.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlRegistrationBtn(ActionEvent event) throws IOException {
        registration = (Button) event.getSource();
        Stage stage = (Stage) registration.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/Registration.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    @FXML
    public void handlRegistrationReportBtn(ActionEvent event) throws IOException {
        registrationReport = (Button) event.getSource();
        Stage stage = (Stage) registrationReport.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../UI/RegistrationReport.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}

