
public class Kwadrat extends Figura{

    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    double pole() {
        return (bok * bok);
    }

    @Override
    double obwod() {
        return (4 * bok);
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
}