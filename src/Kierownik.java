
public class Kierownik implements PracownikI{

    private String dzial;
    private String imie;
    private String nazwisko;

    public Kierownik(String dzial, String imie, String nazwisko) {
        this.dzial = dzial;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public int wiek(int wiek) {
        return 0;
    }

    @Override
    public String seks(String seks) {
        return null;
    }

    @Override
    public int badge(int badge) {
        return 0;
    }

    @Override
    public String imie(String imie) {
        return null;
    }

    @Override
    public String nazwisko(String nazwisko) {
        return null;
    }

    public String getDzial() {
        return dzial;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Kierownik: " + dzial + ", " + imie + " " + nazwisko;
    }
}
