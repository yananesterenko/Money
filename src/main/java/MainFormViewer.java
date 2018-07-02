import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFormViewer {

    public void createMainForm(){
        Stage stMain = new Stage();
        stMain.setTitle("Main form");
        stMain.setMinWidth(500);
        CreateMenu mainMenu = new CreateMenu();
        MenuBar mb = mainMenu.createMainMenue();

        TabPane tabbedPane = new TabPane();
        tabbedPane.setMinWidth(500);
        Tab tab1 = new CreateTabs().createTabs("Cash");
        StackPane tabB_stack = new StackPane();

        CashFlowTableViewer cashFlowTableViewer = new CashFlowTableViewer();
        TableView tableInput = cashFlowTableViewer.createTable();
        CashFlowTableController contr = new CashFlowTableController();
        ObservableList cashFlow= contr.buildData();
        tableInput.setItems(cashFlow);
        tabB_stack.getChildren().addAll(tableInput);
        tab1.setContent(tabB_stack);
        /*final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(tableInput);*/

        Tab tab2 = new CreateTabs().createTabs("Bank card");
        tabbedPane.getTabs().addAll(tab1, tab2);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(mb);
        borderPane.setCenter(tabbedPane);

        Scene myScene = new Scene(new Group());
        ((Group) myScene.getRoot()).getChildren().addAll(borderPane);
        stMain.setScene(myScene);
        stMain.show();

        }


}
