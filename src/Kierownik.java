
public class Kierownik implements PracownikI{

    private Object pracownik;
    private int badge;
    private String typUmowy;
    private double stawkaGodzinowa;

    public Kierownik(Object pracownik) {
        this.pracownik = pracownik;
    }

    @Override
    public String imie(String imie) {
        return imie;
    }

    @Override
    public String nazwisko(String nazwisko) {
        return nazwisko;
    }

    @Override
    public int badge(int badge) {
        return badge;
    }

    @Override
    public String typUmowy(String typUmowy) {
        return typUmowy;
    }

    @Override
    public double stawkaGodzinowa(double stawkaGodzinowa) {
        return stawkaGodzinowa;
    }

    @Override
    public String toString() {
        return "Kierownik: " + pracownik;
    }
}
