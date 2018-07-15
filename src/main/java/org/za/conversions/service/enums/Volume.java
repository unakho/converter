package org.za.conversions.service.enums;

import org.za.conversions.service.enums.base.UnitValue;

public enum Volume implements UnitValue{
    CUBIC_CENTIMETRE("cm3", 1231D),
    CUBIC_DECENTIMETRE("dm2", 12D),
    CUBIC_METER("m3", 30D),
    LITRE("l", 4D),
    CUBIC_INNCH("in3", 11D),
    CUBIC_FEET("ft3", 22D);

    private String unit;
    private Double value;

    Volume(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Double getUnitConst(String unit){
        for ( Volume volume: values()){
            if (unit.equals(volume.getUnit())){
                return volume.getValue();
            }
        }
        return 0.00;
    }

    @Override
    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
