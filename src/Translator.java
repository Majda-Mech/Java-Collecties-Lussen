//Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2
// arrays als parameter en een translate functie;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    //    final toegevoegd op aanraden van intelliJ omdat we deze hashMap niet meer mogen veranderen
    private final Map<Integer, String> hashMapWithNumbers = new HashMap<>();


    public Translator() {
        hashMapWithNumbers.put(1, "one");
        hashMapWithNumbers.put(2, "two");
        hashMapWithNumbers.put(3, "three");
        hashMapWithNumbers.put(4, "four");
        hashMapWithNumbers.put(5, "five");
        hashMapWithNumbers.put(6, "six");
        hashMapWithNumbers.put(7, "seven");
        hashMapWithNumbers.put(8, "eight");
        hashMapWithNumbers.put(9, "nine");
        hashMapWithNumbers.put(0, "zero");
    }

    // omdat we iets uit de hashmap willen opvragen vanuit main moeten we hier een getter toevoegen
    public Map<Integer, String> getNumbers() {
        return hashMapWithNumbers;
    }

    // geen setter nodig want we gaan de hashmap niet aanpassen, alleen er iets uit op halen

    public void translate(int askedNumber) {
        System.out.println("Your number in text is: " + hashMapWithNumbers.get(askedNumber));
    }

} // closing class
