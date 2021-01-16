package com.mycompany.trafficlightsystem.exceptions;

public class SystemNotRunningException extends Exception {      
    @Override
    public String getMessage(){
        return "Traffic light system is not currently running.";
    }
}
