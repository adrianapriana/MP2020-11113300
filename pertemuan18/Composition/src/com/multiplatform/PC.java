package com.multiplatform;

public class PC {
    private Case theCase;
    private Motherboard theMotherboard;
    private Monitor theMonitor;

    public PC(Case theCase, Motherboard theMotherboard, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMotherboard = theMotherboard;
        this.theMonitor = theMonitor;
    }

    public void startPC(String programName){
        getTheCase().pressPowerButton();
        getTheMotherboard().loadProgram(programName);
        getTheMonitor().drawPixelAt(1000,900,"red");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }
}
