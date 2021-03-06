package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            Customer c = new Customer("Jan", "Novak");
            repository.save(c);
            repository.save(new Customer("Pepa", "Novak"));
            repository.save(new Customer("Pepa", "Stary"));
            log.info("****************");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("****************");
            for (Customer novak : repository.findByLastName("Novak")) {
                log.info(novak.toString());
            }
            log.info("****************");
            repository.delete(c);
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("****************");

        };
    }

}
