package common;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtils {

    public static void rollbackQuietly(Connection conn){
        if (conn != null){
            try {
                conn.rollback();
            } catch (SQLException e) {
                //NOP
            }
        }
    }

}
