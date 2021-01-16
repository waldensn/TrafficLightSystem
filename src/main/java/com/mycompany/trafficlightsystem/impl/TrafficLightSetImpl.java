
package com.mycompany.trafficlightsystem.impl;

import com.mycompany.trafficlightsystem.interfaces.TrafficLightSet;
import com.mycompany.trafficlightsystem.interfaces.TrafficLight;
import com.mycompany.trafficlightsystem.enums.TrafficLightColor;

public class TrafficLightSetImpl implements TrafficLightSet{
    private final TrafficLight light1;
    private final TrafficLight light2;
    
    public TrafficLightSetImpl(TrafficLight light1, TrafficLight light2){
        this.light1 = light1;
        this.light2 = light2;
    }

    @Override
    public void initialize(TrafficLightColor color) {   
        this.light1.initialize(color);
        this.light2.initialize(color);
    }
    
    @Override
    public void advance() {
        this.light1.advance();
        this.light2.advance();
    }
      
    public TrafficLight getLight1(){return this.light1;}
    public TrafficLight getLight2(){return this.light2;}
}

