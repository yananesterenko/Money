package controllers;

import common.CashFlowOperation;
import common.CashFlowData_Dao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CashFlowTableController {
    public CashFlowTableController() {
    }

    public ObservableList buildData() {
        ObservableList<CashFlowOperation> cashFlowOperationData = FXCollections.observableArrayList();
        ObservableList row = FXCollections.observableArrayList();
     //   row.add(new data.common.CashFlowOperation("lala",0, 1));

      //  cashFlowOperationData.add(row);
       // row.add(new data.common.CashFlowOperation("lala",0, 1));
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        ArrayList<CashFlowOperation> result = new CashFlowData_Dao().getOperation();

        for (int i=0; i< result.size() ; i++){
            cashFlowOperationData.add(result.get(i));

        }

    /*    cashFlowOperationData.add(new CashFlowOperation());
        cashFlowOperationData.add(new CashFlowOperation());*/
        return cashFlowOperationData;
    }
}
