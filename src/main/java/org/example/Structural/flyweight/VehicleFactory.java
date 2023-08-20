package org.example.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    static Map<String, VehicleType> vehicleTypeMap = new HashMap<>();

    public static VehicleType getVehicleType(String name) {
        VehicleType result = vehicleTypeMap.get(name);
        if (result == null) {
            result = new VehicleType(name);
            vehicleTypeMap.put(name, result);
        }
        return result;
    }
}
