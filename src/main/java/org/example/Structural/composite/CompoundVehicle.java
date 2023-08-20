package org.example.Structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundVehicle extends BaseVehicle {

    protected List<Vehicle> parts = new ArrayList<>();

    public CompoundVehicle(Vehicle... components) {
        super(0, 0);
        add(components);
    }

    public void add(Vehicle... components) {
        parts.addAll(Arrays.asList(components));
    }

}
