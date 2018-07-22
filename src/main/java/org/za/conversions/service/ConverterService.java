package org.za.conversions.service;

/**
 * @author unakho.kama
 * base converter interface for all the services
 */
public interface ConverterService<T> {

    T getFromUnit(T converter);
}
