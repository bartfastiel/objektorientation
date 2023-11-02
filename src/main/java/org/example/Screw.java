package org.example;

public class Screw {

    String type;
    int length;
    double width;

    public Screw(String type, int length, double width) {
        System.out.println("Neue Schraube wird definiert");
        this.type = type;
        this.length = length;
        this.width = width;
    }

}
