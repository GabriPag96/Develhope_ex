package Ex_36;

public class Rettangolo implements Forma {

    private double base;
    private double altezza;
    private final TipoForma rettangolo;

    public Rettangolo(double base, double altezza, TipoForma Rettangolo){
        this.base = base;
        this.altezza = altezza;
        this.rettangolo = Rettangolo;
    }

    @Override
    public String toString(){
        return "base =" + base +
                ", altezza =" + altezza +
                ", area =" + calcolaArea() +
                ", forma =" + rettangolo;
    }

    @Override
    public double calcolaArea(){
        return base * altezza;
    }
}
