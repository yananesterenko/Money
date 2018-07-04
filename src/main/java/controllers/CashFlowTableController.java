package controllers;

import common.CashFlowData;
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
        ObservableList<CashFlowData> cashFlowDataData = FXCollections.observableArrayList();
        ObservableList row = FXCollections.observableArrayList();
     //   row.add(new data.common.CashFlowData("lala",0, 1));

      //  cashFlowDataData.add(row);
       // row.add(new data.common.CashFlowData("lala",0, 1));
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        ArrayList<CashFlowData> result = new CashFlowData_Dao().getOperation();

        for (int i=0; i< result.size() ; i++){
            cashFlowDataData.add(result.get(i));

        }

    /*    cashFlowDataData.add(new CashFlowData());
        cashFlowDataData.add(new CashFlowData());*/
        return cashFlowDataData;
    }
}
