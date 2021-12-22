import java.util.*;

public class Zad1 {

    public static void main(String[] args) {
        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę od 0 do 5?");
            int[] tab = {1, 2, 3, 4, 5, 6};
            try {
                int element = scanner.nextInt();
                try {
                    int number = tab[element];
                    System.out.println("Wartość tego indeksu to: " + number);
                    return;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index nie mieści się w przedziale!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbę a nie literę!");
            }
        }

    }
}


