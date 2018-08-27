package testone.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tuple3RowMapper implements RowMapper<Tuple3> {
    @Override
    public Tuple3 mapRow(ResultSet resultSet, int i) throws SQLException {
        return Tuple3.create(resultSet.getObject(1), resultSet.getObject(2), resultSet.getObject(3));
    }
}
