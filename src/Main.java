import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę?");
        int[] tab = {1, 2, 3, 4, 5, 6};
        int element = scanner.nextInt();
            int indexNum = getArrayIndex(tab, element);
            if (indexNum == 0) {
                System.out.println("Poza tablicą!");
            } else {
                System.out.print(element + " jest pod indexem: " + indexNum);
            }
    }

    public static int getArrayIndex(int[] tab, int element) {
        int k = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == element) {
                k = i;
                break;
            }
        }
        return k;
    }
}
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

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */