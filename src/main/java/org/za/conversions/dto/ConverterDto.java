package org.za.conversions.dto;

import java.io.Serializable;

public class ConverterDto implements Serializable {

    private String fromUnit;
    private String toUnit;
    private double amount;

    public ConverterDto() {
    }

    public ConverterDto(String toUnit, String fromUnit, double amount) {
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
