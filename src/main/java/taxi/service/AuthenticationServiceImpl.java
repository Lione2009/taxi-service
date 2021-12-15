package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements taxi.service.AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private taxi.service.DriverService driverService;

    @Override
    public Driver login(String login, String password)
            throws AuthenticationException {
        Optional<Driver> driver = driverService.findByDriverLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            logger.info("Login or password is incorrect. Login :" + login);
            throw new AuthenticationException("Login and password is incorrect");
        }
        logger.info("Login or password is correct. Login :" + login);
        return driver.get();
    }
}
