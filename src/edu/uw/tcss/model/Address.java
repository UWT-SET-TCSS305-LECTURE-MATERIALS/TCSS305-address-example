package edu.uw.tcss.model;

/**
 * This Interface defines the contract for all Address objects.
 * @author Charles Bryan
 * @version Autumn 2023 1.1
 */
public interface Address {

    /**
     * Accessor for this Address object's street number and name.
     * @return the street number and name
     */
    String getFirstLine();

    /**
     * Accessor for this Address object's optional additional information.
     *
     * @return the optional additional information
     */
    String getSecondLine();

    /**
     * Accessor for this Address object's City name.
     * @return the city name
     */
    String getCity();

    /**
     * Accessor for this Address object's State name.
     * @return the state name
     */
    String getState();

    /**
     * Accessor for this Address object's Zip Code.
     * @return the Zip code
     */
    int getZip();

    /**
     * Returns true if and only if this Address object has a second line, false
     * otherwise.
     *
     * @return true if and only if this Address object has a second line
     */
    boolean hasSecondLine();

    /**
     * Returns a String representation of thie Address object's mailing label.
     * @return a String representation of thie Address object's mailing label
     */
    String generateLabel();


}
