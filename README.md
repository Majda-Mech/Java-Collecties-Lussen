# Opdrachtbeschrijving
Je gaat een applicatie bouwen die getallen vertaalt van numeriek (1, 2, 3, etc.) naar alfabetisch (een, twee, drie, etc.). Je gaat die getallen vertalen door gebruik te maken van een HashMap. Je zet de numerieke getallen als sleutel (key) en de alfabetische getallen als waarde (value) in de HashMap. Vervolgens vraag je de gebruiker om een input van 0 t/m 9 te geven en ga je dat "vertalen" door simpelweg de waarde uit de HashMap te vragen met de bijbehorende sleutel en dat terug te geven aan de gebruiker.

** Randvoorwaarden**
De opdracht moet voldoen aan de volgende voorwaarden:

In je main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object;
Je project bevat 1 Translator class met daarin een HashMap variabele, een constructor met 2 arrays als parameter en een translate functie;
De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.

** Stappenplan**
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:

Maak in je src-map een Main class aan. Definieer in deze Main class een public static void main (String[] args) methode.
Maak in je main methode een Integer array genaamd numeric die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
Maak in je main methode een String array genaamd alphabetic die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
Maak een nieuwe class aan en noem deze Translator.
Maak in de Translator class een Hashmap<Integer,String> variabele met de naam numericAlpha.
Maak in de Translator class een constructor die de volgende parameters krijgt: (String[] alphabetic, Integer[] numeric).
Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).
Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit numeric en alphabetic. Gebruik de i variabele uit je for-loop om de correcte waardes uit de arrays te halen.
De constructor is klaar. Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, oftewel: maak in main een nieuw object aan van het type Translator.
Maak in de Translator class een nieuwe methode genaamd translate(Integer number) die een String returnt.
In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van number
Maak in de main methode van de Main class een boolean variabele genaamd play met de waarde true. Maak een String variabele genaamd ongeldig waarin je de String "ongeldige invoer" zet. Als laatst maak je nog een nieuw Scanner object aan met Scanner scanner = new Scanner(System.in).
Vervolgens maak je een while-loop die doorgaat zolang play true is.
Print in de while-loop "Type 'x' om te stoppen \nType 'v' om te vertalen" en maak een String variabele genaamd input waarin je de waarde van scanner.nextLine() opslaat.
Maak in de body van de while-loop een if/else if/else statement.
if: Als de input "x" is, dan zet je play naar false.
else if: Als de input "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9", vervolgens sla je het resultaat van scanner.nextInt() op in een variabele int number, voeg nog een scanner.nextLine(); toe op de volgende regel (scanner.nextInt doet dit namelijk niet van zichzelf) en als laatste check je met een if-statement of
if: number kleiner is dan 10, dan sla je de waarde van translator.translate(number) op in String result en print je "De vertaling van " + number + " is " + result.
else: anders dan print je ongeldig
else: Als de input dus iets anders dan "x" of "v" is, dan print je ongeldig# Java-Collecties-Lussen
