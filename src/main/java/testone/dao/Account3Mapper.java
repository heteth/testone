package testone.dao;

import org.springframework.jdbc.core.RowMapper;
import testone.domain.Account3;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account3Mapper implements RowMapper<Account3> {
    @Override
    public Account3 mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Account3(resultSet.getInt("id"), resultSet.getString("account_no"),
                (BigDecimal) resultSet.getObject("balance"));
    }
}
