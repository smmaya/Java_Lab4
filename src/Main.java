import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Użycie domyślnego konstruktora
        Dom domek1 = new Dom();
        // deklaracja poprzez settery
        domek1.setObecnyRok(LocalDate.now().getYear());
        domek1.setRokBudowy(1973);
        domek1.setKolor(KolorEnum.Czerwony);
        domek1.setAdres("ul. Gdańska 50, 81-888 Gdynia");
        domek1.liczbaMieszkancow(1200);
        domek1.liczbaOkien(125);
        domek1.setPow(1275.98);
        // Użycie konstruktowa z parametrami
        Dom domek2 = new Dom(1988.50, "ul. Sopocka 12, 82-000 Sopot", 399, 75, KolorEnum.Zielony, 2017, LocalDate.now().getYear());
        // Wypisanie danych o domach metodą toString()
        System.out.println(domek1);
        System.out.println(domek2);

        BudynekI budynek = new Dom();
        // Deklaracja poprzez settery
        ((Dom) budynek).setObecnyRok(LocalDate.now().getYear());
        ((Dom) budynek).setRokBudowy(2020);
        ((Dom) budynek).setKolor(KolorEnum.Szary);
        ((Dom) budynek).setPow(2250.76);
        ((Dom) budynek).setAdres("ul. Jagiellońska 10, 80-333 Gdańsk");
        ((Dom) budynek).setIluMieszkancow(300);
        ((Dom) budynek).setIleOkien(99);
        // Wypisanie danych o budynku metodą toString()
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