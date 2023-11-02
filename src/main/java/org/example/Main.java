package org.example;

public class Main {
    public static void main(String[] args) {

        String screw1Type = "torx";
        int screw1Length = 50;
        double screw1Width = 4.0;

        String screw2Type = "torx";
        int screw2Length = 50;
        double screw2Width = 5.0;

        printScrew(screw1Type, screw1Length, screw1Width);
        printScrew(screw2Type, screw2Length, screw2Width);

    }

    public static void printScrew(String type, int length, double width) {
        System.out.println("Schraube mit Kopf " + type + ", Länge " + length + " Breite " + width);
    }
}








