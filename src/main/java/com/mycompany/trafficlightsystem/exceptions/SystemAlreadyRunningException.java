package com.mycompany.trafficlightsystem.exceptions;

public class SystemAlreadyRunningException extends Exception {
    @Override
    public String getMessage(){
        return "Traffic light system is already running.";
    }
}
