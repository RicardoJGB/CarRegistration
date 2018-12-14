package com.mobileapps.carregistration;

public class Car {

    String carModel;
    String carYear;
    String carColor;
    String carTransmission;
    String numberOfCylinders;
    String engineType;

    public Car(String carModel, String carYear, String carColor, String carTransmission, String numberOfCylinders, String engineType) {
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
        this.carTransmission = carTransmission;
        this.numberOfCylinders = numberOfCylinders;
        this.engineType = engineType;
    }

    public Car (){

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }

    public String getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(String numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + carModel + '\'' +
                ", Year='" + carYear + '\'' +
                ", Color='" + carColor + '\'' +
                ", Transmission='" + carTransmission + '\'' +
                ", Cylinders='" + numberOfCylinders + '\'' +
                ", Engine='" + engineType + '\'' +
                '}';
    }

}
