package org.secuso.privacyfriendlycircuittraining.models;

public class InformationData {
    int ID;
    String NAME;
    String FAMILY;
    int AGE;
    int WEIGHT;
    int HEIGHT;

    public InformationData() {
    }

    public InformationData( String NAME, String FAMILY, int AGE, int WEIGHT, int HEIGHT) {
        this.NAME = NAME;
        this.FAMILY = FAMILY;
        this.AGE = AGE;
        this.WEIGHT = WEIGHT;
        this.HEIGHT = HEIGHT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getFAMILY() {
        return FAMILY;
    }

    public void setFAMILY(String FAMILY) {
        this.FAMILY = FAMILY;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(int WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}
