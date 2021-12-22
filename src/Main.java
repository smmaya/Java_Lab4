import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student student1 = new Student(1029, "Adam", "Adamski", "IT", "Programowanie");
        Student student2 = new Student(1938, "Bartek", "Bartecki", "IS", "Sieci");
        System.out.println("> Wypisujemy studentów:");
        System.out.println(student1);
        System.out.println(student2);
        Pracownik pracownik1 = new Pracownik(11, "Celina", "Celińska", "UoP", 29.90);
        Pracownik pracownik2 = new Pracownik(22, "Daria", "Daruńska", "B2B", 17.50);
        Pracownik pracownik3 = new Pracownik(33, "Wojciech", "Wojciński", "B2B", 22.90);
        Pracownik pracownik4 = new Pracownik(44, "Gabriela", "Gabarska", "Zlecenie", 30);
        System.out.println("\n> Wypisujemy pracowników:");
        System.out.println(pracownik1);
        System.out.println(pracownik2);
        System.out.println(pracownik3);
        System.out.println(pracownik4);
        Kierownik kierownik1 = new Kierownik(pracownik1);
        Kierownik kierownik2 = new Kierownik(student2);
        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);
        listaPracownikow.add(pracownik4);
        listaPracownikow.add(kierownik1);
        listaPracownikow.add(kierownik2);
        System.out.println("\n> Wypisujemy pętlą pracowników i kierowników:");
        for (PracownikI pracownicy : listaPracownikow) {
            System.out.println(pracownicy);
        }
        AniolyOrazDemony aniol = new AniolyOrazDemony("Gabriel","Archanioł", "Ratownik Dusz");
        AniolyOrazDemony diabel = new AniolyOrazDemony("Belzebub", "Diabeł", "Żniwiarz Dusz");
        System.out.println("\n> Wypisujemy anioły i demony:");
        System.out.println(aniol);
        System.out.println(diabel);
    }
}