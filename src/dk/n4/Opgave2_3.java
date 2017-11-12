/* OPGAVE 2.3
Opgavebeskrivelsen lyder: Write a program that reads a number in meters, convert it to feet, and display the result.
One meter is 3.2786 feet */

package dk.n4;

import java.util.Scanner; //Importerer klassen "Scanner" til senere brug

public class Opgave2_3 { //Angiver access modifier og navnet på klassen

    public static void main(String[] args) { //Main-metoden eksekveres

        System.out.print("Enter a value for meter: "); //Udskriver tekst i konsollen

        //Opretter objekt ved navn "input" i klassen "Scanner" og initialiserer det som en ny scanner
        Scanner input = new Scanner(System.in);

        double meters = input.nextDouble(); //Deklarerer variablen "meters" og initialiserer den til at være inputtet

        double feet = meters * 3.2786; //Deklarerer variablen "feet" og initialiserer den med udregning (m til feet)

        System.out.println(meters + " meters is " + feet + " feet."); //Udprinter tekststreng med resultatet

    } //Main lukkes

} //Klassen lukkes
