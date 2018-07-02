import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class CashFlowTableController {
    public CashFlowTableController() {
    }

    public ObservableList buildData() {
        ObservableList cashFlowData = FXCollections.observableArrayList();
        ObservableList<CashFlow> row = FXCollections.observableArrayList();
        row.add(new CashFlow("lala", 1, 0));
        cashFlowData.add(row);
        row.add(new CashFlow("lala",0, 1));
        cashFlowData.add(row);
        return cashFlowData;
    }
}
