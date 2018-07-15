package org.za.conversions.model;

import java.io.Serializable;

public class Converter implements Serializable {

    private String toUnit;
    private String fromUnit;
    private double amount;

    public Converter() {
    }

    public Converter(String toUnit, String fromUnit, double amount) {
        this.toUnit = toUnit;
        this.fromUnit = fromUnit;
        this.amount = amount;
    }


    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
