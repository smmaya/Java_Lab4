public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(2);
        double poleKwadratu = kwadrat.pole();
        double obwodKwadratu = kwadrat.obwod();
        String figuraKwadrat = kwadrat.getClass().getCanonicalName();
        System.out.println("\n" + kwadrat.nazwaFigury(figuraKwadrat) +
                " o polu: " + poleKwadratu + " i obwodzie: " + obwodKwadratu);

        Prostokat prostokat = new Prostokat(3, 4);
        double poleprostokata = prostokat.pole();
        double obwodprostokata = prostokat.obwod();
        String figuraProstokat = prostokat.getClass().getCanonicalName();
        System.out.println(kwadrat.nazwaFigury(figuraProstokat) +
                " o polu: " + poleprostokata + " i obwodzie: " + obwodprostokata + "\n");

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

    }
}
