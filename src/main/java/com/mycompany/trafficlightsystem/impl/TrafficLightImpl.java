/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trafficlightsystem.impl;

import com.mycompany.trafficlightsystem.interfaces.TrafficLight;
import com.mycompany.trafficlightsystem.enums.TrafficLightDirection;
import com.mycompany.trafficlightsystem.enums.TrafficLightColor;
import java.awt.Color;

/**
 *
 * @author walde
 */
public class TrafficLightImpl implements TrafficLight {

    private TrafficLightDirection direction;
    private TrafficLightColor color;
    
    public TrafficLightImpl(TrafficLightDirection direction){
        this.direction = direction;
    }
    
    @Override
    public void initialize(TrafficLightColor color) {
        this.setColor(color);
    }
    
    @Override
    public void advance() {
        switch (this.color) {
            case RED:
                this.setColor(TrafficLightColor.GREEN);
                break;
            case YELLOW:
                this.setColor(TrafficLightColor.RED);
                break;
            case GREEN:
                this.setColor(TrafficLightColor.YELLOW);
                break;
            default:
                break;
        }
    }
    
    @Override
    public TrafficLightDirection getDirection(){
        return direction;
    }
    
    @Override
    public void setDirection(TrafficLightDirection direction){
        this.direction = direction;
    }
    
    @Override
    public TrafficLightColor getColor(){
        return color;
    }
    
    @Override
    public void setColor(TrafficLightColor color){
        this.color = color;
    }
}
