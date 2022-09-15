//Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2
// arrays als parameter en een translate functie;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private Map<Integer, String> numericAlpha = new HashMap<>();

    public Translator(int[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // geen getter nodig, want we gaan die via constructor opvragen
    // geen setter nodig want we gaan de hashmap niet aanpassen, alleen er iets uit op halen

    // methods
    public String translate(Integer number) {
        return "The translation of your number " + number + " in text is: " + numericAlpha.get(number);
    }
}




