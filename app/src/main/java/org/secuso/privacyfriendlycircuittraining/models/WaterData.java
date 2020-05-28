package org.secuso.privacyfriendlycircuittraining.models;

public class WaterData {
    int ID;
    String DATE;
    String TIME;
    int TOTAL;

    public WaterData() {
    }

    public WaterData(String DATE, String TIME, int TOTAL) {
        this.DATE = DATE;
        this.TIME = TIME;
        this.TOTAL = TOTAL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int TOTAL) {
        this.TOTAL = TOTAL;
    }
}
