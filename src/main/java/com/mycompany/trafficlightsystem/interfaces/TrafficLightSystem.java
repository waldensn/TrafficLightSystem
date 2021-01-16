
package com.mycompany.trafficlightsystem.interfaces;

import com.mycompany.trafficlightsystem.exceptions.*;

public interface TrafficLightSystem {
    public void start() throws SystemAlreadyRunningException;
    public void advance() throws SystemNotRunningException;
    //public void advance(boolean isYellowTransition) throws SystemNotRunningException;
    public void stop() throws SystemNotRunningException;
}
