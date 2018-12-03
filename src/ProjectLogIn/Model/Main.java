package ProjectLogIn.Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../UI/Login.fxml"));
        primaryStage.setTitle("Information System");
        Image icon = new Image(getClass().getResourceAsStream("../../photos/KU_SubLogo.png"));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
