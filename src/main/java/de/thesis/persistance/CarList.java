package de.thesis.persistance;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel on 15.08.16.
 * <p>
 * This class basically wraps a list of car models
 */
@XmlRootElement(name = "cars")
public class CarList implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> employees) {
        this.cars = employees;
    }

}
