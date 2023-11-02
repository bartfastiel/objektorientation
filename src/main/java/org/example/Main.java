package org.example;

public class Main {
    public static void main(String[] args) {

        Screw screw1 = new Screw();
        screw1.type = "torx";
        screw1.length = 50;
        screw1.width = 4.0;

        Screw screw2 = new Screw();
        screw2.type = "torx";
        screw2.length = 50;
        screw2.width = 5.0;

        Screw screw3 = new Screw();
        screw3.type = "kreuzschlitz";
        screw3.length = 40;
        screw3.width = 3.0;

        printScrew(screw1);
        printScrew(screw2);
        printScrew(screw3);

    }

    public static void printScrew(Screw screw) {
        System.out.println("Schraube mit Kopf " + screw.type + ", Länge " + screw.length + " Breite " + screw.width);
    }
}








