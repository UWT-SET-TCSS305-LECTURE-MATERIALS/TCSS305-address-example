package edu.uw.tcss.model;

import java.util.Objects;

public class Address implements MailingAddress {

    private static final String NO_SECOND_LINE = "";

    private final String myFirstLine;

    private final String mySecondLine;

    private final String myCity;


    private final String myState;

    private final int myZip;

    /**
     *
     * @param theFirstLine
     * @param theCity
     * @param theState
     * @param theZip
     * @throws IllegalArgumentException when teh arguemtss are ailleg
     */
    public Address(final String theFirstLine, final String theCity, final String theState, final int theZip) {
        this(theFirstLine, null, theCity, theState, theZip);
    }

    public Address(final String theFirstLine, final String theSecondLine, final String theCity, final String theState, final int theZip) {
        if (Objects.requireNonNull(theFirstLine).isEmpty() ||
                Objects.requireNonNull(theSecondLine).isEmpty() ||
                Objects.requireNonNull(theState).isEmpty() ||
                Objects.requireNonNull(theCity).isEmpty() ||
                theZip <= 0) {
            throw new IllegalArgumentException();
        }
        myFirstLine = theFirstLine;
        mySecondLine = theSecondLine;
        myCity = theCity;
        myState = theState;
        myZip = theZip;
    }

    /**
     * @return
     */
    @Override
    public String getFirstLine() {
        return myFirstLine;
    }

    /**
     * @return
     * @throws IllegalStateException when....
     */
    @Override
    public String getSecondLine() {
        if (mySecondLine == null) {
            throw new IllegalStateException("No Second line!");
        }
        return mySecondLine;
    }



    /**
     * @return
     */
    @Override
    public String getCity() {
        return myCity;
    }

    /**
     * @return
     */
    @Override
    public String getState() {
        return myState;
    }

    /**
     * @return
     */
    @Override
    public int getZip() {
        return myZip;
    }

    /**
     * @return
     */
    @Override
    public String generateLabel() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public boolean hasSecondLine() {
        return mySecondLine != null;
    }
}
