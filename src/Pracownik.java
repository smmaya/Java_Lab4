
public class Pracownik implements PracownikI{
    private int badge;
    private String imie;
    private String nazwisko;
    private int wiek;
    private String seks;

    public Pracownik(int badge, String imie, String nazwisko, int wiek, String seks) {
        this.badge = badge;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.seks = seks;
    }

    @Override
    public String seks(String _seks) {
        return _seks;
    }

    @Override
    public int wiek(int _wiek) {
        return _wiek;
    }

    @Override
    public int badge(int _badge) {
        return 0;
    }

    @Override
    public String imie(String _imie) {
        return null;
    }

    @Override
    public String nazwisko(String _nazwisko) {
        return null;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
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

    public int getWiek() {
        return wiek;
    }

    public String getSeks() {
        return seks;
    }

    @Override
    public String toString() {
        return "Pracownik: " + badge + ", " + imie + " " + nazwisko + ", wiek: " + wiek + ", " + seks;
    }
}
