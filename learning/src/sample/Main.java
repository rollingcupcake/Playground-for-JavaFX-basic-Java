package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    Button button1;
    Button button2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My little program");

        button1 = new Button();
        button1.setText("Click me!");

        // this = check in this class for the handle method
        button1.setOnAction(e -> {
            System.out.println("Hey there");
            System.out.println("PØLSE :D");
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button1);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
