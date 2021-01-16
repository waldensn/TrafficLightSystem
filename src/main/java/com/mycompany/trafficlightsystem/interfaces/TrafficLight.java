
package com.mycompany.trafficlightsystem.interfaces;

//Interface for a traffic light itself.

import com.mycompany.trafficlightsystem.enums.*;

//Lights can go from red to green to yellow to red.

public interface TrafficLight {
    public void initialize(TrafficLightColor color);
    public void advance();
    public TrafficLightColor getColor();
    public TrafficLightDirection getDirection();
    public void setColor(TrafficLightColor color);
    public void setDirection(TrafficLightDirection direction);
}
