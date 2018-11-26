package ProjectLogIn;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CurriculumController {
    private TableSubject tableSubject = new TableSubject();
    @FXML
    protected Button back;
    @FXML
    private TableView table;
    @FXML
    private TableColumn<Subject,String> courseID;
    @FXML
    private TableColumn<Subject,String> courseName;
    @FXML
    private TableColumn<Subject,String> prerequisiteID;
    @FXML
    private TableColumn<Subject,Integer> credit;
    private ArrayList<Subject> subjectAll = tableSubject.getTs();
    private ArrayList<Subject>subjects11=tableSubject.getYear11();
    private ArrayList<Subject>subjects12=tableSubject.getYear12();
    private ArrayList<Subject>subjects21=tableSubject.getYear21();
    private ArrayList<Subject>subjects22=tableSubject.getYear22();
    private ArrayList<Subject>subjects31=tableSubject.getYear31();
    private ArrayList<Subject>subjects32=tableSubject.getYear32();
    private ArrayList<Subject>subjects41=tableSubject.getYear41();
    private ArrayList<Subject>subjects42=tableSubject.getYear42();
    private ObservableList<Subject> subjects = FXCollections.observableArrayList();
    @FXML
    ChoiceBox<String> box = new ChoiceBox<String>();

    @FXML
    public void initialize(){
        courseID.setCellValueFactory(new PropertyValueFactory<Subject,String>("ID"));
        courseID.setStyle("-fx-alignment: CENTER;");
        courseName.setCellValueFactory(new PropertyValueFactory<Subject,String>("name"));
        credit.setCellValueFactory(new PropertyValueFactory<Subject,Integer>("credit"));
        credit.setStyle("-fx-alignment: CENTER;");
        prerequisiteID.setCellValueFactory(new PropertyValueFactory<Subject,String>("pre"));
        table.getColumns().setAll(courseID,courseName,credit,prerequisiteID);
        table.setItems(subjects);
        box.getItems().add("All");
        box.getItems().add("year: 1 semester: 1");
        box.getItems().add("year: 1 semester: 2");
        box.getItems().add("year: 2 semester: 1");
        box.getItems().add("year: 2 semester: 2");
        box.getItems().add("year: 3 semester: 1");
        box.getItems().add("year: 3 semester: 2");
        box.getItems().add("year: 4 semester: 1");
        box.getItems().add("year: 4 semester: 2");
        box.getSelectionModel().select(0);
        subjects=addData(subjectAll);
        table.setItems(subjects);
        box.getSelectionModel().selectedItemProperty()
                .addListener( (ObservableValue<? extends String> observable, String oldValue, String newValue)
                -> changebox(newValue));

    }
    public  ObservableList<Subject> addData(ArrayList<Subject> data){
        ObservableList<Subject> temp=FXCollections.observableArrayList();
        for (Subject i:data){
            temp.add(i);
        }
        return temp;
    }
    public void changebox(String event){
        if(event.equals("All")){
            table.getItems().clear();
            subjects=addData(subjectAll);
            table.setItems(subjects);
        }else if(event.equals("year: 1 semester: 1")){
            table.getItems().clear();
            subjects=addData(subjects11);
            table.setItems(subjects);
        }else if(event.equals("year: 1 semester: 2")){
            table.getItems().clear();
            subjects=addData(subjects12);
            table.setItems(subjects);
        }else if(event.equals("year: 2 semester: 1")){
            table.getItems().clear();
            subjects=addData(subjects21);
            table.setItems(subjects);
        }else if(event.equals("year: 2 semester: 2")){
            table.getItems().clear();
            subjects=addData(subjects22);
            table.setItems(subjects);
        }else if(event.equals("year: 3 semester: 1")){
            table.getItems().clear();
            subjects=addData(subjects31);
            table.setItems(subjects);
        }else if(event.equals("year: 3 semester: 2")){
            table.getItems().clear();
            subjects=addData(subjects32);
            table.setItems(subjects);
        }else if(event.equals("year: 4 semester: 1")){
            table.getItems().clear();
            subjects=addData(subjects41);
            table.setItems(subjects);
        }else if(event.equals("year: 4 semester: 2")){
            table.getItems().clear();
            subjects=addData(subjects42);
            table.setItems(subjects);
        }
    }
    @FXML
    public void handlBackBtn(ActionEvent event) throws IOException {
        back= (Button) event.getSource();
        Stage stage = (Stage)back.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();

    }



}
