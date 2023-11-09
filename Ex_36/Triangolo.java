package Ex_36;

public class Triangolo implements Forma{

    private double base;
    private double altezza;
    private final TipoForma triangolo;

    public Triangolo(double base, double altezza, TipoForma triangolo){
        this.base = base;
        this.altezza = altezza;
        this.triangolo = triangolo;
    }

    @Override
    public String toString(){
        return "base =" + base +
                ", altezza =" + altezza +
                ", area =" + calcolaArea() +
                ", tipo =" + triangolo;
    }

    @Override
    public double calcolaArea(){
       return (base * altezza)/2;
    }
}
