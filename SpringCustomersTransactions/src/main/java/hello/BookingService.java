package hello;

import domain.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BookingService {

    private final static Logger logger = LoggerFactory.getLogger(BookingService.class);

    private final JdbcTemplate jdbcTemplate;

    public BookingService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void book(Customer... customers) {
        for (Customer customer : customers) {
            jdbcTemplate.update("insert into CUSTOMERS(NAME) values(?)", customer.getName());
        }
    }

    public List<Customer> all() {
        List<Customer> customers = jdbcTemplate.query("SELECT * FROM CUSTOMERS",
                new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Customer(rs.getString("name"));
            }
        });
        return customers;

    }

}
