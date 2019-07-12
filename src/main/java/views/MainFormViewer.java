package views;

import controllers.CreateTable;
import controllers.CreateTabs;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainFormViewer {

    public void createMainForm(){
        Stage stMain = new Stage();
        stMain.setTitle("Main form");
        stMain.setMinWidth(500);
        MainMenu mainMenu = new MainMenu();
        MenuBar mb = mainMenu.createMainMenue();

        TabPane tabbedPane = new TabPane();
        tabbedPane.setMinWidth(500);
        StackPane tabB_stack = new StackPane();
        TableView tableInput = CreateTable.buildTable();
        tabB_stack.getChildren().addAll(tableInput);
        /*final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(tableInput);*/
        ArrayList listPouches = new ArrayList();
        listPouches.add("Cash");
        listPouches.add("Bank card");
        listPouches.add("Bank card2");

        for (int i=0; i< listPouches.size();i++){

            String elemPouch = listPouches.get(i).toString();
            Tab tab = new CreateTabs().createTabs(elemPouch);
            tab.setContent(tabB_stack);
            tabbedPane.getTabs().add(tab);

        }
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(mb);
        borderPane.setCenter(tabbedPane);

        Scene myScene = new Scene(new Group());
        ((Group) myScene.getRoot()).getChildren().addAll(borderPane);
        stMain.setScene(myScene);
        stMain.show();



    }


}
