package com.kuzmin.worldbankgdp.mappers;

import com.kuzmin.worldbankgdp.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRowMapper implements RowMapper<City> {
    public City mapRow(ResultSet resultSet, int i) throws SQLException {
        City city = new City();
        city.setCountryCode(resultSet.getString("country_code"));
        city.setDistrict(resultSet.getString("district"));
        city.setId(resultSet.getLong("id"));
        city.setName(resultSet.getString("name"));
        city.setPopulation(resultSet.getLong("population"));
        return city;
    }
}