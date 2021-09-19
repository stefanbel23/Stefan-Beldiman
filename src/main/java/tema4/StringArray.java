package tema4;

import java.util.Arrays;

class StringArray {
    public static void main(String[] args) {

        String[] buildAircraft;
        String newAircraft = "";

        buildAircraft = new String[]{"Wings ", "Fuselage ", "Cockpit ", "Flaps ", "Tail ", "LandingGear"};

        for (int i=0; i<buildAircraft.length; i++) {
         newAircraft += buildAircraft [i];
        }
        System.out.println(newAircraft);
    }
}
