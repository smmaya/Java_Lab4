import java.time.LocalDate;

public class Dom implements Budynek{

    private int rokBudowy;
    private int obecnyRok;
    private int lMieszkancow;
    private int lOkien;

    @Override
    public double powierzchnia(double pow) {
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }

    @Override
    public void liczbaOkien(int liczbaOkien) {
        this.lOkien = liczbaOkien;
    }

    @Override
    public void liczbaMieszkancow(int liczbaMieszkancow) {
        this.lMieszkancow = liczbaMieszkancow;
    }

    @Override
    public KolorEnum kolorDomu(KolorEnum kolor) {
        return kolor;
    }

    @Override
    public int wiekDomu(int obecnyRok, int rokBudowy) {
        return obecnyRok - rokBudowy;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    public int getObecnyRok() {
        return obecnyRok;
    }

    public void setObecnyRok(int obecnyRok) {
        this.obecnyRok = obecnyRok;
    }

    @Override
    public String toString() {
        return "Dom: {" +
                "rok budowy= " + rokBudowy +
                ", wiek budynku= " + (obecnyRok-rokBudowy) +
                ", liczba mieszkańców= " + lMieszkancow +
                ", ilość okien= " + lOkien +
                '}';
    }
}
