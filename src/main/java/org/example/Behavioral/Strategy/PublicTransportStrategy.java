package org.example.Behavioral.Strategy;

class PublicTransportStrategy implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Public transport route from " + from + " to " + to + ": 3 km, 5 min");
    }
}
