import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.*;

public class Login extends Application{

    private Stage stageMenu;
    public static void main(String[] args) {
        launch(args);
    }



    public void start(Stage myStage) throws Exception {

        myStage.setTitle("Money");
        BorderPane borderPane = new BorderPane();
        ButtonBar bb = new ButtonBar();
        HBox hBox =  new HBox();

        Button btnLogin= new Button("Login");
        btnLogin.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                System.out.println(" login");

                MainFormController form = new MainFormController();
                form.createMainForm();



            }
        });
        Button btnRegister = new Button("Register");
        hBox.getChildren().addAll(btnLogin, btnRegister);
        borderPane.setBottom(hBox);

        Scene myScene = new Scene(borderPane, 500, 400);
        myStage.setScene(myScene);

        myStage.show();
    }
}


