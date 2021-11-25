package com.task;

public class Distance {

    private final double DISTANCE; // В метрах

    {
        DISTANCE = 4500.5050;
    }

    private static class Converter {
        private static double toMillimeters() {
            Distance millimeters = new Distance();
            return millimeters.DISTANCE * 1000;
        }

        private static double toCentimeters() {
            Distance centimeters = new Distance();
            return centimeters.DISTANCE * 100;
        }

        private static double toDecimeters() {
            Distance decimeters = new Distance();
            return decimeters.DISTANCE * 10;
        }

        private static double toKilometers() {
            Distance kilometers = new Distance();
            return kilometers.DISTANCE * 0.001;
        }

        private static double toMiles() {
            Distance miles = new Distance();
            return miles.DISTANCE * 0.000621371;
        }
    }

    public double getDISTANCE() {
        return DISTANCE;
    }

    void print() {
        System.out.println("Дистанція, яка була в метрах: " + getDISTANCE() + " м" + " \uD83D\uDCD0\n");
        System.out.println("В міліметрах: " + Converter.toMillimeters() + " мм");
        System.out.println("В сантиметрах: " + Converter.toCentimeters() + " см");
        System.out.println("В дециметрах: " + Converter.toDecimeters() + " дц");
        System.out.println("В кілометрах: " + Converter.toKilometers() + " км");
        System.out.println("В милях: " + Converter.toMiles() + " мл");
    }
}
