package de.thesis.webapi;

import de.thesis.persistance.Car;
import de.thesis.persistance.CarList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daniel on 15.08.16.
 * <p>
 * This example controller provides basic information about car models
 */
@RestController
public class CarController {

    private CarList cars;
    private Car carA;
    private Car carB;

    private CarList getCars() {
        cars = new CarList();
        carA = new Car();
        carA.setInitialRegistration(1990);
        carA.setLicensePlate("F-A-123");
        carA.setMileage(200000);
        carA.setModel("Volkswagen T4");

        carB = new Car();
        carB.setInitialRegistration(1991);
        carB.setLicensePlate("F-B-456");
        carB.setMileage(300000);
        carB.setModel("Porsche 911");

        cars.getCars().add(carB);
        cars.getCars().add(carA);

        return cars;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    @ResponseStatus(HttpStatus.OK)
    public CarList readAll() {
        return getCars();                   //returns all cars as list in a XML-Document
    }

}
