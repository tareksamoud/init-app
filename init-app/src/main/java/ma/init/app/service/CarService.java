package ma.init.app.service;

import ma.init.app.enitities.CarEntity;
import org.springframework.stereotype.Service;

@Service //@Component
public class CarService {
    public String displayDetails(final String brand, final String model, final int year) {
        return String.format("The Brand is: %s, My model is: %s, Year: %s", brand, model, year);
    }

    public String displayDetails(final CarEntity car) {
        return String.format("The Brand is: %s, My model is: %s, Year: %s", car.getBrand(), car.getModel(), car.getYear());
    }
}
