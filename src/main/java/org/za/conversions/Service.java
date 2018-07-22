package org.za.conversions;

import org.za.conversions.service.ConverterService;

import java.io.Serializable;

/**
 * @author unakho.kama
 */
public class Service implements Serializable {

    private Service() {
    }

    static class Helper {
        //private static final Service INSTANCE = new Service();

        public static ConverterService getInstance(ConverterService service) {
            return service;
        }
    }

    public static ConverterService getInstance(ConverterService service) {
        return Helper.getInstance(service);
    }
}
