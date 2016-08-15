package de.thesis.persistance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by daniel on 15.08.16.
 * <p>
 * This is a Basic Car Model
 */
@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private String licensePlate;
    private Integer initialRegistration;
    private Integer mileage;
    private String model;


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Integer getInitialRegistration() {
        return initialRegistration;
    }

    public void setInitialRegistration(Integer initialRegistration) {
        this.initialRegistration = initialRegistration;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", model=" + model
                + ", mileage=" + mileage + ", initialRegistration=" + initialRegistration + "]";
    }
}
