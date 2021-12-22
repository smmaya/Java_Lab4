import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dom domek = new Dom();
        domek.setObecnyRok(LocalDate.now().getYear());
        domek.setRokBudowy(1973);
        domek.setKolor(KolorEnum.Czerwony);
        domek.setAdres("ul. Gdańska 50, 80-888");
        System.out.println("Wiek budynku: " + domek.wiekDomu(domek.getObecnyRok(), domek.getRokBudowy()));
        domek.liczbaMieszkancow(1200);
        domek.liczbaOkien(125);
        System.out.println("Kolor domu: " + domek.getKolor());
        System.out.println(domek);
        System.out.println("");

        Budynek budynek = new Dom();
        ((Dom) budynek).setObecnyRok(LocalDate.now().getYear());
        ((Dom) budynek).setRokBudowy(1921);
        ((Dom) budynek).setKolor(KolorEnum.Zielony);
        System.out.println("Powierzchnia: " + budynek.powierzchnia(250.76) + " m2");
        System.out.println("Kolor domu: " + ((Dom) budynek).getKolor());
        System.out.println("Adres: " + budynek.adresBudynku("ul. Jagiellońska 10, 80-333 Gdańsk"));
        budynek.liczbaMieszkancow(300);
        budynek.liczbaOkien(99);
        System.out.println(budynek);
    }
        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        c) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

}