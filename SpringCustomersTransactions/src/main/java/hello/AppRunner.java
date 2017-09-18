package hello;

import domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
class AppRunner implements CommandLineRunner {

    private final static Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final BookingService bookingService;

    public AppRunner(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public void run(String... args) throws Exception {
        bookingService.book(new Customer("Tom"));
        for (Customer customer : bookingService.all()) {
            logger.info("So far, " + customer + " is booked.");
        }


        try {
            bookingService.book(new Customer(null));
        } catch (RuntimeException e) {
            logger.info("v--- The following exception is expect because null is not "
                    + "valid for the DB ---v");
            logger.error(e.getMessage());
        }

    }

}
