package  Ex_32_33;

public class Triangolo extends Forma{
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        double area = (base * altezza)/2 ;
        return area;
    }
}
