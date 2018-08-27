package testone.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tuple2RowMapper implements RowMapper<Tuple2> {
    @Override
    public Tuple2 mapRow(ResultSet resultSet, int i) throws SQLException {
        return Tuple2.create(resultSet.getObject(1), resultSet.getObject(2));
    }
}
