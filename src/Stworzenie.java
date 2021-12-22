
public class Stworzenie implements CzlowiekI, PracownikI, StudentI{

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
    public int indeks(int indeks) {
        return indeks;
    }

    @Override
    public String dzial(String dzial) {
        return dzial;
    }

    @Override
    public String specjalizacja(String specjalizacja) {
        return specjalizacja;
    }
}
