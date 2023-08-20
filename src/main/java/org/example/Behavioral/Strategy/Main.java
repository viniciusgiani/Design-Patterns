package org.example.Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Navigator<RouteStrategy> walkingNavigator = new Navigator<>(new WalkingStrategy());
        walkingNavigator.route("Home", "Club");
        walkingNavigator.route("Club", "Work");

        Navigator<RouteStrategy> transportNavigator = new Navigator<>(new PublicTransportStrategy());
        transportNavigator.route("Home", "Club");
        transportNavigator.route("Club", "Work");
    }
}
