package com.kuzmin.worldbankgdp.mappers;

import com.kuzmin.worldbankgdp.model.City;
import com.kuzmin.worldbankgdp.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryRowMapper implements RowMapper<Country> {
    public Country mapRow(ResultSet resultSet, int i) throws SQLException {
        Country country = new Country();
        country.setCode(resultSet.getString("code"));
        country.setName(resultSet.getString("name"));
        country.setContinent(resultSet.getString("continent"));
        country.setRegion(resultSet.getString("region"));
        country.setSurfaceArea(resultSet.getDouble("surface_area"));
        country.setIndepYear(resultSet.getShort("indep_year"));
        country.setPopulation(resultSet.getLong("population"));
        country.setLifeExpectancy(resultSet.getDouble("life_expectancy"));
        country.setGnp(resultSet.getDouble("gnp"));
        country.setLocalName(resultSet.getString("local_name"));
        country.setGovernmentForm(resultSet.getString("government_form"));
        country.setHeadOfState(resultSet.getString("head_of_state"));
        country.setCode2(resultSet.getString("code2"));
        if (Long.valueOf(resultSet.getLong("capital")) != null) {
            City city = new City();
            city.setId(resultSet.getLong("capital"));
            city.setName(resultSet.getString("capital_name"));
            country.setCapital(city);
        }
        return country;
    }
}
