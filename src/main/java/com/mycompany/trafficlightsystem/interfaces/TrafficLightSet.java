
package com.mycompany.trafficlightsystem.interfaces;

//A set of traffic lights, either north-south pair or an east-west pair 

import com.mycompany.trafficlightsystem.enums.TrafficLightColor;


public interface TrafficLightSet{
    public void initialize(TrafficLightColor color);
    public void advance();
    public TrafficLight getLight1();
    public TrafficLight getLight2();
}
