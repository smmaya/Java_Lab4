
public class Student implements StudentI{
    private int indeks;
    private String imie;
    private String nazwisko;
    private String dzial;
    private String specjalizacja;

    public Student(int indeks, String imie, String nazwisko, String dzial, String specjalizacja) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
        this.specjalizacja = specjalizacja;
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
    public int indeks(int indeks) {
        this.indeks = indeks;
        return indeks;
    }

    @Override
    public String dzial(String dzial) {
        this.dzial = dzial;
        return dzial;
    }

    @Override
    public String specjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
        return specjalizacja;
    }

    @Override
    public String toString() {
        return "Student: " + indeks + ", " + imie + " " + nazwisko +
                ", dział: " + dzial + ", specjalizacja: " + specjalizacja;
    }
}
