
package com.mycompany.trafficlightsystem.impl;

import com.mycompany.trafficlightsystem.impl.TrafficLightSetImpl;
import com.mycompany.trafficlightsystem.impl.TrafficLightImpl;
import com.mycompany.trafficlightsystem.interfaces.*;
import com.mycompany.trafficlightsystem.enums.*;
import com.mycompany.trafficlightsystem.exceptions.*;

public class TrafficLightSystemImpl implements TrafficLightSystem {

    private TrafficLightSet eastWestLights;
    private TrafficLightSet northSouthLights;
    private TrafficLightSystemState state;
    
    public TrafficLightSystemImpl(){
        initialize();
    }
    
    //create the set of 4 traffic lights
    private void initialize(){
        TrafficLight westLight = new TrafficLightImpl(TrafficLightDirection.WEST);
        TrafficLight eastLight = new TrafficLightImpl(TrafficLightDirection.EAST);
        TrafficLight northLight = new TrafficLightImpl(TrafficLightDirection.NORTH);
        TrafficLight southLight = new TrafficLightImpl(TrafficLightDirection.SOUTH);
        this.eastWestLights = new TrafficLightSetImpl(eastLight, westLight);
        this.northSouthLights = new TrafficLightSetImpl(northLight, southLight);
        this.state = TrafficLightSystemState.STOPPED;
    }
    
    //start the system by initializing the light sets, one of them red and the other to green
    @Override
    public void start() throws SystemAlreadyRunningException {
        if (this.state.equals(TrafficLightSystemState.RUNNING)){
            throw new SystemAlreadyRunningException();
        }
        this.eastWestLights.initialize(TrafficLightColor.GREEN);
        this.northSouthLights.initialize(TrafficLightColor.RED);
        this.state = TrafficLightSystemState.RUNNING;
    }
    
//    @Override
//    public void advance() throws SystemNotRunningException {
//        this.advance(false);
//    }
    
    @Override
    public void advance() throws SystemNotRunningException {
        if ( this.state.equals(TrafficLightSystemState.STOPPED ) ){
            throw new SystemNotRunningException();
        }
        
//        if (!isGreenToYellow) {
//            this.eastWestLights.advance();
//            this.northSouthLights.advance();
//        }
//        else{
            if (this.eastWestLights.getLight1().getColor().equals(TrafficLightColor.GREEN) && this.eastWestLights.getLight2().getColor().equals(TrafficLightColor.GREEN)){
                this.eastWestLights.advance();
            }
            else if (this.northSouthLights.getLight1().getColor().equals(TrafficLightColor.GREEN) && this.northSouthLights.getLight2().getColor().equals(TrafficLightColor.GREEN)){
                this.northSouthLights.advance();
            }
            else{
               this.eastWestLights.advance();
                this.northSouthLights.advance(); 
            }
        //}
    }

    //stop the system in progress
    @Override
    public void stop() throws SystemNotRunningException {
       if ( this.state.equals(TrafficLightSystemState.STOPPED ) ){
            throw new SystemNotRunningException();
        }
        this.state = TrafficLightSystemState.STOPPED;
    }
    
    @Override
    public String toString() {
        StringBuilder lightSb = new StringBuilder();
        
        String northColor = this.northSouthLights.getLight1().getColor().toString();
        String southColor = this.northSouthLights.getLight2().getColor().toString();
        String eastColor = this.eastWestLights.getLight1().getColor().toString();
        String westColor = this.eastWestLights.getLight2().getColor().toString();
        
        lightSb.append("North: ").append(northColor).append('\n');
        lightSb.append("West: ").append(westColor).append('\n');
        lightSb.append("East: ").append(eastColor).append('\n');
        lightSb.append("South: ").append(southColor).append('\n');
        
        return lightSb.toString();
    }
}
