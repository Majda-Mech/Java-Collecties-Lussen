//Opdrachtbeschrijving
// Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.). Je gaat die getallen vertalen door gebruik te maken van een HashMap. Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap. Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit de HashMap te vragen met de bijbehorende sleutel en dat terug te geven aan de gebruiker.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Give a number (0 - 9):");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        System.out.println("Your number is: " + number);

        // je kan hier niet direct het nummer opvragen via hashMapWithNumbers.get(number); dan zegt intelliJ iets over static methods.
        // je kan ook niet direct de translate functie aanroepen, want die is niet bekend hier in main.
        // Dus dan moet je eerst een instance van de class Translator maken en daar kan je dan weer de translate functie over roepen.
        Translator trans = new Translator();
        trans.translate(number);
    }

}