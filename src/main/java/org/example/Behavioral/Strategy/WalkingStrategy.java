package org.example.Behavioral.Strategy;

class WalkingStrategy implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Walking route from " + from + " to " + to + ": 4 km, 30 min");
    }
}
