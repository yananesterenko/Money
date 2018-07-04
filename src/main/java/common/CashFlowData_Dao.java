package common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CashFlowData_Dao {

    public ArrayList<CashFlowData> getOperation(){
        Connection connection = new JDBCPostgreSQLE().getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<CashFlowData> result = new ArrayList<CashFlowData>();
        try{
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            String a  = "SELECT  * FROM operation";
            rs = stmt.executeQuery(a);

            while (rs.next()){
                int id = rs.getInt("id");
                String date = rs.getString("date");
                String type = rs.getString("type_operation");
                String cashFlow = rs.getString("cashFlowItem_id");
                Integer amount = rs.getInt("amount");
                CashFlowData cfd = new CashFlowData();
                cfd.setDateTransaction(date);
                cfd.setId(id);
                cfd.setCashFlowItem(cashFlow);
                cfd.setTypeOperation(type);
                cfd.setAmount(amount);
                result.add(cfd);

            }
            connection.commit();

        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(connection);
            e.printStackTrace();
        }

        return result;
    }
}
