package views;

import com.sun.org.apache.xpath.internal.operations.String;
import common.CashFlowOperation;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Date;


public class CashFlowTableViewer {
    public TableView createTable(){
        TableView table = new TableView();
        //table.setEditable(true);
        TableColumn datetransaction = new TableColumn("Date");
        TableColumn cashFlowCol = new TableColumn("Cashflow");
        TableColumn incomeCol = new TableColumn("Income");
        TableColumn outputCol = new TableColumn("Outgo");
        datetransaction.setCellValueFactory(new PropertyValueFactory<CashFlowOperation, Date>("dateTransaction"));
        cashFlowCol.setCellValueFactory(new PropertyValueFactory<CashFlowOperation, String>("cashFlowItem"));
        incomeCol.setCellValueFactory(new PropertyValueFactory<CashFlowOperation, Integer>("Income"));
        outputCol.setCellValueFactory(new PropertyValueFactory<CashFlowOperation, Integer>("outgo"));
        table.getColumns().addAll(datetransaction, cashFlowCol,incomeCol, outputCol);
        return table;
    }
}
