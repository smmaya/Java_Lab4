public class Dom implements BudynekI {
    private double pow;
    private String adres;
    private int ileOkien;
    private int iluMieszkancow;
    private KolorEnum kolor;
    private int rokBudowy;
    private int obecnyRok;

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

    @Override
    public String toString() {
        return "\nBudynek o powierzchni całkowitej: " + pow + " m2\n" +
                "Lokalizacja: " + adres + "\n" +
                "Liczba mieszkańców: " + iluMieszkancow + "\n" +
                "Ilość okien: " + ileOkien + "\n" +
                "Kolor fasady: " + kolor + "\n" +
                "Rok budowy: " + rokBudowy +
                " -> wiek budynku: " + (obecnyRok - rokBudowy) + formattedText();
    }

    public String formattedText() {
        if (obecnyRok - rokBudowy == 0) {
            return " budynek jeszcze nie powstał!";
        } else if (obecnyRok - rokBudowy == 1) {
            return " rok.";
        } else if (obecnyRok - rokBudowy == 2 || obecnyRok - rokBudowy == 3 || obecnyRok - rokBudowy == 4) {
            return " lata.";
        }
        return " lat.";
    }
}
