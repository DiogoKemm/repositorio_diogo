package diogokemmerich.uno.conceitosclassesabstrataseinterfaces.formas;

import static java.lang.Math.PI;

public class Circunferencia extends Forma {
    public Circunferencia(double raio) {
        super(1);
        setRaio(raio); // ajuste da medida do raio
    }

    @Override
    public double area() {
        return PI * Math.pow(getMedida(0), 2);
    }

    public void setRaio(double raio) {
        setMedida(0, raio);
    }

    public static int comparador(Circunferencia a, Circunferencia b) {
        return (int) (a.area() - b.area());
    }

    public int comparador2(Circunferencia b) {
        return (int) (this.area() - b.area());
    }
}
