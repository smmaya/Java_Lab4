import java.time.LocalDate;

public class Dom implements Budynek {
    private double pow;
    private String adres;
    private int ileOkien;
    private int iluMieszkancow;
    private KolorEnum kolor;
    private int rokBudowy;
    private int obecnyRok;
    private int wiek;

    public Dom(double pow, String adres, int ileOkien, int iluMieszkancow, KolorEnum kolor, int rokBudowy, int obecnyRok) {
        this.pow = pow;
        this.adres = adres;
        this.ileOkien = ileOkien;
        this.iluMieszkancow = iluMieszkancow;
        this.kolor = kolor;
        this.rokBudowy = rokBudowy;
        this.obecnyRok = obecnyRok;
    }

    public Dom() {
    }

    @Override
    public String toString() {
        return "Dom: {" + "adres: " + adres +
                "rok budowy= " + rokBudowy +
                ", wiek budynku= " + (obecnyRok - rokBudowy) +
                ", liczba mieszkańców= " + iluMieszkancow +
                ", ilość okien= " + ileOkien + " kolor domu: " + kolor +
                '}';
    }

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int ileOkien) {
        this.ileOkien = ileOkien;
        return ileOkien;
    }

    @Override
    public void liczbaMieszkancow(int iluMieszkancow) {
        this.iluMieszkancow = iluMieszkancow;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public int wiekDomu(int obecnyRok, int rokBudowy) {
        this.obecnyRok = obecnyRok;
        this.rokBudowy = rokBudowy;
        return obecnyRok - rokBudowy;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getIleOkien() {
        return ileOkien;
    }

    public void setIleOkien(int ileOkien) {
        this.ileOkien = ileOkien;
    }

    public int getIluMieszkancow() {
        return iluMieszkancow;
    }

    public void setIluMieszkancow(int iluMieszkancow) {
        this.iluMieszkancow = iluMieszkancow;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
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

}
