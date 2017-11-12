/* OPGAVE 2.1
Opgavebeskrivelsen lyder: Write a program that reads a miles in a double value from the console, then converts it to
kilometers and display the result. The formula for the conversion is as follow: 1 mile = 1.6 kilometres */

package dk.n4; //Package

import java.util.Scanner; //Importerer klassen "Scanner" til senere brug

public class Opgave2_1 { //Angiver access modifier og navnet på klassen

    public static void main(String[] args) { //Main-metoden eksekveres

        System.out.print("Enter miles: "); //Udskriver tekst i konsollen

        //Opretter objekt ved navn "input" i klassen "Scanner" og initialiserer det som en ny scanner
        Scanner input = new Scanner(System.in);

        double miles = input.nextDouble(); //Deklarerer variablen "miles" og initialiserer den med indholdet af "input"

        double kilometres = miles * 1.6; //Deklarerer variablen "kilometres" - initialiseres til konverterede miles->km

        //Udprinter tekststreng bl.a. med indhold af variablen "kilometres". Altså hvad de indtastede miles er i km.
        System.out.println(miles + " miles is " + kilometres + " kilometres.");

    } //Main-metoden afsluttes

} //Klassen afsluttes
