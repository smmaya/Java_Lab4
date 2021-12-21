
public class AniolyOrazDemony extends Stworzenie{

    private String typ;
    private String ksywa;

    public AniolyOrazDemony(String typ, String ksywa) {
        this.typ = typ;
        this.ksywa = ksywa;
    }

    @Override
    public String toString() {
        return "Stworzenie: " + typ + ", " + ksywa;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKsywa() {
        return ksywa;
    }

    public void setKsywa(String ksywa) {
        this.ksywa = ksywa;
    }
}
