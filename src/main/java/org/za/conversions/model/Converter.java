package org.za.conversions.model;

import java.io.Serializable;

public class Converter implements Serializable {

    private Double amount;
    private String toUnit;
    private String fromUnit;
    private Double factor;

    public Converter() {
    }

    public Converter(Double amount, String toUnit, String fromUnit, Double factor) {
        this.amount = amount;
        this.toUnit = toUnit;
        this.fromUnit = fromUnit;
        this.factor = factor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }
}
