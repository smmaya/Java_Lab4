import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
    /* zad.2
       a) stworzyć dowolny przykład z NullPointerException,
       b) stworzyć dowolny przykład z ArithmeticException ,
       c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
        */
        String ciagZnakow = null;
        try {
            System.out.println(ciagZnakow.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException - brak wartości.");
        }

        int dzielenie;
        try {
            dzielenie = 2 / 0;
            System.out.println(dzielenie);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException - dzielenie przez 0");
            System.out.println("Division " + e.getMessage() + ".");
        }

        Scanner scanner = new Scanner(System.in);
        int[] tab = {2, 4, 6, 8, 10, 12};
        System.out.println("Tablica: " + Arrays.toString(tab));
        System.out.println("Wpisz numer indexu aby wyświetlic jego wartość: ");
        try {
            int element;
            while (true) {
                /* dopóki sprawdzasz poprawne indeksy jedziesz dalej,
                po wywołaniu któregoś z wyjątków, program kończy pracę */
                element = Integer.parseInt(scanner.next());
                System.out.println("Ten indeks ma wartość: " + tab[element]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks nie należy do tablicy!");
        } catch (NumberFormatException e) {
            System.out.println("Wpisałeś/aś coś, co nie jest liczbą całkowitą!");
        } finally {
            System.out.println("Do zobaczenia.");
        }

    }
}
