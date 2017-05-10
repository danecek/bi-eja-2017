/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja.persistence;

import eja.domain.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomersDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    void init() {
        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(name VARCHAR(255))");
        jdbcTemplate.update("INSERT INTO customers VALUES ('Tom')");

    }

    public List<Customer> all() {
        List<Customer> customers = jdbcTemplate.query("SELECT * FROM customers",
                new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Customer(rs.getString("name"));
            }
        });
        return customers;

    }

}
