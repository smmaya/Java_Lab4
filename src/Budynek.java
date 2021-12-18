public interface Budynek {
    double powierzchnia(double pow);

    String adresBudynku(String adres);

    void liczbaOkien(int liczbaOkien);

    void liczbaMieszkancow(int liczbaMieszkancow);

    KolorEnum kolorDomu(KolorEnum kolor);

    int wiekDomu(int obecnyRok, int rokBudowy);

    void setRokBudowy(int rokBudowy);

    void setObecnyRok(int obecnyRok);
}

