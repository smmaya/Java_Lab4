
public class AniolyOrazDemony extends Stworzenie{

    private String imie;
    private String typ;
    private String ksywa;

    public AniolyOrazDemony(String imie, String typ, String ksywa) {
        this.imie = imie;
        this.typ = typ;
        this.ksywa = ksywa;
    }

    @Override
    public String toString() {
        return "Stworzenie: " + imie + " - " + typ + ", " + ksywa;
    }
}
