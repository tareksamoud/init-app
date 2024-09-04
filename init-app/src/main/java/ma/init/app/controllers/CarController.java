package ma.init.app.controllers;

import lombok.RequiredArgsConstructor;
import ma.init.app.enitities.CarEntity;
import ma.init.app.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CarController {
    private final CarService service;

    @GetMapping("/load/auto")
    @ResponseStatus(HttpStatus.OK)
    public String carDetails(
            @RequestParam(name = "brand") final String brand,
            @RequestParam(name = "model") final String model,
            @RequestParam(name = "year") final int year
    ) {
        return service.displayDetails(brand, model, year);
    }

    @GetMapping("/load/auto")
    @ResponseStatus(HttpStatus.OK)
    public String carDetails(@RequestBody final CarEntity car) {
        return service.displayDetails(car);
    }
}
