
public class Pracownik implements PracownikI{
    private int badge;
    private String imie;
    private String nazwisko;
    private String typUmowy;
    private double stawkaGodzinowa;

    public Pracownik(int badge, String imie, String nazwisko, String typUmowy, double stawkaGodzinowa) {
        this.badge = badge;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.typUmowy = typUmowy;
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    @Override
    public String imie(String imie) {
        this.imie = imie;
        return imie;
    }

    @Override
    public String nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return nazwisko;
    }

    @Override
    public int badge(int badge) {
        this.badge = badge;
        return badge;
    }

    @Override
    public String typUmowy(String typUmowy) {
        this.typUmowy = typUmowy;
        return typUmowy;
    }

    @Override
    public double stawkaGodzinowa(double stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
        return stawkaGodzinowa;
    }

    @Override
    public String toString() {
        return "Pracownik: " + badge + ", " + imie + " " + nazwisko +
                ", typ umowy: " + typUmowy + ", stawka godzinowa: " + stawkaGodzinowa;
    }
}
