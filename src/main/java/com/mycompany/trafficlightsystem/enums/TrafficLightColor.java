
package com.mycompany.trafficlightsystem.enums;

import java.awt.Color;


public enum TrafficLightColor {
    RED(Color.RED),
    YELLOW(Color.YELLOW),
    GREEN(Color.GREEN);
    
    private final Color color;
    
    private TrafficLightColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        if (this.color.equals(Color.RED)){
            return "Red";
        }
        else if (this.color.equals(Color.YELLOW)){
            return "Yellow";
        }
        else{
            return "Green";
        }
    }
}
