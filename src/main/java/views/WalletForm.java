package views;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WalletForm {

    public void createFormWallet(){
        Stage stWallet = new Stage();
        stWallet.setTitle("Wallets");
        stWallet.setMinWidth(500);
        stWallet.setMaxHeight(500);

        Button addButton = new Button();
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(addButton);


        Scene scene = new Scene(new Group());
        ((Group) scene.getRoot()).getChildren().addAll(borderPane);

        stWallet.setScene(scene);
        stWallet.show();

    }
}
