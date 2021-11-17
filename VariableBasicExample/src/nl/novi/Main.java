package nl.novi;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // Aanmaken van variabelen + waarde toewijzen
        int teacherAge = 25; // type van variabele: int, naam van variabele: teacherAge, waarde van variable 25

        // Weergeven van een variabele
        System.out.println("De leeftijd is: " + teacherAge);

        // Aanpassen van variabelen (type van variabele is dan niet meer nodig)
        //teacherAge = 37;
        teacherAge++;
        teacherAge = teacherAge + 1;
        System.out.println("De leeftijd is: " + teacherAge);

        // Keuzeconstructie. Je kan eerst de voorwaarde in een boolean opslaan
        //boolean teacherOld = teacherAge > 35; // Voorwaarde is: teacherAge > 35 (waarde van variable teacherAge is groter dan 35)

        // Of je kan gelijk de voorwaarde in de if-statement plaatsen
        if(teacherAge > 35) { // Met boolean zou de if-statement als volgt: if(teacherOld)
            System.out.println("De docent is ouder dan 35"); // Deze regel code wordt uitgevoerd wanneer de voorwaarde WAAR (true) is
        }
        else {
            System.out.println("De docent is jonger dan 35."); // Deze regel code wordt uitgevoerd wanneer de voorwaarde ONWAAR (false) is
        }


    }
}
