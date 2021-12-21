
public class Student implements StudentI{
    private int indeks;
    private String imie;
    private String nazwisko;
    private int wiek;
    private String seks;

    public Student(int indeks, String imie, String nazwisko, int wiek, String seks) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.seks = seks;
    }

    @Override
    public String seks(String seks) {
        return seks;
    }

    @Override
    public int wiek(int wiek) {
        return wiek;
    }

    @Override
    public int indeks(int indeks) {
        return indeks;
    }

    @Override
    public String imie(String imie) {
        return imie;
    }

    @Override
    public String nazwisko(String nazwisko) {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
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
        return "Student: " + indeks + ", " + imie + " " + nazwisko + ", wiek: " + wiek + ", " + seks;
    }
}
