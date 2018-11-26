package ProjectLogIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SubjectController {
    @FXML
    protected Button back;
    @FXML
    protected Label CourseName,CourseID,preName,preID;
    private TableSubject tableSubject=new TableSubject();
    private Subject subject;
   public void setSubject(Subject s){
        this.subject=s;
        System.out.println(subject);
        setDisplay();
    }
    /*@FXML
    public void initialize(){
        subject=tableSubject.getSubject(subject.getID());
        CourseName.setText(subject.getName());
        CourseID.setText(subject.getID());
        preID.setText(subject.getPre());
       // preName.setText(tableSubject.getSubject(subject.getPre()));
    }*/
    @FXML
    public void handlBackBtn(ActionEvent event) throws IOException {
        back= (Button) event.getSource();
        Stage stage = (Stage)back.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }
    private void setDisplay(){
        subject=tableSubject.getSubject(subject.getID());
        CourseName.setText(subject.getName());
        CourseID.setText(subject.getID());
        preID.setText(subject.getPre());
    }

}
