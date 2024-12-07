package org.example.lab5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TransportService {
    private List<Route> routes;

    public TransportService() {
        this.routes = new ArrayList<>();
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public static class Route {
        private String number;
        private LocalTime departureTime;
        private double cost;

        public Route(String number, LocalTime departureTime, double cost) {
            this.number = number;
            this.departureTime = departureTime;
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public LocalTime getDepartureTime() {
            return departureTime;
        }

        public double getCost() {
            return cost;
        }
    }
}
