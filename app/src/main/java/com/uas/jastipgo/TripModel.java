package com.uas.jastipgo;

public class TripModel {
    private String destination;
    private String country;
    private String jastiper;
    private String departureDate;
    private String timeRemaining;
    private int quotaCurrent;
    private int quotaMax;

    public TripModel(String destination, String country, String jastiper, String departureDate, String timeRemaining, int quotaCurrent, int quotaMax) {
        this.destination = destination;
        this.country = country;
        this.jastiper = jastiper;
        this.departureDate = departureDate;
        this.timeRemaining = timeRemaining;
        this.quotaCurrent = quotaCurrent;
        this.quotaMax = quotaMax;
    }

    public String getDestination() { return destination; }
    public String getCountry() { return country; }
    public String getJastiper() { return jastiper; }
    public String getDepartureDate() { return departureDate; }
    public String getTimeRemaining() { return timeRemaining; }
    public int getQuotaCurrent() { return quotaCurrent; }
    public int getQuotaMax() { return quotaMax; }
}
