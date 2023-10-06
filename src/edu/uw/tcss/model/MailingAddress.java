package edu.uw.tcss.model;

public interface MailingAddress {

    String getFirstLine();

    /**
     *
     * @return
     */
    String getSecondLine();

    String getCity();

    String getState();

    int getZip();

    String generateLabel();

    boolean hasSecondLine();


}
