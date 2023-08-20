package org.example.Behavioral.Strategy;

class Navigator<T extends RouteStrategy> {
    private T routeStrategy;

    public Navigator(T routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void route(String from, String to) {
        routeStrategy.buildRoute(from, to);
    }
}
