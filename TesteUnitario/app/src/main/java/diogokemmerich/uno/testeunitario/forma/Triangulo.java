package diogokemmerich.uno.testeunitario.forma;

public class Triangulo extends Forma{
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA_TRIANGULO = 3;
    private static final int TRIANGULO_LADO_UM = 0;
    private static final int TRIANGULO_LADO_DOIS = 1;
    private static final int TRIANGULO_LADO_TRES = 2;

    public Triangulo(){
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA_TRIANGULO);
    }

    @Override
    public double area() {
        double perimetro     = getMedida(TRIANGULO_LADO_UM)
                + getMedida(TRIANGULO_LADO_DOIS)
                + getMedida(TRIANGULO_LADO_TRES);

        double semiPerimetro = perimetro / 2;

        double area          = semiPerimetro * (semiPerimetro - getMedida(TRIANGULO_LADO_UM))
                * (semiPerimetro - getMedida(TRIANGULO_LADO_DOIS))
                * (semiPerimetro - getMedida(TRIANGULO_LADO_TRES));

        return Math.sqrt(area);
    }
}
