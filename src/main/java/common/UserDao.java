package common;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    public List<Wallet> selectAll() throws SQLException;

    public int deleteById(int id) throws SQLException;

    public void insert(Wallet wallet) throws SQLException, NotUniqtNameExeption;

}
