package com.multiplatform;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button is pressed...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}
