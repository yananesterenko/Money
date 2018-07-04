package common;

import controllers.CashFlowTableController;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import views.CashFlowTableViewer;

public class  CreateTable {

    public static TableView buildTable() {
        CashFlowTableViewer cashFlowTableViewer = new CashFlowTableViewer();
        TableView tableInput = cashFlowTableViewer.createTable();
        CashFlowTableController contr = new CashFlowTableController();
        ObservableList cashFlow = contr.buildData();
        tableInput.setItems(cashFlow);
        return tableInput;
    }
}
