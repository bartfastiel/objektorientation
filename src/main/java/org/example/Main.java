package org.example;

public class Main {
    public static void main(String[] args) {

        Screw screw1 = new Screw("torx", 50, 4.0);
        Screw screw2 = new Screw("torx", 50, 5.0);
        Screw screw3 = new Screw("kreuzschlitz", 40, 3.0);

        printScrew(screw1);
        printScrew(screw2);
        printScrew(screw3);

    }

    public static void printScrew(Screw screw) {
        System.out.println("Schraube mit Kopf " + screw.type + ", Länge " + screw.length + " Breite " + screw.width);
    }
}








