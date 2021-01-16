
import com.mycompany.trafficlightsystem.impl.*;
import com.mycompany.trafficlightsystem.interfaces.*;

public class Main {

    //TODO add UI for lights, add test cases, add left turn arrows
    public static void main(String[] args) {
        TrafficLightSystem system = new TrafficLightSystemImpl();
        try {
            system.start();
            System.out.println(system.toString());
            system.advance();
            System.out.println(system.toString());
            system.advance();
            System.out.println(system.toString());
            system.advance();
            System.out.println(system.toString());
            system.advance();
            System.out.println(system.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    } 
}
