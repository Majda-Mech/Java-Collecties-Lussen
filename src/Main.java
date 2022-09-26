//done..

//Opdrachtbeschrijving
// Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.). Je gaat die getallen vertalen door gebruik te maken van een HashMap. Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap. Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit de HashMap te vragen met de bijbehorende sleutel en dat terug te geven aan de gebruiker.
// done..

import java.util.Scanner;

public class Main {
    //In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object;git

    public static void main(String[] args) {
        //De variabelen zijn in de constructor benoemd. Als je ze in de class hierboven benoemt, dan kan de code er niet bij, tenzij hij deze variabelen ook static maakt, net als main method.
        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        boolean play = true;
        String invalid = "invalid input";

        Translator translator = new Translator(numeric, alphabetic);
        Scanner scanner = new Scanner(System.in);

        while (play) {
            System.out.println("\nType 'x' to stop\nType 'v' to translate");
            String input = scanner.nextLine().toLowerCase();

            int number;
            if (input.equals("x")) {
                System.out.println("Good bye");
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Give a number (0 - 9):");
                number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println(result);
                } else {
                    System.out.println(invalid);
                }
            } else {
                System.out.println(invalid);
            }
        }
    }
}
