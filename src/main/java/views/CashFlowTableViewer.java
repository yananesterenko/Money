package views;

import com.sun.org.apache.xpath.internal.operations.String;
import common.CashFlowData;
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
        datetransaction.setCellValueFactory(new PropertyValueFactory<CashFlowData, Date>("dateTransaction"));
        cashFlowCol.setCellValueFactory(new PropertyValueFactory<CashFlowData, String>("cashFlowItem"));
        incomeCol.setCellValueFactory(new PropertyValueFactory<CashFlowData, Integer>("Income"));
        outputCol.setCellValueFactory(new PropertyValueFactory<CashFlowData, Integer>("outgo"));
        table.getColumns().addAll(datetransaction, cashFlowCol,incomeCol, outputCol);
        return table;
    }
}
